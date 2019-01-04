$(document).ready(function(){
  var swiper = new Swiper('.contents.swiper-container', {
    navigation: {
      nextEl: '.swiper-button-next',
      prevEl: '.swiper-button-prev',
    },
  });
  var titleSwiper = new Swiper('.title.swiper-container', {
    slidesPerView: 'auto',
    centeredSlides: true,
    spaceBetween: 30,
    slideToClickedSlide: true,
  });
  swiper.controller.control = titleSwiper;
  titleSwiper.controller.control = swiper;
  $('.carousel').carousel('pause');
  new daum.roughmap.Lander({
		"timestamp" : "1546587333941",
		"key" : "rnas",
		"mapWidth" : "800",
		"mapHeight" : "600"
	}).render();
});