/*
 * switch case���� �̿��Ͽ�
 * Ȧ¦�� �Ǵ�, ����ϴ� ���α׷�
 * switch case���� ������Ģ
 * switch(����){
 *     case ��1:
 *        ������ ����;
 *        break;
 *     case ��2:
 *        ������ ����;
 *        break;
 *     default;
 *        ������ ����;
 * }
 * [�˰���]
 * 1. �ʿ��� ���� ���� int num, Scanner s
 * 2. ���ڸ� �Է��϶�� �޼��� ���
 * 3. Ű����� ���� �Է¹޴� ���ڸ� num�� ����
 * 4. �Է¹��� ���� 2�� ������ �������� 
 *    ���Ѵ�.(num % 2)
 *    4.1 �������� 0�ΰ�� ¦����� �޽����� ���
 *    4.2 �������� 1�ΰ�� Ȧ����� �޼����� ���
 * 5. ���α׷� ���� �޽��� 
 */
package Lecture1010;
import java.util.Scanner;
public class EX04_OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num; // �Է¹��� ���� ����
		Scanner s = new Scanner(System.in);
		
		System.out.println("���� ���ڸ� �Է��ϼ��� : ");
		num = s.nextInt(); // �Է¹��� ���� ���� num�� ����
		
		switch(num % 2){
		case 0: // ¦��Even number�� ���
			System.out.printf("%d��(��) ¦���Դϴ�.\n", num);
			break;
		case 1: // Ȧ��Odd number�� ���
			System.out.printf("%d��(��) Ȧ���Դϴ�.\n", num);
			break;
		default:
			System.out.printf("%d��(��) �߸��� �Է� �Դϴ�", num);
			
		}// end of switch
		

	}

}
