/*
 * fow loop�� ����ϴ� ������ ����
 * for(�ʱ��;���ǽ�;������){
 *    �ݺ������� ����
 * }
 */
package Lecture1011;

public class EX06_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, cnt=1;
		
		for(num=1;num<=100;num++){
			if((num % 7 == 0) || (num % 3 == 0)){ // % ���� �������� Ȱ���Ͽ� ����� �����Բ� ����Ҽ� �ִ�.
				System.out.printf("%4d", num);
				cnt++;
				if(cnt ==11){
					System.out.printf("\n");
					cnt = 1;
				}// end of if(cnt
			}// end of or
		}// end of for(num....
	}// end of main
}// end of class EX06_02
