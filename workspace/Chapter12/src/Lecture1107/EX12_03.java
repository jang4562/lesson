package Lecture1107;

class CCar{
	CCar() {
		System.out.println("���� Ŭ���� ������ ȣ��(�Ķ���� ����)");
	}
	
	CCar(String str) {
		System.out.println("���� Ŭ���� ������ ȣ�� ==> " + str);
	}
}

class SSedan extends CCar {
	SSedan(String str) {
		
		System.out.println("���� Ŭ���� ������ ȣ�� ==> " + str);
	}
}

public class EX12_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SSedan sedan1 = new SSedan("�����~~");
	}

}
