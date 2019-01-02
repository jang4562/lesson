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

// write.ejs 파일을 렌더링 하는 함수
// get : 데이터를 전달받는 방식
router.get('/', function(req, res, next) {
  res.render('write.ejs', {});
});

// 사용자로 부터 전달된 데이터들을 게시판 데이터베이스에 넣는 함수
// post : 데이터를 전달받는 방식
router.post('/', function(req, res, next){
// 콜백함수의 매개변수
/**
 * req : 클라이언트로 부터 요청(request)받은 정보
 * res : 클라이언트에게 응답(response)할 정보
 * next : 다른 함수를 호출하는 매개변수
 */

// 클라이언트로 부터 전달받을 데이터들을 변수에 저장한다.
// (데이터베이스에 들어갈 데이터)
var title = req.body.titleInput;
var name = req.body.nameInput;
var contents = req.body.contentsInput;

/**
 * form 태그 안의 사용자가 입력한 데이터를 읽어오려면,
 * 클라이언트로 부터 요청받은 정보가 담긴 req 객체 안의 body 객체안에
 * 태그의 id로 입력한 데이터를 읽어올수 있습니다.
 * 
 * 변수 = req.body.태그의 ID
 */

 pool.getConnection(function(err, connection) {
	if(err) {
		// 에러가낫을때 풀에 다시되돌려줌
		connection.release();
		// 에러내용 출력
		throw err;
	}
	// 데이터베이스 코드추가 문 "INSERT INTO 테이블이름 (속성 이름들...)" + "VALUES ('테이블 속성들')";
	var sql = "INSERT INTO board (Title, Writer_seq, Created_at, Contents, Pw, Updated_at) VALUES ('"+title+"', 1, now(),'"+contents+"', '0000', now());";

	console.log(sql);
// 풀에서 가져온걸 쿼리 sql에 연결
	connection.query(sql, function(err,result) {
		if(err) {
			connection.release();
			throw err;
		}
		// res.redirect() 함수 : 특정 주소로 이동하는 함수
		// 작성하기 버튼을 누르면 정보가 데이터베이스에 저장되고 다시 초기
		res.redirect("http://127.0.0.1:3000")
	});
 });
});

module.exports = router;
