package Lecture1107;

class Car {
	Car() {
		System.out.println("���� Ŭ���� ������ ȣ��~~");
	}
}

class Sedan extends Car {
	Sedan() {
		System.out.println("���� Ŭ���� ������ ȣ��~~");
	}
}


public class EX12_02 {
	public static void main(String[] args) {
		Sedan sedan1 = new Sedan();
	}
}
