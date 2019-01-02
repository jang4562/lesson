$(document).ready(function(){
  randomArr = [];
  while(randomArr.length < 3){
    var randomcnt = Math.ceil(Math.random()*9);
    if(randomArr.indexOf(randomcnt.toString()) == -1){
      randomArr.push(randomcnt.toString());
    }
  }
  console.log(randomArr)
  var str = new String();
  var str2 = new String();
  var str3 = new String();
  for(var i = 1; i<=3 ; i++){
    str += '<input type="text" id="box'+i +'">'
  }
  str += '<button id="start">start</button>'
  for(var i = 1; i<= 9 ; i++){
    str3 += '<input type="text" class="number" value="'+ i +'" readonly>';
  }
  $('.box').html(str);
  $('#number').html(str3);
  $('.number').click(function(){
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
      alert('최대 3개까지 선택 가능합니다.');
    }
  });

  var arr = [];
  function matchArr(){
    var cnt = 0;
    $('.box>input[type=text]').each(function(){
      if(arr.length > cnt){
        $(this).val(arr[cnt++]);
      }else{
        $(this).val('');
      }
    })
  }

  $('#start').click(function(){
    basebollgame();
  });
  function basebollgame(){ 
    if(randomArr.indexOf($('#box1').val()) == -1){ // box1 = OUT 일때
      if(randomArr.indexOf($('#box2').val()) == -1){
        if(randomArr.indexOf($('#box3').val()) == -1){ 
          str2 = "3OUT"
        }else if(randomArr.indexOf($('#box3').val()) == 2){
          str2 = "1STRIKE, 2OUT"
        }else{
          str2 = "1BALL, 2OUT"
        }
      }else if(randomArr.indexOf($('#box2').val()) == 1){
        if(randomArr.indexOf($('#box3').val()) == -1){
          str2 = "1STRIKE, 2OUT"
        }else if(randomArr.indexOf($('#box3').val()) == 2){
          str2 = "2STRIKE, 1OUT"
        }else{
          str2 = "1STRIKE, 1BALL, 1OUT"
        }
      }else{
        if(randomArr.indexOf($('#box3').val()) == -1){
          str2 = "1BALL 2OUT"
        }else if(randomArr.indexOf($('#box3').val()) == 2){
          str2 = "1STRIKE, 1BALL, 1OUT"
        }else{
          str2 = "2BALL, 1OUT"
        }
      }
    }else if(randomArr.indexOf($('#box1').val()) == 0){ // box1 = STRIKE 일때
      if(randomArr.indexOf($('#box2').val()) == -1){
        if(randomArr.indexOf($('#box3').val()) == -1){
          str2 = "1STRIKE 2OUT"
        }else if(randomArr.indexOf($('#box3').val()) == 2){
          str2 = "2STRIKE, 1OUT"
        }else{
          str2 = "1STRIKE, 1BALL, 1OUT"
        }
      }else if(randomArr.indexOf($('#box2').val()) == 1){
        if(randomArr.indexOf($('#box3').val()) == -1){
          str2 = "2STRIKE, 1OUT"
        }else if(randomArr.indexOf($('#box3').val()) == 2){
          str2 = "3STRIKE"
        }else{
          str2 = "2STRIKE, 1BALL"
        }
      }else{
        if(randomArr.indexOf($('#box3').val()) == -1){
          str2 = "1STRIKE, 1BALL 1OUT"
        }else if(randomArr.indexOf($('#box3').val()) == 2){
          str2 = "2STRIKE, 1BALL"
        }else{
          str2 = "1STRIKE, 2BALL"
        }
      }
    }else{ // box1 = ball 일때
      if(randomArr.indexOf($('#box2').val()) == -1){
        if(randomArr.indexOf($('#box3').val()) == -1){
          str2 = "1BALL, 2OUT"
        }else if(randomArr.indexOf($('#box3').val()) == 2){
          str2 = "1STRIKE, 1BALL , 1OUT"
        }else{
          str2 = "2BALL , 1OUT"
        }
      }else if(randomArr.indexOf($('#box2').val()) == 1){
        if(randomArr.indexOf($('#box3').val()) == -1){
          str2 = "1STRIKE, 1BALL, 1OUT"
        }else if(randomArr.indexOf($('#box3').val()) == 2){
          str2 = "2STRIKE, 1BALL"
        }else{
          str2 = "1STRIKE, 2BALL"
        }
      }else{
        if(randomArr.indexOf($('#box3').val()) == -1){
          str2 = "2BALL, 1OUT"
        }else if(randomArr.indexOf($('#box3').val()) == 2){
          str2 = "1STRIKE, 2BALL"
        }else{
          str2 = "3BALL"
        }
      }
    }
    $('.computer>input').val(str2);
  }
});