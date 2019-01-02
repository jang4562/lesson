/*
 * 중첩된 For loop의 개념을 간단한 예제를 통해 확인
 * 중첩 For loop의 Syntax
 * for(초기식;조건식;증감식){
 *     실행할 문장
 * 	   for(초기식;조건식;증감식){
 * 		     실행할 문장;
 *     }// inner for loop
 * }//outer for loop
 */
package Lecture1017;

public class EX06_00NestedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<10;i+=3){
			System.out.printf("=== %d 단 === \t",i); // 18행부터 20행까지는 가로로 보이게끔
			System.out.printf("=== %d 단 === \t",i+1); // 해주는 작업 
			System.out.printf("=== %d 단 === \n",i+2);
			for(int j=1;j<10;j++){
				System.out.printf("%3d * %3d = %3d\t", i,j,i*j); // 마찬가지로 22행부터
				System.out.printf("%3d * %3d = %3d\t", i+1,j,(i+1)*j); // 23행까지 작업을
				System.out.printf("%3d * %3d = %3d\n", i+2,j,(i+2)*j); // 해줘야 가로로 정렬되보임
			}// end of for(int j=0;....)
		}// end of for(int i=0;....)
		
		
	}// end of main

}// end of class Ex06_00NestedFor
