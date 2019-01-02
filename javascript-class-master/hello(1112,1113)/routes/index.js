var express = require('express');
var router = express.Router();

/* GET home page. */
router.get('/', function(req, res, next) {
  res.render('index', { title: 'Express' });
});

router.get('/sum/:first/:second', function(req, res, next) {
	var first = req.params.first;
	var second = req.params.second;
	// first와second가 값은숫자여도 문자열로 저장되기때문에 parseInt()함수를 이용하여 sum안에 변수저장
	var sum = parseInt(first) + parseInt(second);

	console.log('더할 기능함수');
	// index.ejs 말고도 hello 타이틀이있는 main.ejs 를 불러와도 사용할수있다
	res.render('index.ejs', { hello : first + "+" + second + "=" + sum});
});

router.get('/multi/:first/:second', function(req, res, next) {
	var first = req.params.first;
	var second = req.params.second;
	var multi = parseInt(first) * parseInt(second);

	console.log('곱할 기능함수');
	// index.ejs 말고도 hello 타이틀이있는 main.ejs 를 불러와도 사용할수있다
	res.render('index.ejs', { hello : first + "*" + second + "=" + multi});
});


module.exports = router;
