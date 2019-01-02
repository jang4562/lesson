/* 문제. 1~100까지의 수 중에서 홀수의 합, 짝수의 합을
 * 구하는 프로그램을 작성하시오.
 * 
 * [알고리즘(해결과정)]
 * 1. 필요변수 선언,
 * 	    숫자를 증가하기 위한 변수 int number=1;
 *    홀수의 합계를 저장하기 위한 변수 int oddsum=0;
 *    짜수의 합게를 저장하기 위한 변수 int evensum=0;
 * 2. 숫자가 100보다 작거나 같은 동안 반복
 *    2.1 number가 홀수이면 홀수합 = 홀수합 + 숫자;
 *        아니라면 짝수합 = 짝수합 + 숫자;
 *    2.2 숫자를 하나 증가시킨다.
 * 3. 홀수합 출력;
 * 4. 짝수합 출력;
 *  
 */
package Lecture1017;

public class PR1_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,sum = 0,osum =0,esum = 0;
		
		while(i<=100){
			if((i % 2)== 0)esum = esum + i;
			else osum = osum + i;
			sum = sum + i;
			i++;
			
				
			}// end off while
		System.out.printf("1부터 100까지의 합은 %d\n", sum);
		System.out.printf("1부터 100까지의 홀수의 합은 %d\n", osum);
		System.out.printf("1부터 100까지의 짝수의 합은 %d\n", esum);
		}// end of main
	}// end of class

