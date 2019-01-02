/*
 * 이클립스를 이용하여 자바 프로그램을 개발해보자
 * 간단하게 변수를 선언하고 값을 대입한 후 사칙연산을 적용하고
 * 결과를 출력하는 프로그램
 * 코딩일자 및 프로그래머 : 2018-10-04, 장형석 
 * 
 */
public class EX02_01 { // 클래스 이름은 EX02_01
	
    // main method는 접근권한을 public으로 선언
	public static void main(String[] args) {//Start of main
		// 여기부터 필요한 코드를 작성
		int a, b; // 정수형 변수 a, b 선언
		int result; // 정수형 변수 result 선언
		
		a = 100;    // 변수 a에 100을 대입
		b = 50;     // 변수 b에 50을 대입
		
		result = a + b; // a와 b를 더하여 result에 저장
		// 출력예상 : 100 + 50 = 150
		System.out.println(a + "+" + b + "=" + result);
	
		result = a - b; // a에서 b를 뺀 결과를 result에 저장
		// 출력예상 : 100 - 50 = 50
		System.out.println(a + "-" + b + "=" + result);
		
		result = a * b; // a와 b를 곱한 결과를 result에 저장
		// 출력예상 : 100 * 50 = 5000
		System.out.println(a + "*" + b + "=" + result);
		
		result = a / b; // a를 b로 나눈 결과물 result에 저장
		// 출력예상 : 100 / 50 = 2
		System.out.println(a + "/" + b + "=" + result);
		
		int c, d; // 정수형 변수 c, d 선언
		
		c = 10;     // 변수 c에 10을 대입
		d = 20;     // 변수 d에 20을 대입
 
		// 출력예상 : 10 * 20 = 200
		System.out.println(c + "*" + d + "=" + result);
		
		result = a * a; //a를 a로 곱한 결과를 result에 저장
		// 출력예상 : 10000
		System.out.println(result);
	}//end of main
}//end of class EX02_01
