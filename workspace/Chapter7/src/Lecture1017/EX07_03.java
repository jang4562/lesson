package Lecture1017;
import java.util.Scanner;
public class EX07_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a,b;
		
		while(true){ //�Թ��ؼ� �־   System.out.println("����� �����մϴ�");
			System.out.printf("���� ù ��°�� �Է� : ");
			a = s.nextInt();
			System.out.printf("���� �� ��°�� �Է� : ");
			b = s.nextInt();
			
			if(a == 0 && b == 0){
				System.out.println("���α׷��� �����մϴ�");
				break;
			}// end of if (a == 0....
			System.out.printf("%d + %d = %d\n", a,b,a+b);
				
			
		}// end of while 
	}// end of main

}// end of class
