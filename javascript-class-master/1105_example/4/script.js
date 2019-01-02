/**
 * 4. 스마트폰을 대상으로 정하고 오브젝트 만들기
 */

 /**
  * 대상의 상태 : 스마트폰 전원, 스마트폰 통화중 >> 데이터
  * 대상의 행동 : 전화를 건다, 문자메시지를 보낸다, 사진을 찍는다 >> 함수
  */
smartphone = {
    name : "iPhone",
    number : "XR",
    company : "Apple",
    on_off : "on",
    calling : "calling",
    call_func : function() {
        return "전화중입니다.";
    },
    sms : function() {
        return "문자를 보냈습니다.";
    },
    photo : function() {
        return "사진을 찍습니다.";
    }
}
window.document.write("<br>", "지금 켜져 있나요 ? ", smartphone.on_off);
window.document.write("<br>", "지금 전화중이신가요? ", smartphone.call_func);
window.document.write(smartphone.company," ",smartphone.name," ",smartphone.number);
