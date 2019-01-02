package Lecture1018;
import java.util.Scanner;
public class EX08_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int row, col;
		
		System.out.print("행 개수를 입력 : ");
		row = s.nextInt();
		System.out.print("열 개수를 입력 : ");
		col = s.nextInt();
		
		int [][] a = new int[row][col];
		
		int cnt = 1;
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				a[i][j] = cnt++;
			}
		}
		
		System.out.printf("a[0][0]부터 a[%d][%d]까지 출력 \n",row,col);
		
		for(int i = 0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.printf("%3d", a[i][j]);
			}
			System.out.printf("\n");
		}
	}

}
