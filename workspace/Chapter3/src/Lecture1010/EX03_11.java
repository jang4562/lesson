package Lecture1010;

public class EX03_11 {
	public static void main(String [] args) {
		float a = 0.1234567890123456789012345f; // 소숫점 7번째 자리까지만 나옴//
		double b = 0.1234567890123456789012345; // 소숫점 15번째 자리까지만 나옴//
		
		System.out.printf("%30.25f \n", a);
		System.out.printf("%30.25f \n", b);
	}

}
