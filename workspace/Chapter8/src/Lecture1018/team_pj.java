/*
 * �Ϸ��ϰ�
 * 1. �⼮�ϼ��� ���
 * 2. "Y/N" (����1)
 * 3-1. Y�Է½� "�⼮�ϼ̽��ϴ�."���/N�Է½� "�Ἦ�Դϴ�." ���α׷� ����
 * 3-2. �⼮�� "1���� �����մϴ�."
 * 4-1. ���� ���� �� 0~59���� �Է��� ������ ���ǿ� ���� �޽��� ���
 * 4-2. 0~49���� ���ڸ� �Է½� "�������Դϴ�. �����ϼ���."
 * 4-3. 50~59���� ���� �Է½� "���� �ð��Դϴ�."
 */
package Lecture1018;
import java.util.Scanner;
public class team_pj {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String ok;
		

		System.out.println("�⼮�Ͻðڽ��ϱ�?  (Y/N) ��1");
		ok = s.next();
		
		if(ok.equals("Y") || ok.equals("y")){ // �빮�� Y �ҹ��� y �Ѵ��Է¹ް�
			System.out.println("�⼮�ϼ̽��ϴ�.");
			System.out.println("1���� ���� 8���� �����Դϴ�");
			System.out.println("[1����]�� 09��00��~09��49�� �����Դϴ�.59�� ������ ���½ð��Դϴ�.");
			System.out.println("[2����]�� 10��00��~10��49�� �����Դϴ�.59�� ������ ���½ð��Դϴ�.");
			System.out.println("[3����]�� 11��00��~11��49�� �����Դϴ�.59�� ������ ���½ð��Դϴ�.");
			System.out.println("[4����]�� 12��00��~12��49�� �����Դϴ�.");
			System.out.println("[12��50��~13��29�� ������ [���ɽð�]�Դϴ�");
			System.out.println("[5����]�� 13��30��~14��19�� �����Դϴ�.29�� ������ ���½ð��Դϴ�.");
			System.out.println("[6����]�� 14��30��~15��19�� �����Դϴ�.29�� ������ ���½ð��Դϴ�.");
			System.out.println("[7����]�� 15��30��~16��19�� �����Դϴ�.29�� ������ ���½ð��Դϴ�.");
			System.out.println("[8����]�� 16��30��~17��19�� �����Դϴ�.");
			System.out.println("������ �������ϴ�");

		}// end of if(ok.equals("Y")....
		else if(ok.equals("N") || ok.equals("n")){ // �빮�� N �ҹ��� n �Ѵ��Է¹ް�
			System.out.println("�Ἦ�Դϴ�.");
			
		}// end of else if(ok.equals("N").....
		else {System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ��Է����ּ���.\n"); 
			return; //while ������ return���� ���
		}// end of else...
	}// end of main

}// end of class
