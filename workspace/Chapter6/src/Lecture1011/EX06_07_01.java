/*
 *  fow문을 이용하여 1부터 100까지의 합계를 구하라.
 *  [알고리즘]
 * 1. 필요한 변수 선언 num, sum=0
 * 2. 반복(num=0;num<=100;num++)
 *    sum = sum + num // sum+=num;
 * 3. 합계를 출력
 */
package Lecture1011;

public class EX06_07_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, osum = 0,esum =0;
		for(num=1;num<=100;num++){
			if(num %2 ==0)
				esum += num;
		}// end of for(odd
		for(num=1;num<=100;num++){
			if(num %2 ==1)
				osum += num;
		}// 20번 행부터 23번행까지 else 문단으로 한줄로 약축가능
		
		System.out.printf("홀수의 합 : %d\n", osum);
		System.out.printf("짝수의 합 : %d\n", esum);

		
	}// end of main
}// end of class
