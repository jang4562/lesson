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
		/* 이미 다른코드로 구현이 완료되어 필요없는부분 */
	// $('.item4').click(function(){
	// 	menu();
	// 	// this는 함수가 실행되는주체 item4가 된다
	// 	// $(this).toggleClass('item4-1');
	// 	// $('.sub-menu').toggleClass('display-block');
	// 	// $('.sub-menu-background').toggleClass('display-block');
	// 	});
	// $('.menu-close').click(function(){
	// 	menu();
	// 	// $('.item4').removeClass('item4-1');
	// 	// $('.sub-menu').removeClass('display-block');
	// 	// $('.sub-menu-background').removeClass('display-block');
	// });
	// function menu(){
	// 	$('.item4').toggleClass('item4-1');
	// 	$('.sub-menu').toggleClass('display-block');
	// 	$('.sub-menu-background').toggleClass('display-block');
	// }
	// div는 ul태그를 감싸는 객체의 선택사항
	// h는 marginTip의 높이
	// time은 이동하는 걸리는 시간
	var ticker = function(div,h,time){
		timer = setTimeout(function(){ // 콜백함수 (2초뒤에 함수를실행하겠다)
			// li태그앞에 뛰어쓰기 필수
			$(div+' li:first').animate( {marginTop: h}, time, function(){
			// 여기서 this는 item5클래스 안에 있는 ul태그 안에 있는 첫번째 
			// li태그 객체
			// detach는 해당 객체를 제거한 후 해당 객체를 리턴한다.
			// 부모.append(자식) : 부모안에 있는 컨텐츠 뒤에 자식을 붙임
			// 자식.appendTo(부모) : 부모안에 있는 컨텐츠 뒤에 자식을 붙임
			// removeAttr('stlye')를 지우겠다(위에animate (marginTop:h)가 style이기때문)
			$(this).detach().appendTo(div+'>ul').removeAttr('style');
		});
		// 여기에도 div,h,time 을넣어줘야 작동
			ticker(div,h,time); // 재개함수
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
	$('.rank-left').click(function(){
		$('.rank-lists').first().css('display','block');
		$('.rank-lists').last().css('display','none');
		$(this).css('background-color','#ffffff');
		$('.rank-right').css('background-color','#f9fafc');
	});
	$('.rank-right').click(function(){
		$('.rank-lists').first().css('display','none');
		$('.rank-lists').last().css('display','block');
		$(this).css('background-color','#ffffff');
		$('.rank-left').css('background-color','#f9fafc');
	});

	$('.rank-lists').first().css('display','block');
	$('.rank-lists').last().css('display','none');
	
	
	
	/*
	$('.menu-setting-icon').css('display','none');
	$('.menu-setting-box').css('display','none');
	$('.menu-setting').click(function(){
		$('.nomal').css('display','none');
		$('.menu-setting-box').css('display','block');
		$('.item2').css('display','none');
		$('.menu-setting-icon').css('display','inline-block');
	});

	$('input[type="checkbox"]').click(function(){
		var arr = new Array();
		$('.menu-setting-icon input').each(function(){
			var text = $(this).val();
			$(this).val('');
			if(text != '')
			arr.push(text);
		})
		var check = $(this);
		var isContain = arr.indexOf(check.val())
		if(isContain<0 && arr.length == 5){
			check.prop('checked','');
		}else if(isContain<0 && arr.length != 5){
			arr.push(check.val());
			check.prop('checked','checked');
		}else{
			arr.splice(isContain,1);
		}
		for(var i =0; i<arr.length; i++){
			$('.menu-setting-icon input').eq(i).val(arr[i]);
		}
		console.log(arr);
	})
 */
var menuArr = ["dici","newsi","stocki","dealeri","mapi","moviei","musici","booki","webtooni"];
$('.menu-setting').click(function(){
	createCheck()
	var cnt = 0;
	$('.item2-1').each(function(){ // each함수로인해 item2-1클래스가 9개 이기때문에 9번실행
		if(menuArr2.length <= cnt){
			$(this).prop('class','item2-1');
			if(cnt > 4){
				$(this).addClass('display-none');
			}
		}
		cnt++
	});

$('.sub-menu-div input[type=checkbox]').each(function(){
	$(this).removeClass('display-none');
});
$('.all-service').addClass('display-none');
$(this).addClass('display-none');
$('.ok').removeClass('display-none');
$('.init').removeClass('display-none');
$('.cancel').removeClass('display-none');
});
$('.cancel').click(function(){
	initCheck();
	checkMenu();
	displayMenu()
	selectedMenu = menuArr2.slice();
	$('.all-service').removeClass('display-none');
	$('.menu-setting').removeClass('display-none');
	$('.ok').addClass('display-none');
	$('.init').addClass('display-none');
	$('.cancel').addClass('display-none');
	$('.sub-menu-div input[type=checkbox]').each(function(){
		$(this).addClass('display-none');
});
});
$('.menu-close').click(function(){
	initCheck();
	selectedMenu = [];
	menu();
	closeSubMenu();
});
$('.item4').click(function(){
	selectedMenu = menuArr2.slice();
	displayMenu();
	menu();
	checkMenu();
	closeSubMenu();
	initCheck();
});
/* 메뉴 설정에서 선택한 메뉴들을 저장하는 배열 */
var selectedMenu = [];
/* 실제 네이버에서 뿌려줄 메뉴 */
var menuArr2=[];
$('.sub-menu-div input[type="checkbox"]').click(function(){
	// 클릭한 체크박스의 value를 가져옴
	var check = $(this); // 이 this는 전체적인 click 에 발동되는 this이다
	// 배열에 해당 체크박스의 value가 있는지를 확인합니다
	var isContain = selectedMenu.indexOf(check.val())
	var maxSize = 5;
	// 체크박스의 value가 배열에 없고 배열의 길이가 2이면
	// 해당 체크박스의 체크를 비활성화
	if(isContain<0 && selectedMenu.length == maxSize){
		check.prop('checked','');
	}
	// 길이가 2가 아니면 해당 배열에 추가를 해당 체크박스의 체크를 활성화한다
	else if(isContain<0 && selectedMenu.length != maxSize){
		selectedMenu.push(check.val());
		check.prop('checked','checked');
	}
	// 체크박스의 value가 배열에 있으면 배열에서 해당 문자열을 제거
	else{
		selectedMenu.splice(isContain,1);
	}
	// 배열에 있는 문자열을 input창에 하나씩 뿌려줌
	var cnt = 0;
	$('.item2-1').each(function(){
		if(cnt < selectedMenu.length){
			$(this).prop('class','item2-1 back-img');
			$(this).addClass(selectedMenu[cnt++]);
		}
		else{
			$(this).prop('class','item2-1');
			if(cnt > 4)
				$(this).addClass('display-none');
			cnt++;
		}
	});
});
$('.ok').click(function(){
	initCheck();
	// 선택된메뉴들을 menuArr2에다가 저장
	menuArr2 = selectedMenu.slice();
	menu();
	closeSubMenu();
});
$('.init').click(function(){
	initCheck();
	menuArr2 = [];
	selectedMenu = [];
	alert('초기 설정으로 돌아갑니다.')
	menu();
	closeSubMenu();
	checkMenu();
});

function menu(){
$('.item4').toggleClass('item4-1');
$('.sub-menu').toggleClass('display-block');
$('.sub-menu-background').toggleClass('display-block');
}
// menuArr2에서 저장된 값들만 check가 되도록 하는 함수
function checkMenu(){
	$('.sub-menu-div input[type="checkbox"]').each(function(){
		$(this).prop('checked','');
		for(var i = 0; i<menuArr2.length; i++){
			if($(this).val() == menuArr2[i]){
				$(this).prop('checked','checked');
			}
		}
	});
}

function closeSubMenu(){
	displayMenu();
	$('.sub-menu-div input[type=checkbox]').each(function(){
		$(this).addClass('display-none');
	});
	$('.all-service').removeClass('display-none');
	$('.menu-setting').removeClass('display-none');
	$('.ok').addClass('display-none');
	$('.init').addClass('display-none');
	$('.cancel').addClass('display-none');	
}
function initCheck(){
	$('.sub-menu-div label').each(function(){
		$(this).prop('for','');
	})
}
function createCheck(){
	var i = 0;
	var checkbox = $('.sub-menu-div input[type=checkbox]')
	$('.sub-menu-div label').each(function(){
		$(this).prop('for', checkbox.eq(i++).prop('id'));
	})
}
function displayMenu(){
	var i = 0;
	if(menuArr2.length == 0){
		$('.item2-1').each(function(){
			$(this).prop('class','item2-1 back-img');
			$(this).addClass(menuArr[i++]);
		})
	}else{
		$('.item2-1').each(function(){
			if(menuArr2.length > i){
			$(this).prop('class','item2-1 back-img');
			$(this).addClass(menuArr2[i++]);
			}else{
				$(this).prop('class','item2-1 display-none');
			}
		});
	}
}
});