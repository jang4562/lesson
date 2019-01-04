$(document).ready(function(){
  $('.ham-menu').click(function(){
    // css('right','0') 를 animate({right:'0'},1000 로 바꿔줌으로써 자연스럽게 1초동안 )
    $('.sidebar').animate({right:'0'},1000);
  });
  $('.sidebar-close').click(function(){
    // animate 에 두가지이상의속성을넣고싶으면 animate({right:'0',background-color:'red'},1000) 이런식으로 ,를넣어주면된다(배열이기떄문에)
    $('.sidebar').animate({right:'-200'},1000);
  })
});