package Lecture1107;

class Car7 {
	int speed = 0;
	
	final void upSpeed(int speed) {
		this.speed += speed;
	}
}

class Sedan7 extends Car7 {
	final static String CAR_TYPE="승용차";
	
	// void upSpeed(int speed) {
	// 제정의한 메소드 내용
    // }
}

public class EX12_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sedan 클래스 타입 -->" + Sedan7.CAR_TYPE);
	}

}
