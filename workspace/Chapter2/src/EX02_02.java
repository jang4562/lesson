/*
 * ���α׷� ����� Ű���带 �̿��Ͽ� ���� �Է��ϰ�
 * �Էµ� ���� �����Ͽ� ���� ����� �������.
 * 2018-10-14, ������
 */
import java.util.Scanner;
public class EX02_02 {

	public static void main(String[] args) {//start of main
		// TODO Auto-generated method stub
		int a, b;      // ������ ���� a, b ����
		int result;    // ����� ������ ���� result ����
		
		// ���� �Ǵ� ���ڸ� �Է¹ޱ� ���� ScannerŬ���� �̿�
		Scanner s  = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է����ּ���. a=");
		// Ű����κ��� ������ ���� �Է¹޾� ���� a�� �����Ѵ�,
		a = s.nextInt();
		System.out.println("���ڸ� �Է����ּ���. b=");
		// Ű����κ��� ������ ���� �Է¹޾� ���� B�� �����Ѵ�,
		b = s.nextInt();
		
		result = a +b;
		System.out.println(a + "+" + b + "=" + result);
		

	}// end of main
}//end of class EX02_02
