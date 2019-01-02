/*
 * while 구문을 이해하고, 간단한 예제 프로그램 작성
 * while 구문의 기본 구조
 * 
 * 제어변수선언및초기화;
 * while(조건식){
 * 	  반복할 문장;
 *   제어변수 조작;
 * }
 */
package Lecture1017;

public class EX07_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		while(i<5){
			System.out.println("hello" + i);
			// System.out.printf("hello%d\n",i);
			i++;
		}// end of while(i<5...
	}

}
