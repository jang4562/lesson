package Lecture1010;

public class EX04_bitNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte v1 = 1;
		int v2 = ~v1;  
		// ��Ʈ NOT�����ڴ� intŸ������ ��ȯ �� NOT(����)ó���� �մϴ�. 
		// ���𸻰� int 
		
		//Integer.toBinaryString()
		System.out.println(Integer.toBinaryString(v1)+" ������ "+ v1);
		System.out.println(Integer.toBinaryString(v2)+ "������ "+ v2);
	}

}
