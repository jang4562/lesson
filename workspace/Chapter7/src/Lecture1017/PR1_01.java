/* ����. 1~100������ �� �߿��� Ȧ���� ��, ¦���� ����
 * ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * [�˰���(�ذ����)]
 * 1. �ʿ亯�� ����,
 * 	    ���ڸ� �����ϱ� ���� ���� int number=1;
 *    Ȧ���� �հ踦 �����ϱ� ���� ���� int oddsum=0;
 *    ¥���� �հԸ� �����ϱ� ���� ���� int evensum=0;
 * 2. ���ڰ� 100���� �۰ų� ���� ���� �ݺ�
 *    2.1 number�� Ȧ���̸� Ȧ���� = Ȧ���� + ����;
 *        �ƴ϶�� ¦���� = ¦���� + ����;
 *    2.2 ���ڸ� �ϳ� ������Ų��.
 * 3. Ȧ���� ���;
 * 4. ¦���� ���;
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
		System.out.printf("1���� 100������ ���� %d\n", sum);
		System.out.printf("1���� 100������ Ȧ���� ���� %d\n", osum);
		System.out.printf("1���� 100������ ¦���� ���� %d\n", esum);
		}// end of main
	}// end of class

