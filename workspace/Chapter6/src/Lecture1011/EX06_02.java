/*
 * fow loop를 사용하는 간단한 예제
 * for(초기식;조건식;증감식){
 *    반복실행할 문장
 * }
 */
package Lecture1011;

public class EX06_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, cnt=1;
		
		for(num=1;num<=100;num++){
			if((num % 7 == 0) || (num % 3 == 0)){ // % 식의 나머지를 활용하여 배수가 나오게끔 출력할수 있다.
				System.out.printf("%4d", num);
				cnt++;
				if(cnt ==11){
					System.out.printf("\n");
					cnt = 1;
				}// end of if(cnt
			}// end of or
		}// end of for(num....
	}// end of main
}// end of class EX06_02
