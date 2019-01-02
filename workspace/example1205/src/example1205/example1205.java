package example1205;

import java.util.*;

public class example1205 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int first;
		int second;
		String message = "";
		
		System.out.printf("첫 번째 수를 입력하세요 : ");
		first = s.nextInt();
		System.out.printf("계산할 연산자를 입력하세요 : ");
		message = s.next();
		System.out.printf("두 번째 수를 입력하세요 : ");
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
			System.out.printf(message + "는 연산자가 아닙니다.");
		}
		
	}	

}
