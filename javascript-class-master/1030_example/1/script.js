// 3개의 과일이름을 나열하는 배열을 정의하시오!
/**
a = new Array();
a[0] = "사과";
a[1] = "포도";
a[2] = "수박";
example = a[1,2,3];

for(i = 0; i < 3; i++){
  window.document.write(i+1,a[i],"<br>");
}
 */

 name_list1 = new Array("사과","배","감");
 name_list2 = ["사과","배","감"];

 for(i = 0; i < 3; i++) {
   // i가 0~2로 반복된다.
   window.document.write(name_list1[i], "<br>");
   
 
 }

 /**
  * 웹브라우저의 개발자 콘솔 화면에 변수 혹은 배열의 데이터를
  * 출력하려면, console.log() 함수를 활용한다.
  */
 console.log(name_list2);