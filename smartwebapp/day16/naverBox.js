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
	//'.api-list>li>a'로 했을땐 찾는범위가 너무구체적이여서 찾지를못함
	$('.api-list>li').hover(function(){
		// $('.api-list>li>a').toggleClass('display-none');
		$(this).children('a').toggleClass('display-none');
		// $('.api-list>li>div').toggleClass('display-block'); //이것에 해당하는전부
		$(this).children('div').toggleClass('display-block'); // 이것 단 하나만
		
		// $(this).children('.api-btn').toggleClass('display-block');
	});
	// box5-bottomrk 6개인 그 중 선택할 박스 번호가 index
	var index = 1;
	function displayBox5(i){
		// 6개를 일단 다 안보이게 하고 => 기존에 보였던 박스를 안보이게하기위해
		$('.box5-bottom').removeClass('display-block');
		// 선택한 1번째를 보여준다. (eq는 기본값이 0부터시작)
		$('.box5-bottom').eq(i-1).addClass('display-block');
		// 미리만들어둔 displayBox5함수안에 넣어줌으로서 한줄코드로 만들수있음
		$('.box5-item2>b').text(i);
		// box5-bottom 작업과 비슷
		$('.location').removeClass('display-inline-block');
		$('.location').eq(i-1).addClass('display-inline-block');
	}
	displayBox5(index);
	$('.box5-next').click(function(){
		// index ++ 로 간편하게 잡아줌
		index++;
		//박스가 6개이기 때문에 7번째로 가려고 하면 첫번째로 보내준다.
		if(index > 6){
			index = 1;
		}
		displayBox5(index);
	})
	$('.box5-prev').click(function(){
		// index ++ 로 간편하게 잡아줌
		index--;
		//박스가 6개이기 때문에 -1번째로 가려고 하면 6번째로 보내준다.
		if(index <= 0){
			index = 6;
		}
		displayBox5(index);
	})
	
	$('.page1').addClass('display-block');

	$('.one-btn').click(function(){
		$('.real-search-box>ul').removeClass('display-block');
		$('.page1').addClass('display-block');
	})
	$('.two-btn').click(function(){
		$('.real-search-box>ul').removeClass('display-block');
		$('.page2').addClass('display-block');
	})
});