package Lecture1010;
import java.util.Scanner; 
public class PR04_01 {
	public static void main(String[] args) {
		int A,B ;
		Scanner s = new Scanner(System.in);
		System.out.println("A를 입력해주십시오. A=");
		
		A = s.nextInt();
		
		System.out.println("B를 입력해주십시오. B=");
		
		B = s.nextInt();
		
		if(A>B){
			System.out.print("더큰 값은");
			System.out.print(A);
		} else {
			System.out.print("더큰 값은");
			System.out.print(B);
		}
	}
}
