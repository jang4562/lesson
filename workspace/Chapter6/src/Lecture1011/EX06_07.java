/*
 *  for���� �̿��Ͽ� 1���� 100������ �հ踦 ���϶�.
 *  [�˰���]
 * 1. �ʿ��� ���� ���� num, sum=0
 * 2. �ݺ�(num=0;num<=100;num++)
 *    sum = sum + num // sum+=num;
 * 3. �հ踦 ���
 */
package Lecture1011;

public class EX06_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, esum=0, osum=0; // esum ¦���� ��, osum Ȧ���� ��
		
		for(num=1;num<=100;num++){
			if(num %2 ==0)esum += num; // ¦���� �հ�
			else osum += num; // Ȧ���� �հ� (else�� �����ϰ� ��������� �����Ѱ� EX_06_07_01����) 
		}// end of for(num=1....
		
		System.out.printf("Ȧ���� ��: %d\n", osum);
		System.out.printf("¦���� �� : %d\n", esum);
	}// end of main
}// end of class
