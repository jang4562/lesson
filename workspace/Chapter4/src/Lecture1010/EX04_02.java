package Lecture1010;

public class EX04_02 {
	public static void main(String[] args) {
		int a = 10, b = 0;
		
		b = a++; // ���� ������ ��뿹
		System.out.printf("%5d %5d\n", a, b);
		
		b = ++a; // ���� ������ ��뿹
		System.out.printf("%5d %5d\n", a, b);
	}
}
