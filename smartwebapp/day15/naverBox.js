// window.onload();
// onload와달리 ready는 여러개를만들어도 작동
$(document).ready(function(){
	$('.auto-search').click(function(){
		// 아이디가 auto-box인 박스에 추가(토글클래스)를 display-block
		$('#auto-box').toggleClass('display-block');
		// $('.auto-down').toggleClass('auto-up');
		// 체이닝 기법으로 .찍고 계속유지
		$('.auto-search>div').toggleClass('auto-up').toggleClass('auto-down');
		});
	$('.item4').click(function(){
		menu();
		// this는 함수가 실행되는주체 item4가 된다
		// $(this).toggleClass('item4-1');
		// $('.sub-menu').toggleClass('display-block');
		// $('.sub-menu-background').toggleClass('display-block');
		});
	$('.menu-close').click(function(){
		menu();
		// $('.item4').removeClass('item4-1');
		// $('.sub-menu').removeClass('display-block');
		// $('.sub-menu-background').removeClass('display-block');
	});
	function menu(){
		$('.item4').toggleClass('item4-1');
		$('.sub-menu').toggleClass('display-block');
		$('.sub-menu-background').toggleClass('display-block');
	}
	// div는 ul태그를 감싸는 객체의 선택사항
	// h는 marginTip의 높이
	// time은 이동하는 걸리는 시간
	var ticker = function(div,h,time){
		timer = setTimeout(function(){
			// li태그앞에 뛰어쓰기 필수
			$(div+' li:first').animate( {marginTop: h}, time, function(){
			// 여기서 this는 item5클래스 안에 있는 ul태그 안에 있는 첫번째 
			// li태그 객체
			// detach는 해당 객체를 제거한 후 해당 객체를 리턴한다.
			// 부모.append(자식) : 부모안에 있는 컨텐츠 뒤에 자식을 붙임
			// 자식.appendTo(부모) : 부모안에 있는 컨텐츠 뒤에 자식을 붙임
			// removeAttr('stlye')를 지우겠다(위에animate가 style이기때문)
			$(this).detach().appendTo(div+'>ul').removeAttr('style');
		});
		// 여기에도 div,h,time 을넣어줘야 작동
			ticker(div,h,time);
		}, 2000);         
	};
	ticker('.item5','-20px',400);
	ticker('.news-content','-20px',600);
	$('.item5').hover(function(){
		$('.real-search-box').toggleClass('display-block');
	});
});