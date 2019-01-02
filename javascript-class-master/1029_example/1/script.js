// 1
// sum = 0;
// i = 1;
// while(i <= 10) {
//     sum = sum + i;
//     i++;
// }
// window.document.write("sum =",sum);


// 2
//     sum = 0;
//     i = 1;
// do {
//     sum = sum + i ;
//     i++;
// } while(i <= 10);

// window.document.write("sum =",sum);



/** 
 */ 3
i = 1;
sum = 0;
do {
    left = "";
    j = 1;
    do{
        left = left + j;
        if(j != i) {
            left = left + "+";
        }
        sum += j;
        j++;
    }while(j <= i);
    window.document.write(left, " = ", sum, "<br>")
    i++;
    sum = 0;
}while(i<=10);



 4
sum = 0;
i = 1;
do{
    j = 1;
    do{
        sum += j;
        window.document.write(j);
        if(i==j){
            window.document.write("=");
        }else {
            window.document.write("+");
        }
        j++;
    }while(j <= i);
    i++;
    window.document.write(sum);
    window.document.write("<br>");
    sum = 0;
}while(i <= 10);


