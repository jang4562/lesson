// 면을 추가해본 복습분
package Lecture1024;

public class PR08_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k = 0;
		int [][][] a =  { // 면,행,열 부분을 초기화함
				{
				{1,2,3,0,0},
				{4,5,6,0,0},
				{7,8,9,0,0},
				{0,0,0,0,0},
				{0,0,0,0,0}
				}
				,
				{
				{10,11,12,0,0},
				{13,14,15,0,0},
				{16,17,18,0,0},
				{0,0,0,0,0},
				{0,0,0,0,0}
				}
						};
		
		for(k = 0; k <2; k++){
		for(i = 0; i < 3; i++){
			for(j = 0; j < 3; j++){
				
				a[k][i][3] += a[k][i][j];
				a[k][3][j] += a[k][i][j];
			}// end of for(j
			a[k][i][4] = a[k][i][j] / 3 ;
		}// end of for(i
		/*
		a[k][4][0] += a[k][3][0] / 3;
		a[k][4][1] += a[k][3][1] / 3;
		a[k][4][2] += a[k][3][2] / 3;
		*/
		for(j = 0; j<3; j++){
			a[k][4][j] = a[k][i][j] / 3;
		}
		}//end of for(k
		
		//출력문
		for(k=0;k<2;k++){
		System.out.printf("%d반의 성적\n",k+1);
		System.out.println("국어/영어/수학/총합/평균");
		System.out.println("----------------");
		for(i=0;i<5;i++){
			for(j=0;j<5;j++){
				System.out.printf("%3d", a[k][i][j]);
			}// end of for(j 
				System.out.printf("\n");
		}// end of for(i 
	}// end of for(k 반
	}// end of main

}// end of class
