/*
 * 배열의 개념 : 동일한 타입, 목적을 가지는
 * 변수를  하나의 이름으로 사용하는 것.
 */
package Lecture1024;

public class Base01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 배열을 사용하지 않을 때
		// 정수타입의 변수를 5개 필요로하고 각각 선언
		// 5개 정수의  합계를 구하라.
		/*
		int num1, num2, num3, num4, num5;
		int sum = 0;
		num1 = 1; num2 =2; num3 =3; num4 = 4; num5 = 5;
		sum = num1 + num2 + num3 + num4 + num5;
		System.out.printf("%4d", num1);
		System.out.printf("%4d", num2);
		System.out.printf("%4d", num3);
		System.out.printf("%4d", num4);
		System.out.printf("%4d\n", num5);
		System.out.printf("%4d", sum);
		*/
		// 배열을 사용하는 예
		// 배열의 선언방법, 초기화
		/*
		int num[] = {1,2,3,4,5};
		int sum = 0;
		// sum = num[1] + num[2] + num[3] + num[4] + num[5];
		for(int i=0;i < 5; i++){
			System.out.printf("%4d", num[i]);
			sum += num[i];
		}
		System.out.printf("\n%4d", sum);
		*/
		// 6번째 요소는 합계, 7번째 요소는 평균
		int num[][] = {
				{10,10,10,10,10,0,0},
				{20,20,20,20,20,0,0},
				{0,0,0,0,0,0,0}, // 3행은 각 열의 합계
				{0,0,0,0,0,0,0}
		};
		for(int l=0;l <2; l++){
			
			for(int i =0;i < 5; i++){
				// System.out.printf("%4d", num[l][i]);
				num[l][5] += num[l][i]; // 한행의 총점 누계
				num[2][i] += num[l][i]; // 컬럼별 총점 누계
			}
			num[l][6] = num[l][5] / 5;
						
		}
		// 각 컬럼별 평균을 구하는 루프
		for(int i =0;i<5;i++){
			num[3][i] = num[2][i] / 2;
		}
		// 전체 배열을 구하는 루프
		for(int l=0; l < 4; l++){
			for(int i=0; i<7; i++){
				System.out.printf("%4d", num[l][i]);
			}
			System.out.println();
		}
	}// end of main

}// end of class
