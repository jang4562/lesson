/*
 *  fow���� �̿��Ͽ� 1���� 100������ �հ踦 ���϶�.
 *  [�˰���]
 * 1. �ʿ��� ���� ���� num, sum=0
 * 2. �ݺ�(num=0;num<=100;num++)
 *    sum = sum + num // sum+=num;
 * 3. �հ踦 ���
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
		}// 20�� ����� 23������� else �������� ���ٷ� ���డ��
		
		System.out.printf("Ȧ���� �� : %d\n", osum);
		System.out.printf("¦���� �� : %d\n", esum);

		
	}// end of main
}// end of class
