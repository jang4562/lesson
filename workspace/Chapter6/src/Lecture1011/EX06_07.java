/*
 *  for문을 이용하여 1부터 100까지의 합계를 구하라.
 *  [알고리즘]
 * 1. 필요한 변수 선언 num, sum=0
 * 2. 반복(num=0;num<=100;num++)
 *    sum = sum + num // sum+=num;
 * 3. 합계를 출력
 */
package Lecture1011;

public class EX06_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, esum=0, osum=0; // esum 짝수의 합, osum 홀수의 합
		
		for(num=1;num<=100;num++){
			if(num %2 ==0)esum += num; // 짝수의 합계
			else osum += num; // 홀수의 합계 (else로 간단하게 만들수있음 내가한건 EX_06_07_01버전) 
		}// end of for(num=1....
		
		System.out.printf("홀수의 합: %d\n", osum);
		System.out.printf("짝수의 합 : %d\n", esum);
	}// end of main
}// end of class
