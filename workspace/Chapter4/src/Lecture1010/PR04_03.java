package Lecture1010;

import java.util.Scanner;

public class PR04_03 {
	public static void main(String[] args) {
		int A;
		Scanner s = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ֽʽÿ�.");

		A = s.nextInt();

		if ((A % 2) == 0)
			System.out.print("¦��");
		else
			System.out.print("Ȧ��");

	}
}