/*
 * 생년월일을 입력하받아 나이를 계산한 후 출력하는 프로그램 (미국식 나이)
 * 처리과정 :
 *    1. 생년 변수 year, 나이변수 age 를 선언한다.
 *    2. 생년을 입력하라는 메세지를 출력한다.
 *    3. 키보드로부터 생년을 입력받는다.
 *    4. 나이를 계산한다.
 *    5. 계산된 결과를 출력한다.
 * 2018-10-04, 장형석
 */
import java.util.Scanner;
public class PR02_02 {

	public static void main(String[] args) {
	
		
		// 정수형 변수 birthyear, age, baseyear 를 선언
		int birthyear, age, baseyear;
		int result;   // 결과를 저장할 변수 result를 선언
		
		// 숫자를 입력받기위한 Scanner클래스 이용을 선언
		Scanner s = new Scanner(System.in);
		
		System.out.println("당신의 생년은?");
		System.out.println("해당 년도인 2018년 이하로 입력해주십시오.");
		// 시스템으로부터 정수형 숫자를 입력받아 변수 birthyear에 대입한다
		birthyear = s.nextInt();
		
		// 출력예상 : 2018 - 생일년도 = 나이
		age = 2018 - birthyear;
		
		// 출력예상 : 생일년도 + "에 태어난 당신은 " + 나이 + "살 입니다"
		System.out.println(birthyear + "년에 태어난 당신은 " + age + "살 입니다");
		
		
		System.out.println("해당 년도를 입력하세요");
		// 시스템으로부터 정수형 숫자를 입력받아 baseyear에 대입한다
		baseyear = s.nextInt();
				
		// 출력예상 : 해당년도 - 생일년도 = 나이
		age = baseyear - birthyear;
		
		// 출력예상 : 생일년도  + 년도에 태어난 당신은 + 해당년도에 + 나이 + 살입니다
		System.out.println(birthyear + "년도에 태어난 당신은 " + baseyear + "년도에 " + age + "살 입니다");		
	
		

	}//end of main
}//end of class PR02_01
