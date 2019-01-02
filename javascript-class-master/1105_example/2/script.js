now = new Date();
window.document.write(now);

year = now.getFullYear();
month = now.getMonth()+1;
day = now.getDate();
days = now.getDay();

window.document.write("<br>",year,"년",month,"월",day,"일 ");
switch(days) {
    case 0 :
        window.document.write("일요일");
        break;
    case 1 :
        window.document.write("월요일");
        break;
    case 2 :
        window.document.write("화요일");
        break;
    case 3 :
        window.document.write("수요일");
        break;
    case 4 :
        window.document.write("목요일");
        break;
    case 5 :
        window.document.write("금요일");
        break;    
    case 6 :
        window.document.write("토요일");
        break;
}
