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

/* GET users listing. */
router.get('/', function(req, res, next) {
  res.render('login', {});
});

router.post('/', function(req, res, next) {
	var id = req.body.id;
	var pwd = req.body.pwd;

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
				res.render('login.ejs', {})
				return;
			} else {
				// 비밀번호 검사
				var sql_pw = "SELECT * FROM signup where id = '" + id +"' AND pwd = '"+pwd+"';";
				console.log(sql_pw);
				/**
				 * 콜백함수 안에 콜백함수를 계속 호출하는 방식에 반복되는 경우 (callback hell현상),
				 * 프로그램의 실행 흐름을 알기 어렵다 >> 에러의 원인
				 * 
				 * async 모듈을 활용하여 프로그램의 실행 흐름을 제어할 수 있다.
				 */
				// sql_pw에 대한 쿼리문을 실행해야한다.
				con.query(sql_pw, function(err,result_pw) {
					if(err) {
						con.release;
						throw err;
					}
					if(result_pw.length == 0) {
						res.render('login.ejs', { message : "비밀번호가 없습니다."});
						return;
					} 
						res.render('login.ejs', {	message : "로그인 완료"});
				})
			}
		})
	});
});

module.exports = router;
