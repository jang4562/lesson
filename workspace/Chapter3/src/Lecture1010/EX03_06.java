package Lecture1010;
import java.util.Scanner; // �������� �Է��� ��ĳ�� //
public class EX03_06 {

	public static void main(String[] args) {
	System.out.printf("\n�ٹٲ�\n���� \n");
	System.out.printf("\t��Ű\t���� \n");
	System.out.printf("�̰���\r����ϴ� \n");
	System.out.printf("��¥�� \"����\"�Ǵ� ȿ�� \n");
	System.out.printf("\\\\\\ �������� ���� ��� \n");
	
	int a; //���� A�� ���� (�������� �Է�)
	Scanner s = new Scanner(System.in); // ��ĳ�� ȣ�� //
	System.out.print("�����͸� �Է����ּ���[ ]");
	System.out.printf("\b\b"); // �������̽� �ι����� [ ]�ȿ� ������ //
	a = s.nextInt(); //,�� �ƴ� .�� �Է� �׸��� ���ڸ��Է� //
	System.out.printf("%d\n", a);
		
	}

}
