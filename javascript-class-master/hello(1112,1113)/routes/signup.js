var express = require('express');
var router = express.Router();
// dos 창에 npm install mysql --save
// [mysql연동_1] mysql 모듈을 로드한다

// [mysql연동_2] 데이터베이스 연결 pool을 만든다.
var mysql = require('mysql');
 /**
   * [mysql연동_3] 데이터베이스 연결 pool을 만들기 위한 정보들
   * host : 데이터베이스 서버의 주소 (자기 컴퓨터라면 127.0.0.1 혹은 localhost)
   * port : 데이터베이스 서비스를 위한 데이터가 입출력되는 통로의 번호, 기본 3306
   * user : 데이터베이스 서버에 접속하기 위한 아이디 (root로 접속하지 않는다)
   * password : 데이터베이스 서버에 접속하기 위한 비밀번호
   * database : 자료를 담고 있는 테이블을 모아놓은 데이터베이스 이름
   * connectionLimit : 데이터베이스 연결 개수 제한값
   * waitForConnetion : 데이터베이스 연결을 기다리는 것을 허용하는지 여부
   */
var pool = mysql.createPool({
	host : "127.0.0.1",
	port : 3306,
	user : "root",
	password : "jang4562",
	database : "test",
	connectionLimit : 20,
	waitForConnections : false
})


router.get('/', function(req, res, next) {
  res.render('signup.ejs', {});
});


// 주소 : http://127.0.0.1:3000/signup/aa
// 회원가입 form 으로 부터 전달받은 값을 처리하는 기능함수
router.post('/', function(req, res, next){
	
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
	var usr = req.body.usr;
	var pwd = req.body.pwd;
	var repwd = req.body.repwd;
	var gender = req.body.gender;

	console.log(usr);
	console.log(pwd);
	console.log(repwd);
	console.log(gender);

	if(pwd != repwd) { // 문제 1번 pwd와 repwd가 다를경우
		// 밑에 식은 error.ejs 파일이 제대로작성이 안되있기때문에 따로 html 서식을 넣고 안에 message 를 넣어줘야한다
		// res.render('error.ejs', {message : "비밀번호가 틀립니다."})
		res.redirect('http://naver.com');
		return;
	} // end of else

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
		var sql = "";
if(pwd == repwd) { // 문제 2번 pwd와 repwd가 같을경우
		if(gender == "남성") {
			sql += "INSERT INTO signup(id, pwd, gender) VALUES " + "('"+usr+"','"+pwd+"', 0);";
		} else {
			sql += "INSERT INTO signup(id, pwd, gender) VALUES " + "('"+usr+"','"+pwd+"', 1);";
		}
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
			res.redirect('/signup');
			
		})
	}// end of if(pwd == repwd)


	});
	
});

module.exports = router;
