/*
 * ��ø�� For loop�� ������ ������ ������ ���� Ȯ��
 * ��ø For loop�� Syntax
 * for(�ʱ��;���ǽ�;������){
 *     ������ ����
 * 	   for(�ʱ��;���ǽ�;������){
 * 		     ������ ����;
 *     }// inner for loop
 * }//outer for loop
 */
package Lecture1017;

public class EX06_00NestedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<10;i+=3){
			System.out.printf("=== %d �� === \t",i); // 18����� 20������� ���η� ���̰Բ�
			System.out.printf("=== %d �� === \t",i+1); // ���ִ� �۾� 
			System.out.printf("=== %d �� === \n",i+2);
			for(int j=1;j<10;j++){
				System.out.printf("%3d * %3d = %3d\t", i,j,i*j); // ���������� 22�����
				System.out.printf("%3d * %3d = %3d\t", i+1,j,(i+1)*j); // 23����� �۾���
				System.out.printf("%3d * %3d = %3d\n", i+2,j,(i+2)*j); // ����� ���η� ���ĵǺ���
			}// end of for(int j=0;....)
		}// end of for(int i=0;....)
		
		
	}// end of main

}// end of class Ex06_00NestedFor
