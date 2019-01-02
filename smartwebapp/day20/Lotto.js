$(document).ready(function(){
  /**
   * html() : 해당 객체의 html 코드를 가져옴
   * html(xx) : 해당 객체의 html 코드를 입력
   */
  var str = new String();
  for(var i = 1; i<=45; i++){
    str += '<input type="text" class="box" value="'+ i +'" readonly>';
  }
  var str2 = new String();
  for(var i = 0; i<6 ; i++){
    str2 += '<input type="text" class="box" value="" readonly>';
  }
  // type="reset" 타입을넣고 from 태그를 만들어 감싸주면 초기화함수가작동한다(해당하는 value들이 없어짐)
  str2 += '<button id="reset" type="reset"> 리셋 </button>'
  $('#boxs').html(str);
  $('#input').html(str2);

  $('#boxs>.box').click(function(){
    // selected 클래스가 있는 객체의 갯수
    var selectedCnt = $('.selected').length;
    // selectedCnt가 5보다 작거나 클릭된 객체의 클래스에 selected가 있으면
    // 클릭된 객체의 클래스 값을 가져와서(문자열) selected라는 문자열이 
    // 있는지 없는지 확인하여 있으면
    // $(this).prop('class').indexOf('selected') != -1
    // 체크된게 6개이상일땐 selected가 해제되야만하는상황이다
    // $(this).removeClass('selected');
    // hasClass('A') : 해당 객체에 A라는 클래스가 있으면 true를 반환
    //                 없으면 false를 반환
    if(selectedCnt < 6 || $(this).hasClass('selected')){
      // 배열에 클릭한 객체의 value가 없으면 배열에 저장
      // 있으면 배열에서 제거
      // 위의 주석과 같은 의미
      // 해당 객체에 selected 클래스가 있으면 배열에서 객체의 value를 제거
      // 없으면 객체의 value를 배열에 추가
      if($(this).hasClass('selected')){
        // arr.splice(q번지) : 해당 번지부터 뒤에 나오는 모든 값을 없앰;
        // arr = [1,3,4,6]
        // $(this).val() ==  3
        // [1]
        arr.splice(arr.indexOf($(this).val()),1);
      }else{
        arr.push($(this).val());
      }
      matchArr();
      $(this).toggleClass('selected');
    }else{
      alert('최대 6개까지 선택 가능합니다.');
    }
  });
  var arr = [];
  function matchArr(){
    var cnt = 0;
    arr.sort(function(a,b){
      return a-b;
      // b-a 반대로 큰수가먼저옴
    })
    $('#input>.box').each(function(){
      if(arr.length > cnt){
        $(this).val(arr[cnt++]);
      }else{
        $(this).val('');
      }
    })
  }
  $('#reset').click(function(){
    arr = []; // 배열에 저장된값은남아있기때문에 비워 주기만 한다
    // matchArr() : from 태그로 감싸주고 type를 reset으로 줫기때문에 함수를 작동안시켜도된다
    $('.selected').removeClass('selected')
    // $('#boxs>.box').prop('class','box') 
  }); // end of reset
});

// var choice = $(this).val()
// if(arr.indexOf(choice) == -1){
//   arr.push(choice);
//   console.log(arr);
// }else{
//   arr.splice(arr.indexOf(choice),1);
// }

// var cnt = 0;
// for(cnt = 0; cnt < 6; cnt++){
//   if(cnt < arr.length)
//     $('#input>.box').eq(cnt).val(arr[cnt]);
//   else
//     $('#input>.box').eq(cnt).val('');
// }

// 자바스크립트방식O 제이쿼리X
//  for(var i = 0; i < arr.length; i++){
//    if(i < arr.length) 
//      $('#input>.box')[i].value = arr[i];
//    else
//      $('#input>.box')[i].value = '';
// }

/**
 if($('.selected').length < 6){
    $(this).toggleClass('selected');
  }else{
    if($(this).prop('class').indexOf('selected') == -1)
      alert('6개가넘음');
    $(this).removeClass('selected');
  }
 */