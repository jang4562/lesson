$(document).ready(function(){
	$('.tabmenu').first().css('border-bottom-color','white')
	// 주어진 매개변수의 숫자에 맞는 박스를 보여주는 함수
	function displayContent(index){
		$('.content').css('display','none');
		$('.content').eq(index).css('display','block');
		$('.tabmenu').css('border-bottom-color','black');
		$('.tabmenu').eq(index).css('border-bottom-color','white');
	}
	// 네이버와는 다르게 index가 보여줘야하는부분도 있어서 1부터시작했지만
	// 보이지않고 카운트하는부분이라서 0으로줌
	var index = 0;
	$('#next').click(function(){
		index++;
		if(index > 2)
			index = 0;
		displayContent(index);
	});
	$('#prev').click(function(){
		index--
		if(index < 0)
			index = 2;
		displayContent(index);
	});
	displayContent(0);
});