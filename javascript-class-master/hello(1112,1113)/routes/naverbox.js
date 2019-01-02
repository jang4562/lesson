var express = require('express');
var router = express.Router();

router.get('/', function(req, res, next) {
  res.render('naverbox', {});
});

// 접속한 주소 정보를 다른 기능 파일(node.js 파일)에게 전달(고정)
module.exports = router;
