/*
 * �迭�� ���� : ������ Ÿ��, ������ ������
 * ������  �ϳ��� �̸����� ����ϴ� ��.
 */
package Lecture1024;

public class Base01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. �迭�� ������� ���� ��
		// ����Ÿ���� ������ 5�� �ʿ���ϰ� ���� ����
		// 5�� ������  �հ踦 ���϶�.
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
		// �迭�� ����ϴ� ��
		// �迭�� ������, �ʱ�ȭ
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
		// 6��° ��Ҵ� �հ�, 7��° ��Ҵ� ���
		int num[][] = {
				{10,10,10,10,10,0,0},
				{20,20,20,20,20,0,0},
				{0,0,0,0,0,0,0}, // 3���� �� ���� �հ�
				{0,0,0,0,0,0,0}
		};
		for(int l=0;l <2; l++){
			
			for(int i =0;i < 5; i++){
				// System.out.printf("%4d", num[l][i]);
				num[l][5] += num[l][i]; // ������ ���� ����
				num[2][i] += num[l][i]; // �÷��� ���� ����
			}
			num[l][6] = num[l][5] / 5;
						
		}
		// �� �÷��� ����� ���ϴ� ����
		for(int i =0;i<5;i++){
			num[3][i] = num[2][i] / 2;
		}
		// ��ü �迭�� ���ϴ� ����
		for(int l=0; l < 4; l++){
			for(int i=0; i<7; i++){
				System.out.printf("%4d", num[l][i]);
			}
			System.out.println();
		}
	}// end of main

}// end of class
