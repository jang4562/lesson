package Lecture1017;
import java.util.Scanner;
public class pr01_01 {

	public static void main(String[] args) {
		int num; //�Է¹��� ������ ����
		Scanner s = new Scanner(System.in);
		
		System.out.println("���Ͻô� ���ڸ� �Է��ϼ���. ");
		num = s.nextInt(); // �Է¹��� ���� ���� num�� ����
		boolean prime = false;
		for(int i =2; i <= num/2; ++i){
			if(num % i ==0){
				prime = true;
				break;
			}// end of if
		}// end of for(int i =2....
		if(prime){
			System.out.println("�Ҽ��� �ƴմϴ�");
		}else{
			System.out.println("�Ҽ��� �½��ϴ�");
		}
		
		
		
		
	}
}