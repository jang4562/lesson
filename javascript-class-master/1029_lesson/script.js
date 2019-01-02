/**
 * 결과물 : 1~10 까지 더한값
 * 재료:매개변수: 기능을 실행하는데 필요한 데이터) : 덧셈할 수, 반복하는 횟수
 */

 /**
  * for문을 활용하여 1에서 10까지 덧셈하는 프로그램을 작성하자
  */
 sum = 0; //덧셈을 한 결과를 저장하는 변수
 num = 1; //더하는 수
 times = 1; // 반복하는 횟수(10회 반복)

for(times = 1; times <= 10; times++){
    // window.document.write("더한 값 :",num, "<br>");
    // window.document.write("더한 횟수 :",times, "<br>");
    sum = sum + num;
    num = num + 1;
}

// window.document.write("결과 :",sum, "<br>");
 


 /**
  * while문을 활용하여 1에서 10까지 덧셈하는 프로그램을 작성하자
  */

 sum = 0; //덧셈을 한 결과를 저장하는 변수
 num = 1; //더하는 수
 times = 1; // 반복하는 횟수(10회 반복)

 while(times <= 10) {
    // window.document.write("더한 값 :",num, "<br>");
    // window.document.write("더한 횟수 :",times, "<br>");
    sum = sum + num;
    num = num + 1;
    times = times + 1;
 }
//   window.document.write("결과 :",sum, "<br>");



 /**
  * do~while문을 활용하여 1에서 10까지 덧셈하는 프로그램을 작성하자
  */
 sum = 0; //덧셈을 한 결과를 저장하는 변수
 num = 1; //더하는 수
 times = 1; // 반복하는 횟수(10회 반복)

 do{
    window.document.write("더한 값 :",num, "<br>");
    window.document.write("더한 횟수 :",times, "<br>");
    sum = sum + num;
    num = num + 1;
    times = times + 1;
 } while(times <= 10);

window.document.write("결과 :",sum, "<br>");

/**
 * 루프 중단하기
 * 
 * for 문이나 while 같은 반복문을 도중에 중단하는 방법이다.
 * 이때 break문을 사용한다. 반복문 안에 break가 있으면, 반복문 대괄호의
 * 부분의 마지막으로 코드의 실행 흐름이 이동한다.
 * 
 * 기본형태)
 * while(조건) {
 *   실행되는 부분 1
 *   break;
 *   실행이 안되는 부분
 * }
 * 실행되는 부분 2
 */



 b = 2;
 for(a = 0; a < 5; a++) {
     // a는 0,1,2,3,4
     if(b == a) {
         break;
     }
     window.document.write(b, '빼기', a, " = ", b-a,"<br>")
 }


 /**
  * 반복실행을 다음 차례로 옮기기(반복 실행을 생략하기)
  * 
  * break 문은 실행중인 루프 처리를 중단하지만 continue 문은 현재 반복처리만
  * 생략하고 다음번 반복 처리를 수행한다.
  * while(조건) {
  *   실행되는 부분 1
  *   if(조건2) {
  *   continue;
  *   }
  *   실행이 될 수도 있고 안될 수도 있는 부분
  * }
  * 실행되는 부분 2
  */

 window.document.write("continue를 활용한 뺄셈하기<br>")

 b = 2;
 for(a = 0; a < 5; a++) {
     // a는 0,1,2,3,4
     if(b == a) {
         continue;
     }
     window.document.write(b, '빼기', a, " = ", b-a,"<br>")
 }


 /**
  * 선택문
  * 
  * 프로그램의 실행흐름에서 값에 따라 다른 처리를 해야할 경우를
  * 간단하게 처리하기 위한 구문이다.
  * 
  * switch 문은 여러개의 case라는 선택사항에 따라 값이 맞는 것을 골라처리한다.
  * 선택사항 값이 맞지 않는 경우는 default 선택으로 넘어간다.
  * 처리후 break문을 활용하여 실행을 중지한다.
  * 
  * 기본형태)
  * switch(변수이름) {
  *   case 변수값1:
  *     처리하고 싶은 내용1
  *     break;
  *   case 변수값2:
  *     처리하고 싶은 내용2
  *     break;
  *   default:
  *     처리하고 싶은 내용
  * }
  */

  i = 10;
  switch(i) {
    case 10:
        window.document.write("변수값은 10이다.");
        break;
    case 20:
        window.document.write("변수값은 20이다.");
        break;
    default:
        window.document.write("변수값은 10, 20이 아니다.");

  }

 // break 문을 생략하는 경우
/**
 * 예시) 월마다 말일을 알려주는 프로그램을 작성할 때
 * 
 * 각 case 마다 같은 처리를 하는 경우는 break를 의도적으로 
 * 제외하여 코드를 작성하면 여러번 반복해서 작성하지 않아도 된다.
 */
month = 1;
day = 30;

switch(month) {
    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12:
        day = 31;
        break;
    case 4:
    case 6:
    case 9:
    case 11:
        day = 30;
        break;
    case 2:
        day = 28;
        break;
}
window.document.write(month,"월은 ",day,"<br>");

