$(document).ready(function(){
  var answer = randomArr();
  console.log(answer);
  var arr = [];

  /*
    answer 와 p1을 비교하여 현재 상황을 판별하여
    1B이 출력되도록 함
  */
 
 

 function getStrike(arr1, arr2){
   var strike = 0;
   for(var i = 0; i<arr1.length; i++){
     if(arr1[i] == arr2[i])
      strike++;
   }
   return strike;
 }
 function getBall(arr1, arr2){
   var ball = 0;
  for(var i = 0; i<arr1.length; i++){
    for(var j=0; j<arr2.length; j++){
      if( i != j) {
        if(arr1[i] == arr2[j])
          ball++;
      }
      // Shotr Circit Evalutation
      // if(i != j && arr1[i] == arr2[j])
        
    }
  }
  return ball;
 }
 //////////////////////////////////
 var str = new String();
  for(var i = 1; i<=9; i++){
    str += '<input type="text" class="box" value="'+ i +'" readonly>';
  }
  var str2 = new String();
  for(var i = 0; i<3 ; i++){
    str2 += '<input type="text" class="box" value="" readonly>';
  }
  str2 += '<button id="confirm" type="button"> 확인 </button>'
  str2 += '<button id="reset" type="reset"> 새게임 </button>'
  $('#boxs').html(str);
  $('#input').html(str2);
  $('#boxs>.box').click(function(){
    var selectedCnt = $('.selected').length;
    if(selectedCnt < 3 || $(this).hasClass('selected')){
      if($(this).hasClass('selected')){
        arr.splice(arr.indexOf($(this).val()),1);
      }else{
        arr.push($(this).val());
      }
      matchArr();
      $(this).toggleClass('selected');
    }else{
      alert('3개를 선택해야 합니다.');
    }
  });
  function matchArr(){
    var cnt = 0;
    $('#input>.box').each(function(){
      if(arr.length > cnt){
        $(this).val(arr[cnt++]);
      }else{
        $(this).val('');
      }
    })
  }
  $('#confirm').click(function(){
    var strike = getStrike(answer, arr);
    var ball = getBall(answer, arr);
    if(arr.length != 3){
      alert('3개를 선택해야합니다.')
      return;
    }
    if(strike == 0 && ball == 0)
      alert("3O");
    else if(strike == 3)
      alert("3S, 정답입니다");
    else if(strike == 0)
      alert(ball+'B');
    else if(ball == 0)
      alert(strike +'S ')
    else
      alert(strike + 'S ' + ball + 'B');
  });
  function randomArr(){
    var cnt = 0;
    var ranArr = new Array();
    while(cnt<3){
      var tmp = random(1,9);
      if(ranArr.indexOf(tmp) == -1){
        ranArr.push(tmp);
        cnt++;
      }
    }
    return ranArr;
  }
  function random(min, max){
    return parseInt(Math.random()*(max-min+1)+min);
  }
  $('#reset').click(function(){
    arr = new Array();
    $('.selected').removeClass('selected') 
    answer = randomArr();
    alert('새게임을 시작합니다.')
    // console.clear(); 콘솔 클리어함수
    console.log(answer);
  });
});