package Lecture1010;
import java.util.Scanner; 
public class PR04_01 {
	public static void main(String[] args) {
		int A,B ;
		Scanner s = new Scanner(System.in);
		System.out.println("A�� �Է����ֽʽÿ�. A=");
		
		A = s.nextInt();
		
		System.out.println("B�� �Է����ֽʽÿ�. B=");
		
		B = s.nextInt();
		
		if(A>B){
			System.out.print("��ū ����");
			System.out.print(A);
		} else {
			System.out.print("��ū ����");
			System.out.print(B);
		}
	}
}
