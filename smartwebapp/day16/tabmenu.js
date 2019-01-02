$(document).ready(function(){
	$('.tabmenu').first().css('border-bottom-color','white')
	$('.tabmenu').click(function(){
		$('.tabmenu').css('border-bottom-color','black');
		$(this).css('border-bottom-color','white');
		var id = $(this).attr('id');
		var num = getNumber(id, 'menu');
		displayContent(num);
		
	})
	// 주어진 매개변수의 숫자에 맞는 박스를 보여주는 함수
	function displayContent(index){
		$('.content').css('display','none');
		$('#content'+index).css('display','block');
	}
	// 문자열이 주어지면 문자열 마지막에 있는 숫자를 가져오기 위한 함수
	function getNumber(tabmenu,id){
		// manu11 에서 menu를 찾는다 그러니까 값은 0 (시작하자마자 menu나오기떄문에)
		var index = tabmenu.indexOf(id); // 0
		var length = id.length; // 4
		// substr()메소드는 ()안에 "숫자부터" 마지막까지 str로 가져오는역활 밑에선(4번째부터)
		return tabmenu.substr(index+length);
	}
	displayContent(11);
});