package Lecture1017;
import java.util.Scanner;
public class EX07_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a,b;
		
		while(true){ //밋밋해서 넣어봄   System.out.println("계산을 시작합니다");
			System.out.printf("더할 첫 번째수 입력 : ");
			a = s.nextInt();
			System.out.printf("더할 두 번째수 입력 : ");
			b = s.nextInt();
			
			if(a == 0 && b == 0){
				System.out.println("프로그램을 종료합니다");
				break;
			}// end of if (a == 0....
			System.out.printf("%d + %d = %d\n", a,b,a+b);
				
			
		}// end of while 
	}// end of main

}// end of class
