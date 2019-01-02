/* 
 * 3차원 배열의 간단한 예, 학급, 학생, 학생의 과목별 성적
 */
package Lecture1018;

public class EX08_3dArray_example{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][][] score = new int [2][5][5];  // 2개반, 3명, 3과목, 총점, 평균
		int jumsu = 1;
		// 초기화부
		for(int ban = 0;ban < 2; ban++){
			for(int stu = 0; stu < 3; stu++){
				for(int sub = 0; sub < 3; sub++){
					score[ban][stu][sub]=jumsu++;
					score[ban][stu][3] += score[ban][stu][sub];//개인총점계산
					score[ban][3][sub] += score[ban][stu][sub];//과목총점계산
				}// end of for loop by sub
				score[ban][stu][4] += score[ban][stu][3] / 3;
			}// end of for loop by ban
			score[ban][4][0]=score[ban][3][0] / 3;  // 과목평균 계산
			score[ban][4][1]=score[ban][3][1] / 3;
			score[ban][4][2]=score[ban][3][2] / 3;
		}// end of for loop by ban

		// 출력부
		for(int ban = 0;ban < 2; ban++){
			System.out.printf("%d반 성적\n", ban+1);
			System.out.printf("국어 영어 수학 총점 평균\n", ban+1);
			System.out.printf("-----------------------\n", ban+1);
			for(int stu = 0; stu < 5; stu++){
				for(int sub = 0; sub < 5; sub++){
					System.out.printf("%5d", score[ban][stu][sub]);
				}// end of for loop by sub
				System.out.printf("\n");
			}// end of for loop by ban
			System.out.printf("\n\n\n");
		}// end of for loop by ban

	}

}
