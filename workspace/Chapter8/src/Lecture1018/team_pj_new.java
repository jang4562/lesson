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
public class team_pj_new {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int i,j; // ���� i�� �ð���,����j�� ���� ���� ���� 
		
		while(true){ //��ü ���� �ݺ�����
		System.out.printf("[�ð�]�� �Է����ּ���. �ð� : ");
		i = s.nextInt();
		System.out.printf("[��]�� �Է����ּ���. : �� ");
		j = s.nextInt();
		
		if(9<=i && i<=17){
			if(i == 9){
				if(0<= j && j<=49){
					System.out.printf("�Է��Ͻ� %02d��%02d���� [1����]�Դϴ�\n", i,j);
					}// end of if(0<= j && j<=49)
				else if(50<= j && j<=59){
					System.out.printf("�Է��Ͻ� %02d��%02d���� [���½ð�]�Դϴ�\n", i,j);
					}// end of else if(j<=50 && j<=59)
				else{
					System.out.println("�߸����Է��Դϴ�. �ٽ��Է����ּ���.");
					} //end of else
				}// end of if(i == 9)
			else if(i == 10){
				if(0<= j && j<=49){
					System.out.printf("�Է��Ͻ� %02d��%02d���� [2����]�Դϴ�\n", i,j);
					}// end of if(0<= j && j<=49)
				else if(50<= j && j<=59){
					System.out.printf("�Է��Ͻ� %02d��%02d���� [���½ð�]�Դϴ�\n", i,j);
					}// end of else if(j<=50 && j<=59)
				else{
					System.out.println("�߸����Է��Դϴ�. �ٽ��Է����ּ���.");
					} //end of else
				}// end of else if(i == 10)
			else if(i == 11){
				if(0<= j && j<=49){
					System.out.printf("�Է��Ͻ� %02d��%02d���� [3����]�Դϴ�\n", i,j);
					}// end of if(0<= j && j<=49)
				else if(50<= j && j<=59){
					System.out.printf("�Է��Ͻ� %02d��%02d���� [���½ð�]�Դϴ�\n", i,j);
					}// end of else if(j<=50 && j<=59)
				else{
					System.out.println("�߸����Է��Դϴ�. �ٽ��Է����ּ���.");
					}// end of else
				}// end of else if(i == 11)
			else if(i == 12){
				if(0<= j && j<=49){
					System.out.printf("�Է��Ͻ� %02d��%02d���� [4����]�Դϴ�\n", i,j);
					}// end of if(0<= j && j<=49)
				else if(50<= j && j<=59){
					System.out.printf("�Է��Ͻ� %02d��%02d���� [���� �ð�]�Դϴ�\n", i,j);
					}// end of else if(j<=50 && j<=59)
				else{
					System.out.println("�߸����Է��Դϴ�. �ٽ��Է����ּ���.");
					}// end of else
				}// end of else if(i == 12)
			else if(i == 13){
				if(0<= j && j<=29){
					System.out.printf("�Է��Ͻ� %02d��%02d���� [���� �ð�]�Դϴ�\n", i,j);
					}// end of if(0<= j && j<=49)
				else if(30<= j && j<=59){
					System.out.printf("�Է��Ͻ� %02d��%02d���� [5����]�Դϴ�\n", i,j);
					}// end of else if(j<=50 && j<=59)
				else{
					System.out.println("�߸����Է��Դϴ�. �ٽ��Է����ּ���.");
					}// end of else
				}// end of else if(i == 13)
			else if(i == 14){
				if(0<= j && j<=19){
					System.out.printf("�Է��Ͻ� %02d��%02d���� [5����]�Դϴ�\n", i,j);
					}// end of if(0<= j && j<=49)
				else if(20<= j && j<=29){
					System.out.printf("�Է��Ͻ� %02d��%02d���� [���� �ð�]�Դϴ�\n", i,j);
					}// end of else if(j<=50 && j<=59)
				else if(30<= j && j<=59){
					System.out.printf("�Է��Ͻ� %02d��%02d���� [6����]�Դϴ�\n", i,j);
				}// end of else if(30<= j && j<=59)
				else{
					System.out.println("�߸����Է��Դϴ�. �ٽ��Է����ּ���.");
					}// end of else
				}// end of else if(i == 14)
			else if(i == 15){
				if(0<= j && j<=19){
					System.out.printf("�Է��Ͻ� %02d��%02d���� [6����]�Դϴ�\n", i,j);
					}// end of if(0<= j && j<=49)
				else if(20<= j && j<=29){
					System.out.printf("�Է��Ͻ� %02d��%02d���� [���� �ð�]�Դϴ�\n", i,j);
					}// end of else if(j<=50 && j<=59)
				else if(30<= j && j<=59){
					System.out.printf("�Է��Ͻ� %02d��%02d���� [7����]�Դϴ�\n", i,j);
				}// end of else if(30<= j && j<=59)
				else{
					System.out.println("�߸����Է��Դϴ�. �ٽ��Է����ּ���.");
					}// end of else
				}// end of else if(i == 15) 
			else if(i == 16){
				if(0<= j && j<=19){
					System.out.printf("�Է��Ͻ� %02d��%02d���� [7����]�Դϴ�\n", i,j);
					}// end of if(0<= j && j<=49)
				else if(20<= j && j<=29){
					System.out.printf("�Է��Ͻ� %02d��%02d���� [���� �ð�]�Դϴ�\n", i,j);
					}// end of else if(j<=50 && j<=59)
				else if(30<= j && j<=59){
					System.out.printf("�Է��Ͻ� %02d��%02d���� [8����]�Դϴ�\n", i,j);
				}// end of else if(30<= j && j<=59)
				else{
					System.out.println("�߸����Է��Դϴ�. �ٽ��Է����ּ���.");
					}// end of else
				}// end of else if(i == 16)
			else if(i == 17){
				if(0<= j && j<=19){
					System.out.printf("�Է��Ͻ� %02d��%02d���� [8����]�Դϴ�\n", i,j);
					}// end of if(0<= j && j<=49)
				else if(20<= j && j<=59){
					System.out.printf("�Է��Ͻ� %02d��%02d���� �����ð��� �ƴմϴ�\n", i,j);
					}// end of else if(j<=50 && j<=59)
				else{
					System.out.println("�߸����Է��Դϴ�. �ٽ��Է����ּ���.");
					}// end of else
				}// end of else if(i == 17)
			}// end of if(9<=i && i<=17)
		else if(i == 0 && j == 0){
			System.out.println("�ý����� �����մϴ�");
			break;
		}else if(0<= i && i<=8 ){
			if(0<= j && j<=59){
				System.out.printf("�Է��Ͻ� %02d��%02d���� �����ð��� �ƴմϴ�\n", i,j);
				}//end of if(0<= j && j<=59)
			else{
				System.out.println("�߸����Է��Դϴ�. �ٽ��Է����ּ���.");
			}	
			}//end of else if
			else if(18<= i && i<=24 ){
				if(0<= j && j<=59){
					System.out.printf("�Է��Ͻ� %02d��%02d���� �����ð��� �ƴմϴ�\n", i,j);
					}//end of if(0<= j && j<=59)
				else{
					System.out.println("�߸����Է��Դϴ�. �ٽ��Է����ּ���.");
					}
			}//end of if(9<=i && i<=17) else
			else{
				System.out.println("�߸����Է��Դϴ�. �ٽ��Է����ּ���");
			}
		}// end of while(true)
	}// end of main

}// end of class
