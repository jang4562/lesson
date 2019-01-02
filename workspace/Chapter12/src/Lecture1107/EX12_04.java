package Lecture1107;

class CCCar {
	private String color;
	int speed;
}

class SSSedan extends CCCar {
	void setSpeed(int speed) {
		this.speed = speed;
	}
	/*
	void setColor(String color) {
		this.color = color;
	}
	*/
}

public class EX12_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SSSedan sedan1 = new SSSedan();
		
		sedan1.setSpeed(300);
		System.out.println("½Â¿ëÂ÷ ¼Óµµ ==> " + sedan1.speed);

	}

}
