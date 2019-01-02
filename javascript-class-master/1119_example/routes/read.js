var express = require('express');
var router = express.Router();
var mysql = require('mysql');

var pool = mysql.createPool({
  host:"127.0.0.1",
  port:3306,
  user:"root",
  password:"jang4562",
  database:"test",
  connectionLimit:20,
  waitForConnections:false
});
  

/* GET users listing. */
router.get('/:Board_seq', function(req, res, next) {
  // 주소에 입력된 숫자를 읽어온다.
  // 숫자는 req.params.Board_seq 오브젝트 안에 있다.
  /** 서버에 글 번호 전달하기 1
   * 서브도메인에 숫자를 의미하는 키워드를 넣는다.
   * 주소에 숫자를 입력해서 서버에게 전달하면, 
   * 숫자는 req.params 오브젝트에 Board_seq(키워드)라는 이름으로
   * 저장된다.
   */
  
  number = req.params.Board_seq;

  pool.getConnection(function(err, connection) {
    if(err) {
      connection.release();
      throw err;

    }

    var sql = "SELECT * FROM board WHERE Enable=1 AND Board_seq="+number;

   console.log(sql);

   connection.query(sql, function(err, rows) {
    if(err) {
      connection.release();
      throw err;
    }
    console.log(rows);
    res.render("read.ejs", {send_data : rows})
   });
  });

  console.log("selected number : "+ number);



 
});

module.exports = router;
