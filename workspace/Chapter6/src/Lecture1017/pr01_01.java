package Lecture1017;
import java.util.Scanner;
public class pr01_01 {

	public static void main(String[] args) {
		int num; //입력받을 변수를 선언
		Scanner s = new Scanner(System.in);
		
		System.out.println("원하시는 숫자를 입력하세요. ");
		num = s.nextInt(); // 입력받은 수를 변수 num에 대입
		boolean prime = false;
		for(int i =2; i <= num/2; ++i){
			if(num % i ==0){
				prime = true;
				break;
			}// end of if
		}// end of for(int i =2....
		if(prime){
			System.out.println("소수가 아닙니다");
		}else{
			System.out.println("소수가 맞습니다");
		}
		
		
		
		
	}
}