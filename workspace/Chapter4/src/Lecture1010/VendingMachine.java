package Lecture1010;
import java.util.Scanner;
public class VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int button ; // coke1, sprite2, fanta3
	int price_c=1000, price_s=900, price_f=800;//�� ������ ����
	int take, change=0; //���� ��, �Ž�����
	String drink= "";
	Scanner s = new Scanner(System.in);
	
	// ���� �޴� �κ� ó��
	System.out.print("���� �ּ��� ");
	take = s.nextInt(); // �Է¹��� �ݾ��� ���� ���� ����
	System.out.printf("\n");
	
	// ������ ������ �����ϴ� ó��
	System.out.print("���Ḧ �����ϼ���. �ݶ�:1 ���̴�:2 ȯŸ:3 ");
	button = s.nextInt(); //���� ���� ������ ������ ��ư�� ����
	System.out.printf("\n");

	// ���ῡ ���� ������ ó��
	if(button == 1 ){ //�ݶ� �� ��� ����
		if(take >= price_c){// ���� ���� �ݶ󰡰ݺ��� ũ�ų�������
			change = take - price_c; // �Ž����� ���
			System.out.println("�ݶ� ���Խ��ϴ�.");
			System.out.printf("�Ž�ƴ ���� %d���Դϴ�.\n", change);
			
		}// ���� ���� �ݶ󰡰ݺ��� ū��� ��
		else{// ���� ���� ���� ���
			System.out.println("�ݾ��� ���ڶ��ϴ�.");
		}
	}// �ݶ� �� ����� ��
	else if(button == 2){ // ���̴� �� ��� ����
		if(take >= price_s){// ���� ���� ���̴ٰ��ݺ��� ũ�ų�������
			change = take - price_s; // �Ž����� ���
			System.out.println("���̴ٰ� ���Խ��ϴ�.");
			System.out.printf("�Ž�ƴ ���� %d���Դϴ�.\n", change);
			
		}// ���� ���� ���̴ٰ��ݺ��� ū��� ��
		else{// ���� ���� ���� ���
			System.out.println("�ݾ��� ���ڶ��ϴ�.");
		}
	}// ���̴� �� ��� ��
	else if(button == 3) { // ȯŸ �� ��� ����
		if(take >= price_f){// ���� ���� ȯŸ���ݺ��� ũ�ų�������
			change = take - price_f; // �Ž����� ���
			System.out.println("ȯŸ�� ���Խ��ϴ�.");
			System.out.printf("�Ž�ƴ ���� %d���Դϴ�.\n", change);
			
		}// ���� ���� ȯŸ���ݺ��� ū��� ��
		else{// ���� ���� ���� ���
			System.out.println("�ݾ��� ���ڶ��ϴ�.");
		}
	}// ȯŸ �� ��� ��
	else{ // �� ��
		
	}// �� �� ��
	System.out.printf("%s�� ���Խ��ϴ�.", drink);
	System.out.printf("�ܵ��� %d�Դϴ�.", change);
	System.out.println("�����մϴ�. ���ְ� �弼��");
	}

}
