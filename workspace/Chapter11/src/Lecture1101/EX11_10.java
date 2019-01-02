package Lecture1101;

class CCCar {
	String color;
	int speed;
	static int count = 0;
	
	CCCar () {
		count++;
	}
}

public class EX11_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCCar myCar1 = new CCCar();
		System.out.println("현재 생상된 자동차 숫자 ==> " + myCar1.count);
		
		CCCar myCar2 = new CCCar();
		System.out.println("현재 생상된 자동차 숫자 ==> " + myCar2.count);
		
		CCCar myCar3 = new CCCar();
		System.out.println("현재 생상된 자동차 숫자 ==> " + CCCar.count);
		
	}

}
