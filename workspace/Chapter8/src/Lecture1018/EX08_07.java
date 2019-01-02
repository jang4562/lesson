package Lecture1018;

public class EX08_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int [3][4];
		int cnt=1;
		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++){
				a[i][j] = cnt ++;
				}
		}
		     	
		   
		   
		   for(int i=0;i<3;i++){
		   	for(int j=0;j<4;j++){
		   		System.out.printf("%4d",a[i][j]);
		   		}
		   	System.out.println();
		   }
	}
}

