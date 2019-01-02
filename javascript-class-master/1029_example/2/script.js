/** 2.제비뽑기 프로그램을 함수로 만들자
 * 7 : 축하합니다 1등! 유럽 여행권에 당첨되었습니다.
 * 2,5 : 축하합니다 2등! 100인치 TV에 당첨되었습니다.
 * 4,6,9 : 축하합니다 3등! 10만원 상품권에 당첨되었습니다.
 * 이외의 숫자 티슈 드립니다.
 */

 /**
  * 결과물 : 출력되는 메시지
  * 재료 : 입력한 숫자, 등수별 숫자
  */

select_num = "";

select_num = window.prompt("숫자를 입력해주세요","");

switch(select_num) {
    case "7" :
    window.document.write("축하합니다 1등! 유럽 여행권에 당첨되었습니다.");
        break;
    case "2" :
    case "5" :
    window.document.write("축하합니다 2등! 100인치 TV에 당첨되었습니다.");
        break;
    case "4" :
    case "6" :
    case "9" :
    window.document.write("축하합니다 3등! 10만원 상품권에 당첨되었습니다.");
        break;
    default :
    window.document.write("티슈 드립니다");

}


/**
randombox = window.prompt("숫자를 입력해주세요.","1~9")
num = parseInt(randombox)
switch(num) {
    case 7 :
    window.document.write("축하합니다 1등! 유럽 여행권에 당첨되었습니다.");
    break;
    case 2 :
    case 5 :
    window.document.write("축하합니다 2등! 100인치 TV에 당첨되었습니다.");
    break;
    case 4 :
    case 6 :
    case 9 :
    window.document.write("축하합니다 3등! 10만원 상품권에 당첨되었습니다.");
    break;
    default :
    window.document.write("티슈 드립니다.")
}
 */