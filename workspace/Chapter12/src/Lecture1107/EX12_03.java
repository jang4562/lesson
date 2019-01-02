package Lecture1107;

class CCar{
	CCar() {
		System.out.println("슈퍼 클래스 생성자 호출(파라미터 없음)");
	}
	
	CCar(String str) {
		System.out.println("슈퍼 클래스 생성자 호출 ==> " + str);
	}
}

class SSedan extends CCar {
	SSedan(String str) {
		
		System.out.println("서브 클래스 생성자 호출 ==> " + str);
	}
}

public class EX12_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SSedan sedan1 = new SSedan("여기요~~");
	}

}
