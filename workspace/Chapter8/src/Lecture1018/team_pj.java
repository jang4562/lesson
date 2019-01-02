/*
 * 하루일과
 * 1. 출석하세요 출력
 * 2. "Y/N" (선택1)
 * 3-1. Y입력시 "출석하셨습니다."출력/N입력시 "결석입니다." 프로그램 종료
 * 3-2. 출석시 "1교시 시작합니다."
 * 4-1. 수업 시작 후 0~59까지 입력을 받으면 조건에 따라 메시지 출력
 * 4-2. 0~49안의 숫자를 입력시 "수업중입니다. 공부하세요."
 * 4-3. 50~59안의 숫자 입력시 "쉬는 시간입니다."
 */
package Lecture1018;
import java.util.Scanner;
public class team_pj {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String ok;
		

		System.out.println("출석하시겠습니까?  (Y/N) 택1");
		ok = s.next();
		
		if(ok.equals("Y") || ok.equals("y")){ // 대문자 Y 소문자 y 둘다입력받게
			System.out.println("출석하셨습니다.");
			System.out.println("1교시 부터 8교시 까지입니다");
			System.out.println("[1교시]는 09시00분~09시49분 까지입니다.59분 까지는 쉬는시간입니다.");
			System.out.println("[2교시]는 10시00분~10시49분 까지입니다.59분 까지는 쉬는시간입니다.");
			System.out.println("[3교시]는 11시00분~11시49분 까지입니다.59분 까지는 쉬는시간입니다.");
			System.out.println("[4교시]는 12시00분~12시49분 까지입니다.");
			System.out.println("[12시50분~13시29분 까지는 [점심시간]입니다");
			System.out.println("[5교시]는 13시30분~14시19분 까지입니다.29분 까지는 쉬는시간입니다.");
			System.out.println("[6교시]는 14시30분~15시19분 까지입니다.29분 까지는 쉬는시간입니다.");
			System.out.println("[7교시]는 15시30분~16시19분 까지입니다.29분 까지는 쉬는시간입니다.");
			System.out.println("[8교시]는 16시30분~17시19분 까지입니다.");
			System.out.println("수업이 끝났습니다");

		}// end of if(ok.equals("Y")....
		else if(ok.equals("N") || ok.equals("n")){ // 대문자 N 소문자 n 둘다입력받게
			System.out.println("결석입니다.");
			
		}// end of else if(ok.equals("N").....
		else {System.out.println("잘못 입력하셨습니다. 다시입력해주세요.\n"); 
			return; //while 문장대신 return구문 사용
		}// end of else...
	}// end of main

}// end of class
