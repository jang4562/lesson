package example1205;

import java.util.*;

public class example1205 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int first;
		int second;
		String message = "";
		
		System.out.printf("ù ��° ���� �Է��ϼ��� : ");
		first = s.nextInt();
		System.out.printf("����� �����ڸ� �Է��ϼ��� : ");
		message = s.next();
		System.out.printf("�� ��° ���� �Է��ϼ��� : ");
		second = s.nextInt();
		if(message == "+"){
			int result = first + second;
			System.out.printf(first+ " " + message + " " + second + " = " + result);
		}else if(message == "-"){
			int result = first - second;
			System.out.printf(first+ " " + message + " " + second + " = " + result);
		}else if(message == "*"){
			int result = first * second;
			System.out.printf(first+ " " + message + " " + second + " = " + result);
		}else if(message == "/"){
			int result = first/second;
			System.out.printf(first+ " " + message + " " + second + " = " + result);
		}else if(message == "%"){
			int result = first%second;
			System.out.printf(first+ " " + message + " " + second + " = " + result);
		}else{
			System.out.printf(message + "�� �����ڰ� �ƴմϴ�.");
		}
		
	}	

}
