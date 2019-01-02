var express = require('express');
var router = express.Router();
var mysql = require('mysql');

var pool = mysql.createPool({
	host : "127.0.0.1",
	port : 3306,
	user : "root",
	password : "jang4562",
	database : "test",
	connectionLimit : 20,
	waitForConnections : false
});

/* GET home page. */
router.get('/', function(req, res, next) {
  res.render('login', {});
});
router.post('/login.html', function(req, res, next) {
	var id = req.body.id;
	var email = req.body.email;

	pool.getConnection(function(err, con) {
		if(err) {
			con.release();
			throw err;
		}
		var sql = "SELECT * FROM signup where id = '" + id +"';";
		console.log(sql);
		// 결과물을 result 라는 변수이름에 저장
		con.query(sql, function(err,result) {
			if(err) {
				con.release();
				throw err;
			}
			//결과물이없으면 값이 0 으로 나타남
			if(result.length == 0) {
				res.render('login.ejs', { message : "아이디가 없습니다."});
				return;
			} else {
				// 비밀번호 검사
				var sql_email = "SELECT * FROM signup where id = '" + id +"' AND email = '"+email+"';";
				console.log(sql_email);
				/**
				 * 콜백함수 안에 콜백함수를 계속 호출하는 방식에 반복되는 경우 (callback hell현상),
				 * 프로그램의 실행 흐름을 알기 어렵다 >> 에러의 원인
				 * 
				 * async 모듈을 활용하여 프로그램의 실행 흐름을 제어할 수 있다.
				 */
				// sql_email에 대한 쿼리문을 실행해야한다.
				con.query(sql_email, function(err,result_email) {
					if(err) {
						con.release;
						throw err;
					}
					if(result_email.length == 0) {
						res.render('login.ejs', { message : "이메일이 없습니다."});
						return;
					} 
						res.render('login.ejs', {	message : "로그인 완료"});
				})
			}
		})
	});
});

router.post('/signup', function(req, res, next){
	
	/**
	 * form 태그를 활용하여 데이터를 전달 받을 때 기능 함수에서는
	 * req 객체 안에 있는 body라는 데이터 이름의 오브젝트에서
	 * 데이터를 가져올 수 있다.
	 * 
	 * 참고)
	 * 주소 : req.prams.데이터이름
	 * post : req.body.데이터이름
	 * 
	 * 예시)
	 * ( usr : "raejin", pwd : "1111" , repwd : "", gender : "남성")
	 * 
	 * 위의 오브젝트에서 usr 이라는 데이터이름의값 'raejin' 을 가져오려면
	 * 
	 * 변수 = req.body.usr;
	 * 포스트로부터 받아온 req객체 안에body라는 usr(데이터이름)의 오브젝트를 변수로 지정
	 */
	var pwd = req.body.pwd;
	var id = req.body.id;
	var email = req.body.email;

	console.log(id);
	console.log(pwd);
	console.log(email);

// [mysql연동_4] 데이터베이스 풀에서 데이터베이스 서버와의 연결을 가져온다.
	pool.getConnection(function(err, con) {
		/**
     * [mysql연동_5] 콜백함수에서 sql문을 작성한다.
     * 
     * 콜백함수의 매개변수)
     * err : 데이터베이스 연결 도중에 오류가 발생했을 경우, 에러내용이 저장
     * connection : 데이터베이스 연결 후 sql문을 실행하기 위한 객체
     */
		//[mysql연동_6] 데이터베이스 연결중 오류가 발생했다면 연결을해제하고 에러를 출력
		if(err) {
			con.release();
			throw err;
		}
		
		// 	var sql = "INSERT INTO signup(id, pwd, gender) VALUES " + "('"+usr+"','"+pwd+"','"gender"');";
		// 위에코드는 gender 데이터값으로 실행이안되서 밑에 코드로 수정처리 
		var sql = "INSERT INTO signup(id, pwd, email) VALUES " + "('"+id+"','"+pwd+"','"+email+"';";
		console.log(sql);
		//[mysql연동_7] 데이터베이스 연결 후 sql문을 실행한다.
    // connetion.query() 함수를 활용하여 sql문을 실행한다.
    // connetion.query() 함수의 매개변수는 sql문을 작성한 문자열과,
    // sql문을 실행후 결과들을 처리하기 위한 롤백함수
		con.query(sql, function(err, result){
			// 에러가 발생했을 때
			if(err) {
			con.release()	;
			throw err;
			}
			//에러가 발생하지 않음(정상적으로 sql문을 실행한 경우)
			// 처리를 완료하고 (데이터베이스에 값을 저장)
			// res.redirect('주소') : 다른주소를 지정해주는 함수
			res.redirect('/login.html');
			
		})
	


	});
	
});


module.exports = router;
