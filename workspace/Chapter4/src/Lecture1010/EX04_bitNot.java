package Lecture1010;

public class EX04_bitNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte v1 = 1;
		int v2 = ~v1;  
		// 비트 NOT연산자는 int타입으로 변환 후 NOT(반전)처리를 합니다. 
		// 선언말고 int 
		
		//Integer.toBinaryString()
		System.out.println(Integer.toBinaryString(v1)+" 십진수 "+ v1);
		System.out.println(Integer.toBinaryString(v2)+ "십진수 "+ v2);
	}

}
