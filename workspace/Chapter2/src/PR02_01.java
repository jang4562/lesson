/*
 * ��������� �Է��Ϲ޾� ���̸� ����� �� ����ϴ� ���α׷� (�ѱ��� ����)
 * ó������ :
 *    1. ���� ���� year, ���̺��� age �� �����Ѵ�.
 *    2. ������ �Է��϶�� �޼����� ����Ѵ�.
 *    3. Ű����κ��� ������ �Է¹޴´�.
 *    4. ���̸� ����Ѵ�.
 *    5. ���� ����� ����Ѵ�.
 * 2018-10-04, ������
 */
import java.util.Scanner;

public class PR02_01 {

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
				age = 2018 - birthyear + 1;
				
				// ��¿��� : ���ϳ⵵ + "�� �¾ ����� " + ���� + "�� �Դϴ�"
				System.out.println(birthyear + "�⿡ �¾ ����� " + age + "�� �Դϴ�");
				
				
				System.out.println("�˰���� �⵵�� �Է����ּ���");
				// �ý������κ��� ������ ���ڸ� �Է¹޾� baseyear�� �����Ѵ�
				baseyear = s.nextInt();
						
				// ��¿��� : �ش�⵵ - ���ϳ⵵ = ����
				age = baseyear - birthyear + 1;
				
				// ��¿��� : ���ϳ⵵  + �⵵�� �¾ ����� + �ش�⵵�� + ���� + ���Դϴ�
				System.out.println(birthyear + "�⵵�� �¾ ����� " + baseyear + "�⵵�� " + age + "�� �Դϴ�");
	}

}
