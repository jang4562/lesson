package Lecture1010;

import java.util.Scanner;

public class PR04_03 {
	public static void main(String[] args) {
		int A;
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력해주십시오.");

		A = s.nextInt();

		if ((A % 2) == 0)
			System.out.print("짝수");
		else
			System.out.print("홀수");

	}
}