/**
 * 참고 : 웹페이지에서 사용자에게 값 입력받기
 * 
 * 변수 = window.prompt("메시지 내용", "기본값"); 코드를 사용하면
 * 웹페이지에서 사용자에게 입력 받을 수 있는 대화상자가 나타난다.
 * 변수에 사용자가 입력한 값이 저장된다.
 */

mes = window.prompt("입력하는 대화상자", "안녕하세요.")
window.document.write(mes, "<br>");

/**
 * 프로그램 안에서 반복해서 수행하는 계산이나 작업을 하나로 묶어 놓은 구조
 * 함수를 활용해서 이전에 작성했던 코드를 재사용할 수 있다.
 * 함수 내의 코드에서 오류가 발생했을 경우, 함수의 내용만 수정하면
 * 함수 적용된 모든 부분에 같이 적용된다. >> 유지보수가 편하다.
 * 
 * 주의해야 될점
 * 함수는 기능에 따라서 각자 다른 이름을 가진다.
 * 함수 이름은 기능을 이해할 수 있도록 이름을 정해야한다.
 * 
 * 함수는 기능에 따라서 필요한 재료(데이터)가 필요할 수 있다.
 * 이를 매개변수라 한다. 함수를 만들때 매개변수도 같이 표시한다.
 * 참고로 매개변수가 필요하지 않은 경우 별도로 함수에 표시하지 않는다.
 * 
 * 함수는 기능에 따라서 반환값(리턴값)이 있거나 없을 수 있다.
 * 반환값은 함수가 기능을 수행한 결과 값이다.
 * 결과를 반환하는 코드(return)을 활용하여 함수의 결과 값을 도출한다.
 * 예시) num = window.prompt("안녕하세요", "");
 * window.prompt()함수의 반환값은 변수 num에 들어간다.
 * 참고로 반환값이 없을 때는 결과를 반환하는 코드(return)를
 * 작성하지 않아도 된다.
 * 
 * 기본형태)
 * function 함수이름(매개변수1, 매개변수2, 매개변수3, ... ) {
 *   함수가 처리하는 내용
 *   return 결과값 
 * }
 */


/**
 * 예시) 두 수를 더하는 함수
 */
/**
 *  함수 이름 조건 : 영문자, 숫자, 언더바(_), 달러기호($)를 쓸수 있다
 *                  단, 맨 처음 문자는 숫자가 올수 없다.
 *                      대문자, 소문자를 구분한다.
 */

function addNumber(number1, number2) {
    window.document.write(number1, "<br>");
    window.document.write(number2, "<br>");

    sum = number1 + number2;

    return sum;
}

 /**
  * 함수 사용법
  */

result = addNumber(1,2);

window.document.write("결과값 : ",result);

// 변수의 인식 범위 (scope)

/**
 * 함수 밖에서도 사용할 수 있는 변수(글로벌변수, 전역변수), 
 * 함수 안에서만 쓸 수 있는 변수(로컬변수, 지역변수)를
 * 구분하여 활용할 수 있다.
 */

 /**
  * 로컬 변수
  * 
  * 로컬 변수는 그 변수를 선언한 함수 내에서만 사용할 수 있는 함수이며,
  * 그 범위는 함수를 감싸고 있는 대괄호(())의 시작부터 끝까지이다.
  * 함수안에서 만들 수 있음, 변수명 앞에 var 키워드를 붙여 만들 수 있다.
  * 
  * 기본형태)
  * function myFunction() {
  *     var num1 = 1; // 지역변수
  *     num2 = 2; //전역변수
  * }
  */
window.document.write("<br>지역변수 예시<br>");
  a = 1;

  function showNumber() {
      var a;
      a = 2;
      window.document.write(a,"<br>");
  }

showNumber();
window.document.write(a);

/**
 * 지역변수는 중괄호로 묶인 부분만 활용할 수 있으므로
 * 함수 밖에서는 활용할 수 없다.
 * 예시에서 변수의 이름이 같지만 변수를 참조하는 위치
 * (함수 밖/안)에 따라 값이 다르게 처리 된다.
 */

 // 글로벌 함수

 /**
  * 함수의 외부에서 만들고 사용한 변수를 글로벌 변수, 전역 변수
  * 라고 한다.
  * 글로벌 변수는 함수의 안이나 밖에서 참조, 변경할 수 있다.
  * var을 붙이지 않는다.
  */


num1 = 1;

function showNumber2() {
    num1 = 3;
}
showNumber2();
window.document.write("<br>전역변수 : ", num1);

/**
 * 지역변수, 전역변수의 활용
 * 
 * 지역변수는 함수 내에서 임시 값을 저장하는 용도(임시저장장소)
 * 전역변수는 함수 밖에서 활용한다. 전역변수 값이 필요하면
 * 매개변수로 전역변수값을 받는다.
 * >> 실수로 전역변수 값을 잘못 대입하면,
 * 코드 전체의 전역변수 값이 변경될 수 있으므로 주의해야 한다.
 */