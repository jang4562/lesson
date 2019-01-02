/**
 * 5. 2~12 사이의 임이의 수를 반환하는 주사위 함수를 만들자.
 */


 // 1~6까지만 나오는 주사위함수
function dice() {
    return Math.floor(Math.random() * 6)+1;
}

function twoDice() {
    return dice () + dice();
}


console.log("내가 던진 주사위 값은? : ", twoDice());


 /*
 dice = Math.floor((Math.random() * 11) + 2);

 window.document.write(dice); 

 6 ~ 10
 0 ~ 0.9999 * (10-6+1)
 0 ~ 4.999 + 6 
 6 ~ 10.9999 / floor
 6 ~ 10

*/ 