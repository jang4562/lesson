/**
 * 5. 가위/ 바위/ 보 게임 만들기
 */

/**
 * 결과물 : 이겼는지/ 졌는지/ 비겼는지 나타낼 메시지
 * 재료 : 3가지 상황 중 1개(어느 버튼을 눌렀는가?)
 *        (매개변수값 예시 가위버튼 : 0, 바위버튼 : 1, 보자기 버튼 : 2)
 */
 // 사용자가 누른 버튼에 대해 게임을 시작함
 function myChoice(select) {
     alert("가위바위보를 합시다.");

     switch(select) {
         case 0 :
            alert("가위를 선택했습니다.");
            break;
         case 1 :
            alert("바위를 선택했습니다.");
            break;
         case 2 :
            alert("보를 선택했습니다.");
            break;
     }
     var result = myGame(select);
     alert(result);
    } 
 // 사용자의 선택과 컴퓨터의 선택을 비교함
 function myGame(user_select) {
     // Math.floor() : 소수점 이하를 버리는 함수
     // Math.random() : 0 이상 1미만의 실수 중에서 1개 선택하는 함수
     var cpu_select = Math.floor(Math.random()*3);
     /**
      * random  random x 3  floor
      * 0.1     0.3         0
      * 0.5     1.5         1
      * 0.9     2.7         2
      */

      if(user_select == cpu_select) {
          return "비겼습니다.";
      } else if(user_select == 0 && cpu_select == 2) { // 사용자가 이기는 경우 (사용자:가위)
        return "사용자가 이겼습니다.";
      } else if(user_select == 1 && cpu_select == 0) { // 사용자가 이기는 경우 (사용자:바위)
        return "사용자가 이겼습니다.";
      } else if(user_select == 2 && cpu_select == 1) { // 사용자가 이기는 경우 (사용자:보)
        return "사용자가 이겼습니다.";
      }
      else { // 사용자가 지는 경우
        return "사용자가 졌습니다";
      }
    }
