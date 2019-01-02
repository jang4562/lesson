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

// 127.0.0.1:3000/X 이 뒤에 X에붙는숫자들을 number로 지정
router.get('/:number', function(req, res, next) {
	// get에서 나온 number를 파라메터스로 저장하여 변수로 지정
	var number = req.params.number;
	pool.getConnection(function(err, conn) {
		if(err) {
			conn.release;
			throw err;
		}
		var sql = "UPDATE board SET Enable = 0 WHERE Board_seq="+number+";";
		console.log(sql);

		conn.query(sql, function(err, result) {
			if(err) {
				conn.release;
				throw err;
			}
			res.redirect('http://127.0.0.1:3000');			
		});
	});
	// res.render('', {});

});

module.exports = router;