// for(i=2; i<10; i++){
// 	window.document.write(i, "단<br>");
// 	for(j=1; j<10 ; j++){
// 		window.document.write(i, " X ", j, " = ", i*j, "<br>");
// 	}
// 	window.document.write("<br>");
// }
// body태그안의 내용들이 구성된 후(화면에 출력된 후) 실행된 function

// window.onload = function(){
// 	alert("Hello!");
// 	printMulti();
// }


// 구구단 전체를 출력하는 함수
function printMulti(){
	for(var i = 2; i<=9; i++){
		multi(i);
	}
}
// a단을 출력하는 함수
function multi(a){
	console.log(a+"단")
for(var i= 1; i <= 9 ; i++){
		printMul(a, i);
	}
}
// a*i를 출력하는 함수
function printMul(a,i){
	var res = a*i;
	var str = "" + a + "X" + i + "=" + res;
	console.log(str);
}
var array = {name:"홍길동", age:21, address:"청주시"};
// key : 배열 array의 각 키값인 name, age, address를 가져온다.
for(var key in array){
	console.log(key + " : " + array[key]);
}
var array1 = [1,"123",456]
var array2 = [789,"1234","456"];
// concat함수는 배열2개를 하나로 합쳐 새로운 배열을 만들어 돌려준다.
console.log("concat()함수 예제");
console.log(array1.concat(array2));
console.log(array1);
console.log("push()함수 예제");
console.log(array1.push(000));
console.log("배열의 길이 : " + array1.length);
console.log("join()함수 예제");
// 배열을 구분자를 이용항 하나의 배열로 생성
console.log(array1.join(", "));
console.log("splice()함수 예제");
// 배열을 해당하는 번지부터 잘라내기를 한다. / 잘라내고 남은값만남음
console.log(array1);
// 배열을 해당하는 번지부터 잘라내기를 하여 잘려진 부분을 반환하고, 원본은 수정이 안됨
console.log("slice()함수 예제");
console.log(array2.slice(1));
console.log(array2);
console.log("reverse()함수 예제");
// 원소를 거꾸로 첫번째를 마지막으로 마지막을 첫번쨰로
console.log(array2.reverse());
console.log("sort()함수 예제");
// 모든 배열원소들을 문자열로 만든 후 비교하며 정렬
console.log(array2.sort());
console.log("문자열 비교");
// 아스킷코드값을 참조하자
console.log("a>b :"+ ('a'>'b'));
console.log("a>aa :"+ ('a'>'aa'));
console.log("a>A :"+ ('a'>'A'));
console.log("123>7 : "+ ('123'>'7'));