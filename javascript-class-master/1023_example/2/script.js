/**
 * for 문을 사용하여 1부터 10까지의 합을 구하는 프로그램을 작성해봅시다.


출력)
1 = 1
1+2 = 3
1+2+3 = 6
....
....
1+2+3+....+8+9+10 = 55
 */

// 내가 짜본 식
/** 
 j = 0;
for(i = 1; i <= 10; i++){
    j = i + j;
    window.document.write(i, "!", " = ", j, "<br>");
}
 */

 sum = 0; // 합계를 저장할 변수
 left = ""; // 등호 기준으로 왼편에 표시될 글자들을 
            // 저장하는 변수
// 변수 i는 덧셈의 횟수
for(i = 1; i <= 10; i++) {
    //변수 j는 덧셈할 수를 나타낸다.
    left = "";
    for(j = 1; j <= i; j++) {
        left = left + j; // left += j;
        
        if(j != i) {
            left = left + "+";
        }
        sum += j;
    }
    window.document.write(left, " = ", sum, "<br>")
    sum = 0;
}
window.document.write("<br>")
// 변수 sum은 숫자를 덤셈한 결과를 저장한다
sum = 0;
//변수 i는 덧샘의 횟수
for(i = 1; i <= 10; i++){
    // 변수 j는 더하는 숫자
    // 더하는 숫자는 덧셈의 횟수보다 작거나 같은 규칙성이 있다(조건: j <= i;).
    for(j = 1; j <= i; j++) {
        // 변수 sum에 더하는 숫자를 덧셈하고 변수 sum에 저장한다. (sum=sum+j;)
        sum += j;
        // 더하는 숫자를 출력한다.
        window.document.write(j);

        //더하는 숫자와 덧셈의 횟수가 같으면, 등호(=)가 붙는 규칙성이 있다.
        if(i==j) {
            window.document.write("=");
        }
        // 더하는 숫자와 덧셈의 횟수가 다르면, 덧셈기호가(+) 붙는 규칙성이 있다.
        else {
            window.document.write("+");
        }
    }
    // 더한 숫자들 출력한다.
    window.document.write(sum);
    // 미관상 한줄 개행함
    window.document.write("<br>");
    // 더한 숫자를 저장하는 변수 sum을 초기화한다.
    // 1부터 시작해서 덧셈을 하기 때문에 변수를 초기화 한다.
    sum = 0;
}