package Lecture1018;

public class EX08_3dArray {
	public static void main(String[] args){
		int[][][] score = new int [2][5][5];
		int jumsu = 1;
		
		for(int ban = 0;ban <2; ban ++){
			for(int stu = 0; stu < 3; stu++){
				for(int sub = 0; sub <3; sub++){
					score[ban][stu][sub] = jumsu++;
					score[ban][stu][3] += score[ban][stu][sub];//�����������
					score[ban][3][sub] += score[ban][stu][sub];//�����������
				}//end of for loop by sub
				score[ban][stu][4] += score[ban][stu][3] / 3; // ������հ��
			}//end of for loop by stu
			score[ban][4][0] = score[ban][3][0] / 3; // ������� ���
			score[ban][4][1] = score[ban][3][1] / 3;
			score[ban][4][2] = score[ban][3][2] / 3;
		}//end of for loop by ban
		
		//��º�
		for(int ban = 0;ban <2; ban ++){
			System.out.printf("%d�� ����\n", ban+1);
			System.out.printf("���� ���� �� �� ���� ���\n", ban+1);
			System.out.printf("------------------\n", ban+1);
			for(int stu = 0; stu < 5; stu++){
				for(int sub = 0; sub <5; sub++){
					System.out.printf("%5d", score[ban][stu][sub]);
				}//end of for loop by sub
				System.out.printf("\n");
			}//end of for loop by stu
			System.out.printf("\n\n\n");
		}//end of for loop by ban
	}
}
