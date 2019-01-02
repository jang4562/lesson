/**
4.두개의 문자열을 입력받아서(prompt()) 두개의 문자열의 글자가 더 긴 문자열을 보여주는 코드를 작성하시오.

1 : 장수하늘소
2 : 하늘소

출력 : 장수하늘소

결과물 : 두개중 긴 문자열
재료 : 문자열 2개, 각문자열의 길이
 */

 msg1 = ""; // 첫번째 문자열
 msg2 = ""; // 두번째 문자열
 result = ""; // 긴 문자열
 msg1_length = 0; // 첫번째 문자열 길이
 msg2_length = 0; // 두번째 문자열 길이

msg1 = window.prompt("첫 문자열을 입력하세요", "");
msg2 = window.prompt("두번째 문자열을 입력하세요", "");

msg1_length = msg1.length;
msg2_length = msg2.length;

if(msg1_length < msg2_length) {
    result = msg2;
} else if(msg1_length > msg2_length) {
    result = msg1;
} else {
    result = "두 문자열의 길이가 같다.";
}

window.document.write(result);


 /*
input1 = window.prompt("입력해주세요 첫번째 : ", "");
input2 = window.prompt("입력해주세요 두번째 : ", "");

if (input1.length > input2.length) {
  window.document.write(input1);
} else if(input1.length < input2.length) {
  window.document.write(input2);
} else {
  window.document.write("두개의 길이가 같다");
}
*/