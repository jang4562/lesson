package Lecture1010;
import java.util.Scanner; 
public class PR04_02 {
	public static void main(String[] args) {
		int A;
		Scanner s = new Scanner(System.in);
		System.out.println("생년을 입력해주십시오");
		
		A = s.nextInt();
		
		if((2018-A)>=19)System.out.print("어서오세요");
		else System.out.print("입장불가");
	
		
	}
}