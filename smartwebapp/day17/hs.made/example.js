$(document).ready(function(){
	$('input[type="checkbox"]').click(function(){
		var input1 = $('#one');
		var input2 = $('#two');
		var check = $(this);
		// input1이 비어있다면
		if(input1.val() == "" ){
			input1.val(check.val());
			// 전제1 = input1은 값이있고 input2가 비어있다면
		}else if(input1.val() != "" && input2.val() == ""){
			// (전제1)포함하고 input1이 다시선택한것일떄
			if(input1.val() == check.val() && input2.val() == "" ){
				input1.val('')
			// (전제1)포함하고 input1을 다시선택한게아닐때(그냥 input2에 값을넣으려할때)
			}else {
			input2.val(check.val());
			}
			// 전제2 = input1,input2가 값이 둘다 차있을떄
		}else if(input1.val() != "" && input2.val() != ""){
			// (전제2)포함하고 input1이 다시선택되었고 input2가 값이있다면(두개다값이있는데 input1을 선택하면)
			if(input1.val() == check.val() && input2.val() != ""){
				input1.val(input2.val());
				input2.val('');
			// (전제2)포함하고 input2가 다시 선택되었다면
			}else if(input2.val() == check.val()){
				input2.val('');
			// 전제2 로 체크된 체크박스가 2개일때
			}else{
			check.prop('checked','');			
			}
		}
	});
});
