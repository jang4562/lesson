/**
 *  3. 1번에서 작성한(과일이름 배열)에 수박, 무화과 를 
 *  뒤에 추가하고 맨 처음 요소를 삭제하자.
 */

 name_list = new Array("사과","배","감");
 for(i = 0; i < name_list.length; i++) {
   window.document.write(name_list[i],"<br>")
 }
 window.document.write("<br>")

 name_list.push("수박");
 for(i = 0; i < name_list.length; i++) {
  window.document.write(name_list[i],"<br>")
}
window.document.write("<br>")

 name_list.push("무화과");
 for(i = 0; i < name_list.length; i++) {
  window.document.write(name_list[i],"<br>")
}
window.document.write("<br>")

name_list.shift() ;
for(i = 0; i < name_list.length; i++) {
  window.document.write(name_list[i],"<br>")
}
window.document.write("<br>")

 

 
 /*
 name_list.push("수박","무화과")
 
 name_list.shift();

 console.log(name_list);
 */