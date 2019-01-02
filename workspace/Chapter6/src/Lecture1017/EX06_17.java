/*
 * 무한대의 상황이 필요한때
 * 컴퓨터가 계속 켜져있어야하는 상황 (동작이 입력되기전까지)
 * 프로그램이 계속 켜져있어야되는 상황 
 */
package Lecture1017;

public class EX06_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		i = 0;
		for ( ; ; ) { // 초기값과조건식 증감식이없다
			System.out.printf("%d \n", i);
			i++;
		}// end of for ( ; ; )
	}// end of main

}// end of class
