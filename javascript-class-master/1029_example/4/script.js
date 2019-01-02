/**
 * 4. 국어,영어,수학,성적을 매개변수로 받아 평균을 반환하는 함수를 만들자.
 */

/**
 * 결과물 : 평균
 * 재료 : 국어, 영어, 수학 점수
 */

 result = 0;
 korean = 90;
 english = 60;
 math = 50;

 function getAverage(aKorean, aEnglish, aMath) {
     sum = aKorean + aEnglish + aMath;
     return sum/3;
 }

