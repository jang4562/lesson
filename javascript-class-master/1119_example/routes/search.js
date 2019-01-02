var express = require('express');
var router = express.Router();

var pool = mysql.createPool({
	host : "127.0.0.1",
	port : 3306,
	user : "root",
	password : "jang4562",
	database : "test",
	connectionLimit : 20,
	waitForConnections : false
});

router.post('/', function(req,res,next){
	var select = req.body.searchTypeInput;

	pool.getConnection(function(err,conn){
		if(err) {
			conn.release();
			throw err;
		}
		var sql = "";
		switch(select){
			case "title":
				sql = "SELECT * FROM board WHERE Title LIKE '%"+req.body.keyword+"%';";
			break;
			case "number":
				sql = "SELECT * FROM board WHERE Board_seq LIKE '"+req.body.keyword+"';";
			break;
			case "writer":
				sql = "SELECT * FROM board WHERE Writer_seq LIKE '"+req.body.keyword+"';";
			break;
			case "contents":
				sql = "SELECT * FROM board WHERE Contents LIKE '%"+req.body.keyword+"%';";
		}
		console.log(sql);
		conn.query(sql,function(err,result) {
			if(err) {
				conn.release();
				throw err;
			}
			res.render('index.ejs', { send_data : result });
		});
	});
});

/*
router.post('/', function(req, res, next) {
	pool.getConnection(function(err, conn){
		if(err) {
			conn.release();
			throw err;
		}
		/**
		 * sql문에서 특정 키워드가 포함된 내용을 검색하고 싶을 떄
		 * 
		 * SELECT 문에서 WHERE 다음에 'LIKE %키워드%'로 조건을 제시하면
		 * 해당 '키워드' 포함된 내용을 검색해준다.
		 */
		/*
		var sql = "SELECT * FROM board WHERE Contents LIKE '%"+req.body.keyword+"%';";
		console.log(sql);
		conn.query(sql,function(err,result){
			if(err) {
				conn.release();
				throw err;
			}
			res.render('index.ejs', { send_data : result });
		});
	});
	
});
*/

module.exports = router;