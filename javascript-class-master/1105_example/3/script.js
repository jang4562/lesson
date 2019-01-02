example = new Array();
example[0] = [28,38,62];
example[1] = [36,81,65];
example[2] = [47,46,46];
example[3] = ["1열 합계는?","2열 합계는?","3열 합계는?"];
example[4] = [example[0][0]+example[1][0]+example[2][0],example[0][1]+example[1][1]+example[2][1],example[0][2]+example[1][2]+example[2][2]];
// example[5] = [28+25+47,38+81+46,62+65+46];
console.log(example);

for(i = 0; i< 5; i++){
    window.document.write(example[i]);
    window.document.write("<br>")
}

arr = [];
arr[0] = [28, 38, 62];
arr[1] = [36, 81, 65];
arr[2] = [47, 46, 46];

sum1 = 0;
sum2 = 0;
sum3 = 0;

for(i =0 ; i < 3; i++) {
    // i : 0 1 2
    sum1 = sum1 + arr[i][0];
    sum2 = sum2 + arr[i][1];
    sum3 = sum3 + arr[i][2];
}
window.document.write(sum1,"/",sum2,"/",sum3);