// ������ ���� ������
// https://www.java-examples.com/
package Lecture1024;

public class PR08_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j = 0;
		// int [][] a = new int [5][5];
		// �ּ� ������ �ٲٸ� ���ϴ°������ִ´�.
		// ����) �л����� ���� ��Ģ������ ����
		int [][] a =  { // ��5�� ��5���� �־ [5][5]�� ���� , �������� �þ 
				{1,2,3,0,0},
				{4,5,6,0,0},
				{7,8,9,0,0},
				{0,0,0,0,0},
				{0,0,0,0,0}
			};
		//ps. int cnt = 1;
		for(i = 0; i < 3; i++){
			for(j = 0; j < 3; j++){
				// a[i][j] = cnt++;
				a[i][3] += a[i][j];
				a[3][j] += a[i][j];
			}// end of for(j
			a[i][4] = a[i][j] / 3 ;
		}// end of for(i
		/*
		a[4][0] += a[3][0] / 3;
		a[4][1] += a[3][1] / 3;
		a[4][2] += a[3][2] / 3;
		*/
		for(j = 0; j < 3; j++){
			a[4][j] = a[3][j] / 3; 
		}
		
		System.out.println("1���� ����");
		System.out.println("����/����/����/����/���");
		System.out.println("----------------");
		for(i=0;i<5;i++){
			for(j=0;j<5;j++){
				System.out.printf("%3d", a[i][j]);
			}
				System.out.printf("\n");
		}
	}// end of main

}// end of class
