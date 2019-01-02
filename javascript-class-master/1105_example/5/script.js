
    car1 = {
        type : 1,
        company : "기아",
        name : "소울",
        color : "빨강",
        fuel : "가솔린",
        enjin_on : function() {
            return "붕붕~" ;
        }
    }
    car2 = {
        type : 2,
        valtage : "",
        company : "현대",
        name : "코나",
        color : "은색",
        fuel : "전기",
        enjin_on : function() {
            return "위잉위잉~" ;
        }
    }
    car3 = {
        type : 1,
        company : "쌍용",
        name : "티볼리",
        color : "검정",
        fuel : "디젤",
        enjin_on : function() {
            return "우와아앙~" ;
        }
    }

cars = [car1, car2, car3];

for(i=0 ; i < cars.length ; i++) {
    // i : 0, 1, 2
    if(cars[i].type == 2) {
        window.document.write(cars[i].valtage,"<br>")
    }
    window.document.write(cars[i].company,"<br>");
    window.document.write(cars[i].name,"<br>");
    window.document.write(cars[i].color,"<br>");
    window.document.write(cars[i].fuel,"<br>");
    window.document.write(cars[i].enjin_on(),"<br>");
    window.document.write("<br>")
}