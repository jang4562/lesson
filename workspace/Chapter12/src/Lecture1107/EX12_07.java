package Lecture1107;

class Car7 {
	int speed = 0;
	
	final void upSpeed(int speed) {
		this.speed += speed;
	}
}

class Sedan7 extends Car7 {
	final static String CAR_TYPE="�¿���";
	
	// void upSpeed(int speed) {
	// �������� �޼ҵ� ����
    // }
}

public class EX12_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sedan Ŭ���� Ÿ�� -->" + Sedan7.CAR_TYPE);
	}

}
