package Lecture1010;
import java.util.Scanner;
public class VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int button ; // coke1, sprite2, fanta3
	int price_c=1000, price_s=900, price_f=800;//각 음료의 가격
	int take, change=0; //받은 돈, 거스름돈
	String drink= "";
	Scanner s = new Scanner(System.in);
	
	// 돈을 받는 부분 처리
	System.out.print("돈을 주세요 ");
	take = s.nextInt(); // 입력받은 금액을 반은 돈에 대입
	System.out.printf("\n");
	
	// 음료의 종류를 선택하는 처리
	System.out.print("음료를 선택하세요. 콜라:1 사이다:2 환타:3 ");
	button = s.nextInt(); //선택 받은 음료이 종류를 버튼에 대입
	System.out.printf("\n");

	// 음료에 따른 선택적 처리
	if(button == 1 ){ //콜라 인 경우 시작
		if(take >= price_c){// 받은 돈이 콜라가격보다 크거나같으면
			change = take - price_c; // 거스름돈 계산
			System.out.println("콜라가 나왔습니다.");
			System.out.printf("거스틈 돈은 %d원입니다.\n", change);
			
		}// 받은 돈이 콜라가격보다 큰경우 끝
		else{// 받은 돈이 작은 경우
			System.out.println("금액이 모자랍니다.");
		}
	}// 콜라 인 경우의 끝
	else if(button == 2){ // 사이다 인 경우 시작
		if(take >= price_s){// 받은 돈이 사이다가격보다 크거나같으면
			change = take - price_s; // 거스름돈 계산
			System.out.println("사이다가 나왔습니다.");
			System.out.printf("거스틈 돈은 %d원입니다.\n", change);
			
		}// 받은 돈이 사이다가격보다 큰경우 끝
		else{// 받은 돈이 작은 경우
			System.out.println("금액이 모자랍니다.");
		}
	}// 사이다 인 경우 끝
	else if(button == 3) { // 환타 인 경우 시작
		if(take >= price_f){// 받은 돈이 환타가격보다 크거나같으면
			change = take - price_f; // 거스름돈 계산
			System.out.println("환타가 나왔습니다.");
			System.out.printf("거스틈 돈은 %d원입니다.\n", change);
			
		}// 받은 돈이 환타가격보다 큰경우 끝
		else{// 받은 돈이 작은 경우
			System.out.println("금액이 모자랍니다.");
		}
	}// 환타 인 경우 끝
	else{ // 그 외
		
	}// 그 외 끝
	System.out.printf("%s가 나왔습니다.", drink);
	System.out.printf("잔돈은 %d입니다.", change);
	System.out.println("감사합니다. 맛있게 드세요");
	}

}
