/*
 * 프로그램 실행시 키보드를 이용하여 값을 입력하고
 * 입력된 값을 연산하여 연산 결과를 출력하자.
 * 2018-10-14, 장형석
 */
import java.util.Scanner;
public class EX02_02 {

	public static void main(String[] args) {//start of main
		// TODO Auto-generated method stub
		int a, b;      // 정수형 변수 a, b 선언
		int result;    // 결과를 저장할 변수 result 선언
		
		// 문자 또는 숫자를 입력받기 위한 Scanner클래스 이용
		Scanner s  = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요. a=");
		// 키보드로부터 정수형 숫자 입력받아 변수 a에 대입한다,
		a = s.nextInt();
		System.out.println("숫자를 입력해주세요. b=");
		// 키보드로부터 정수형 숫자 입력받아 변수 B에 대입한다,
		b = s.nextInt();
		
		result = a +b;
		System.out.println(a + "+" + b + "=" + result);
		

	}// end of main
}//end of class EX02_02
