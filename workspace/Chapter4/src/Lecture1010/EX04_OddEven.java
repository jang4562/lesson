/*
 * switch case문을 이용하여
 * 홀짝을 판단, 출력하는 프로그램
 * switch case문의 구문규칙
 * switch(수식){
 *     case 값1:
 *        수행할 문장;
 *        break;
 *     case 값2:
 *        수행할 문장;
 *        break;
 *     default;
 *        수행할 문장;
 * }
 * [알고리즘]
 * 1. 필요한 변수 선언 int num, Scanner s
 * 2. 숫자를 입력하라는 메세지 출력
 * 3. 키보드로 부터 입력받는 숫자를 num에 대입
 * 4. 입력받은 수를 2로 나누어 나머지를 
 *    구한다.(num % 2)
 *    4.1 나머지가 0인경우 짝수라는 메시지를 출력
 *    4.2 나머지가 1인경우 홀수라는 메세지를 출력
 * 5. 프로그램 종료 메시지 
 */
package Lecture1010;
import java.util.Scanner;
public class EX04_OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num; // 입력받을 변수 선언
		Scanner s = new Scanner(System.in);
		
		System.out.println("임의 숫자를 입력하세요 : ");
		num = s.nextInt(); // 입력받은 수를 변수 num에 대입
		
		switch(num % 2){
		case 0: // 짝수Even number인 경우
			System.out.printf("%d은(는) 짝수입니다.\n", num);
			break;
		case 1: // 홀수Odd number인 경우
			System.out.printf("%d은(는) 홀수입니다.\n", num);
			break;
		default:
			System.out.printf("%d은(는) 잘못된 입력 입니다", num);
			
		}// end of switch
		

	}

}
