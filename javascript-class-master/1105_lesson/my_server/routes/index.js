var express = require('express');
var router = express.Router();

/* GET home page. */
router.get('/', function(req, res, next) {
  now = new Date();
  print_date = now.getFullYear() + "/" + (now.getMonth()+1) + "/" + now.getDate();

  // print_date >> 2018/11/5 (오늘날짜)
  // {title : 'Express'} >> naverBox.ejs에 표시할 데이터 값(오브젝트)를 의미한다.
  res.render('naverBox.ejs', { date : print_date });
});

module.exports = router;
