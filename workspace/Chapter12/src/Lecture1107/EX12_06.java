package Lecture1107;
	
class Car6 {
	int speed = 0;
	
	void upSpeed(int speed) {
		this.speed += speed;
		System.out.println("����ӵ�(����Ŭ����); : " + this.speed);
	}
}

class Sedan6 extends Car6 {
	void upSpeed(int speed) {
		super.upSpeed(speed);
		this.speed += speed;
		if (this.speed > 150)
			this.speed = 150;
		System.out.println("����ӵ�(����Ŭ����) : " + this.speed);
	}
}

class Truck6 extends Car6 {
}

public class EX12_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck6 truck1 = new Truck6();
		Sedan6 sedan1 = new Sedan6();
		
		System.out.print("Ʈ�� -> ");
		truck1.upSpeed(200);
		
		System.out.print("�¿��� -> ");
		sedan1.upSpeed(200);
	}

}
