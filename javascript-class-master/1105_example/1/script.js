for(i = 2 ; i < 5 ;i++) {
    window.document.write(i,"단<br>")
    for(j = 1 ; j <10 ; j++) {
        sum = i * j;
        window.document.write(i," * ",j," = ",sum,"<br>");
    }
    window.document.write("<br>");
}