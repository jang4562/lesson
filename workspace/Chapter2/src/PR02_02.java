/*
 * ��������� �Է��Ϲ޾� ���̸� ����� �� ����ϴ� ���α׷� (�̱��� ����)
 * ó������ :
 *    1. ���� ���� year, ���̺��� age �� �����Ѵ�.
 *    2. ������ �Է��϶�� �޼����� ����Ѵ�.
 *    3. Ű����κ��� ������ �Է¹޴´�.
 *    4. ���̸� ����Ѵ�.
 *    5. ���� ����� ����Ѵ�.
 * 2018-10-04, ������
 */
import java.util.Scanner;
public class PR02_02 {

	public static void main(String[] args) {
	
		
		// ������ ���� birthyear, age, baseyear �� ����
		int birthyear, age, baseyear;
		int result;   // ����� ������ ���� result�� ����
		
		// ���ڸ� �Է¹ޱ����� ScannerŬ���� �̿��� ����
		Scanner s = new Scanner(System.in);
		
		System.out.println("����� ������?");
		System.out.println("�ش� �⵵�� 2018�� ���Ϸ� �Է����ֽʽÿ�.");
		// �ý������κ��� ������ ���ڸ� �Է¹޾� ���� birthyear�� �����Ѵ�
		birthyear = s.nextInt();
		
		// ��¿��� : 2018 - ���ϳ⵵ = ����
		age = 2018 - birthyear;
		
		// ��¿��� : ���ϳ⵵ + "�� �¾ ����� " + ���� + "�� �Դϴ�"
		System.out.println(birthyear + "�⿡ �¾ ����� " + age + "�� �Դϴ�");
		
		
		System.out.println("�ش� �⵵�� �Է��ϼ���");
		// �ý������κ��� ������ ���ڸ� �Է¹޾� baseyear�� �����Ѵ�
		baseyear = s.nextInt();
				
		// ��¿��� : �ش�⵵ - ���ϳ⵵ = ����
		age = baseyear - birthyear;
		
		// ��¿��� : ���ϳ⵵  + �⵵�� �¾ ����� + �ش�⵵�� + ���� + ���Դϴ�
		System.out.println(birthyear + "�⵵�� �¾ ����� " + baseyear + "�⵵�� " + age + "�� �Դϴ�");		
	
		

	}//end of main
}//end of class PR02_01
