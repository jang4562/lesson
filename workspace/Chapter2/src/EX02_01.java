/*
 * ��Ŭ������ �̿��Ͽ� �ڹ� ���α׷��� �����غ���
 * �����ϰ� ������ �����ϰ� ���� ������ �� ��Ģ������ �����ϰ�
 * ����� ����ϴ� ���α׷�
 * �ڵ����� �� ���α׷��� : 2018-10-04, ������ 
 * 
 */
public class EX02_01 { // Ŭ���� �̸��� EX02_01
	
    // main method�� ���ٱ����� public���� ����
	public static void main(String[] args) {//Start of main
		// ������� �ʿ��� �ڵ带 �ۼ�
		int a, b; // ������ ���� a, b ����
		int result; // ������ ���� result ����
		
		a = 100;    // ���� a�� 100�� ����
		b = 50;     // ���� b�� 50�� ����
		
		result = a + b; // a�� b�� ���Ͽ� result�� ����
		// ��¿��� : 100 + 50 = 150
		System.out.println(a + "+" + b + "=" + result);
	
		result = a - b; // a���� b�� �� ����� result�� ����
		// ��¿��� : 100 - 50 = 50
		System.out.println(a + "-" + b + "=" + result);
		
		result = a * b; // a�� b�� ���� ����� result�� ����
		// ��¿��� : 100 * 50 = 5000
		System.out.println(a + "*" + b + "=" + result);
		
		result = a / b; // a�� b�� ���� ����� result�� ����
		// ��¿��� : 100 / 50 = 2
		System.out.println(a + "/" + b + "=" + result);
		
		int c, d; // ������ ���� c, d ����
		
		c = 10;     // ���� c�� 10�� ����
		d = 20;     // ���� d�� 20�� ����
 
		// ��¿��� : 10 * 20 = 200
		System.out.println(c + "*" + d + "=" + result);
		
		result = a * a; //a�� a�� ���� ����� result�� ����
		// ��¿��� : 10000
		System.out.println(result);
	}//end of main
}//end of class EX02_01
