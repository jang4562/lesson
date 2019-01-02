function plus() {
	var sum = 0;
	var num = document.querySelectorAll('.num');
	console.log(num[0]);
	sum =  Number(num[0].value) +  Number(num[1].value);
	alert(sum);
}
function plus2() {
	var sum = 0;
	var num1 = document.querySelectorAll('.num1');
	var num2 = document.querySelectorAll('.num2');
	sum = Number(num1[0].value) + Number(num2[0].value);
	alert(sum);
}
function plus3() {
	var sum = 0;
	var num1 = document.getElementsByClassName('num1');
	var num2 = document.getElementsByClassName('num2');
	sum = Number(num1[0].value) + Number(num2[0].value);
	alert(sum);
}
// 선생님 에제
function printSum(){
	var sum = 0;
	var inputs = document.getElementsByTagName('input');
	for(var i = 0 ; i < 2 ; i++) {
		// 각 input 태그에 있는 값(문자열)을 가져옴
		var strNum = inputs[i].value;
		// 가져온 값을 정수로 변환
		var num = parseInt(strNum);
		// sum에 점수를 누적
		sum += num;
	}
	alert(sum);
}
function printSum2(){
	var strNum1 = document.getElementById('num1').value;
	var strNum2 = document.getElementById('num2').value;
	var num1 = parseInt(strNum1);
	var num2 = parseInt(strNum2);
	alert(num1 + num2);
}
// printSum의 getElementByTagName을 querySelectorAll만 수정
function printSum3(){
	var sum = 0;
	var inputs = document.querySelectorAll('input');
	for(var i = 0 ; i < 2 ; i++) {
		// 각 input 태그에 있는 값(문자열)을 가져옴
		var strNum = inputs[i].value;
		// 가져온 값을 정수로 변환
		var num = parseInt(strNum);
		// sum에 점수를 누적
		sum += num;
	}
	alert(sum);
}
function printSum4(){
	var strNum1 = document.querySelector('input#num1').value;
	var strNum2 = document.querySelector('input#num2').value;
	var num1 = parseInt(strNum1);
	var num2 = parseInt(strNum2);
	alert(num1 + num2);
}
