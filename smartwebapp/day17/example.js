$(document).ready(function(){
	$('input[type="checkbox"]').click(function(){
		// 인풋창에 입력된 문자열들을 받아와서 문자열이 빈 문자열이 아니면 배열에 저장
		var arr = new Array();
		$('input[type="text"]').each(function(){ // each 는 for문과 흡사 해당$()에 해당하는갯수만큼 일일히 하나하나 실행됨
			var text = $(this).val(); // 이떄의 this는 each(function)실행되는 각각의 this다
			$(this).val(''); // 체크해제 할때 초기화해주는작업을넣어줌
			if(text != '')
			arr.push(text);
		})
		// 클릭한 체크박스의 value를 가져옴
		var check = $(this); // 이 this는 전체적인 click 에 발동되는 this이다
		// 배열에 해당 체크박스의 value가 있는지를 확인합니다
		var isContain = arr.indexOf(check.val())
		// 체크박스의 value가 배열에 없고 배열의 길이가 2이면
		// 해당 체크박스의 체크를 비활성화
		if(isContain<0 && arr.length == 2){
			check.prop('checked','');
		}
		// 길이가 2가 아니면 해당 배열에 추가를 해당 체크박스의 체크를 활성화한다
		else if(isContain<0 && arr.length != 2){
			arr.push(check.val());
			check.prop('checked','checked');
		}
		// 체크박스의 value가 배열에 있으면 배열에서 해당 문자열을 제거
		else{
			arr.splice(isContain,1);
		}
		// 배열에 있는 문자열을 input창에 하나씩 뿌려줌
		for(var i =0; i<arr.length; i++){
			$('input[type=text]').eq(i).val(arr[i]);
		}
	});
});

		/*		
		var input = $('input[type="text"]');
		var check = $(this); 
		// 선택되지 않은 체크박스를 체크해제한다
		$('input[type="checkbox"]').not(this).prop('checked',''); // null,false,'' 와같다
		// 체크된 메뉴를 다시 체크하여 체크를 해제하는 경우
		// 체크의 value의 인풋창의 value가 같다
		if(input.val() == check.val()){
			input.val('');
		}else{
			input.val(check.val());
		}
		*/
