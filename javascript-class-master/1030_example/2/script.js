/**
 * window.prompt()함수를 활용해서 웹브라우저에서 
 * 입력한 숫자 5개를 배열에 저장하고 배열안의 숫자를 평균하여 표시하자.
 * 반복문을 활용해서 window.prompt()함수를 5번 호출g하고 저장하자
 * 
 * 결과물 : 배열 안의 숫자를 평균값
 * 재료 : 사용자가 입력한 숫자 5개, 합계
 */
 
 /**
 avg = 0;       // 평균을 저장하는 변수
 input = [];    // 사용자가 입력한 숫자 5개를 저장하는 배열
 sum = 0;       // 합게를 저장하는 변수


 input[0] = parseInt(window.prompt("1숫자를 입력해주세요", "")); //parseInt()를 prompt앞에 붙여 간단하게 풀이
 input[1] = parseInt(window.prompt("2숫자를 입력해주세요", ""));
 input[2] = parseInt(window.prompt("3숫자를 입력해주세요", ""));
 input[3] = parseInt(window.prompt("4숫자를 입력해주세요", ""));
 input[4] = parseInt(window.prompt("5숫자를 입력해주세요", ""));

 sum = input[0] + input[1] + input[2] + input[3] + input[4];

 window.document.write("평균 : ", sum/5); //출력문에서 sum/5로 간단하게 풀이
 */

 /**
  * (0~무한)까지 임의의 숫자가 입력될 경우
  */
 avg = 0;       // 평균을 저장하는 변수
 input = [];    // 사용자가 입력한 숫자를 저장하는 배열
 sum = 0;       // 합계를 저장하는 변수
 user_input = 0; // 사용자가 입력한 값을 임시로 저장하는 변수 

 // while의 비교부분이 true 이므로 프로그램이 강제 종류 되지 않는 한
 // 무한하게 반복한다.
 while(true) {
    // 사용자에게 입력을 받는다
    user_input = window.prompt("숫자를 입력해주세요(종료하려면 q)", "");


    if(user_input == "q") { // 입력이 q라면 입력 종료한다
      break; // while 반복문이 중지된다.
    }
    else { // 입력이 숫자인 경우
      user_input = parseInt(user_input);
      input.push(user_input); 
      // 배열이름.push(데이터) >> 데이터를 추가해준다.
      // 배열의 마지막에 입력 값이 계속 추가 된다.
    }
 }
// 입력된 데이터들에 대해서 평균을 구하는 처리 
// 배열이름.length >> 배열안에 저장된 데이터의 개수
// 예시 ) 1, 2, 3 >> input.length ==> 3
 for(i = 0; i < input.length; i++) {
     // 변수 i는 0, 1, 2, 배열의 순서번호도 0, 1, 2
     // 횟수를 의미하는 변수i와 배열의 순서번호가 같다.
    sum = sum + input[i];
 }

 // 모두 더한 값을 배열안에 저장된 데이터에의 갯수로 나누면
 // 평균이 된다.
 window.document.write("평균 : ", sum/input.length); 

/**
a = [];
sum = 0;
for(i= 0; i<5 ; i++){
  a[i] = window.prompt("숫자를 입력하세요");
  num = parseInt(a[i]);
  sum = sum + num
}
example = sum / 5;
window.document.write("배열은 : [", a, "]<br>총 더한값은 : ", sum , "<br>나눈값은 : ", example);
console.log(a);
 */



