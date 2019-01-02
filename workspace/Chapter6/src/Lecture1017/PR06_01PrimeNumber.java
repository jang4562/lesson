/*
 * 1~200의 수 중에서 소수를 출력하는 프로그램
 */
package Lecture1017;

public class PR06_01PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean prime = true;
		int cnt = 0;
		for(int i=2;i<=200;i++){
			prime = true;
			for(int j=2;j<i-1;j++){
				if(i % j == 0){
					prime = false;
					break;
				}// end of if
			}// end of for(int j=2.....
			if(prime == true) {
				System.out.printf("%5d", i);
				cnt++;
			}// end of if(prime ==
			if(cnt == 10){
				System.out.printf("\n");
				cnt = 0;
			}
		}// end of for(int i=2....
		System.out.printf("\n프로그램종료\n");
		
		
		
		
		
		/*
		 *  for(int i=2;i<200;i++){
		 *	if((i % 2) != 0 && (i % 3) != 0){
		 *		System.out.println(i);
		 *	}// end of if i % 2
		 */ }// end of for(int i=1....);

	

}
