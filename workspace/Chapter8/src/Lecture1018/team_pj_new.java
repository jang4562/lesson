/*
 * 하루일과
 * 1. 출석하세요 출력
 * 2. "Y/N" (선택1)
 * 3-1. Y입력시 "출석하셨습니다."출력/N입력시 "결석입니다." 프로그램 종료
 * 3-2. 출석시 "1교시 시작합니다."
 * 4-1. 수업 시작 후 0~59까지 입력을 받으면 조건에 따라 메시지 출력
 * 4-2. 0~49안의 숫자를 입력시 "수업중입니다. 공부하세요."
 * 4-3. 50~59안의 숫자 입력시 "쉬는 시간입니다."
 */
package Lecture1018;
import java.util.Scanner;
public class team_pj_new {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int i,j; // 변수 i를 시간을,변수j를 분을 위해 선언 
		
		while(true){ //전체 적인 반복구문
		System.out.printf("[시간]을 입력해주세요. 시간 : ");
		i = s.nextInt();
		System.out.printf("[분]을 입력해주세요. : 분 ");
		j = s.nextInt();
		
		if(9<=i && i<=17){
			if(i == 9){
				if(0<= j && j<=49){
					System.out.printf("입력하신 %02d시%02d분은 [1교시]입니다\n", i,j);
					}// end of if(0<= j && j<=49)
				else if(50<= j && j<=59){
					System.out.printf("입력하신 %02d시%02d분은 [쉬는시간]입니다\n", i,j);
					}// end of else if(j<=50 && j<=59)
				else{
					System.out.println("잘못된입력입니다. 다시입력해주세요.");
					} //end of else
				}// end of if(i == 9)
			else if(i == 10){
				if(0<= j && j<=49){
					System.out.printf("입력하신 %02d시%02d분은 [2교시]입니다\n", i,j);
					}// end of if(0<= j && j<=49)
				else if(50<= j && j<=59){
					System.out.printf("입력하신 %02d시%02d분은 [쉬는시간]입니다\n", i,j);
					}// end of else if(j<=50 && j<=59)
				else{
					System.out.println("잘못된입력입니다. 다시입력해주세요.");
					} //end of else
				}// end of else if(i == 10)
			else if(i == 11){
				if(0<= j && j<=49){
					System.out.printf("입력하신 %02d시%02d분은 [3교시]입니다\n", i,j);
					}// end of if(0<= j && j<=49)
				else if(50<= j && j<=59){
					System.out.printf("입력하신 %02d시%02d분은 [쉬는시간]입니다\n", i,j);
					}// end of else if(j<=50 && j<=59)
				else{
					System.out.println("잘못된입력입니다. 다시입력해주세요.");
					}// end of else
				}// end of else if(i == 11)
			else if(i == 12){
				if(0<= j && j<=49){
					System.out.printf("입력하신 %02d시%02d분은 [4교시]입니다\n", i,j);
					}// end of if(0<= j && j<=49)
				else if(50<= j && j<=59){
					System.out.printf("입력하신 %02d시%02d분은 [점심 시간]입니다\n", i,j);
					}// end of else if(j<=50 && j<=59)
				else{
					System.out.println("잘못된입력입니다. 다시입력해주세요.");
					}// end of else
				}// end of else if(i == 12)
			else if(i == 13){
				if(0<= j && j<=29){
					System.out.printf("입력하신 %02d시%02d분은 [점심 시간]입니다\n", i,j);
					}// end of if(0<= j && j<=49)
				else if(30<= j && j<=59){
					System.out.printf("입력하신 %02d시%02d분은 [5교시]입니다\n", i,j);
					}// end of else if(j<=50 && j<=59)
				else{
					System.out.println("잘못된입력입니다. 다시입력해주세요.");
					}// end of else
				}// end of else if(i == 13)
			else if(i == 14){
				if(0<= j && j<=19){
					System.out.printf("입력하신 %02d시%02d분은 [5교시]입니다\n", i,j);
					}// end of if(0<= j && j<=49)
				else if(20<= j && j<=29){
					System.out.printf("입력하신 %02d시%02d분은 [쉬는 시간]입니다\n", i,j);
					}// end of else if(j<=50 && j<=59)
				else if(30<= j && j<=59){
					System.out.printf("입력하신 %02d시%02d분은 [6교시]입니다\n", i,j);
				}// end of else if(30<= j && j<=59)
				else{
					System.out.println("잘못된입력입니다. 다시입력해주세요.");
					}// end of else
				}// end of else if(i == 14)
			else if(i == 15){
				if(0<= j && j<=19){
					System.out.printf("입력하신 %02d시%02d분은 [6교시]입니다\n", i,j);
					}// end of if(0<= j && j<=49)
				else if(20<= j && j<=29){
					System.out.printf("입력하신 %02d시%02d분은 [쉬는 시간]입니다\n", i,j);
					}// end of else if(j<=50 && j<=59)
				else if(30<= j && j<=59){
					System.out.printf("입력하신 %02d시%02d분은 [7교시]입니다\n", i,j);
				}// end of else if(30<= j && j<=59)
				else{
					System.out.println("잘못된입력입니다. 다시입력해주세요.");
					}// end of else
				}// end of else if(i == 15) 
			else if(i == 16){
				if(0<= j && j<=19){
					System.out.printf("입력하신 %02d시%02d분은 [7교시]입니다\n", i,j);
					}// end of if(0<= j && j<=49)
				else if(20<= j && j<=29){
					System.out.printf("입력하신 %02d시%02d분은 [쉬는 시간]입니다\n", i,j);
					}// end of else if(j<=50 && j<=59)
				else if(30<= j && j<=59){
					System.out.printf("입력하신 %02d시%02d분은 [8교시]입니다\n", i,j);
				}// end of else if(30<= j && j<=59)
				else{
					System.out.println("잘못된입력입니다. 다시입력해주세요.");
					}// end of else
				}// end of else if(i == 16)
			else if(i == 17){
				if(0<= j && j<=19){
					System.out.printf("입력하신 %02d시%02d분은 [8교시]입니다\n", i,j);
					}// end of if(0<= j && j<=49)
				else if(20<= j && j<=59){
					System.out.printf("입력하신 %02d시%02d분은 수업시간이 아닙니다\n", i,j);
					}// end of else if(j<=50 && j<=59)
				else{
					System.out.println("잘못된입력입니다. 다시입력해주세요.");
					}// end of else
				}// end of else if(i == 17)
			}// end of if(9<=i && i<=17)
		else if(i == 0 && j == 0){
			System.out.println("시스템을 종료합니다");
			break;
		}else if(0<= i && i<=8 ){
			if(0<= j && j<=59){
				System.out.printf("입력하신 %02d시%02d분은 수업시간이 아닙니다\n", i,j);
				}//end of if(0<= j && j<=59)
			else{
				System.out.println("잘못된입력입니다. 다시입력해주세요.");
			}	
			}//end of else if
			else if(18<= i && i<=24 ){
				if(0<= j && j<=59){
					System.out.printf("입력하신 %02d시%02d분은 수업시간이 아닙니다\n", i,j);
					}//end of if(0<= j && j<=59)
				else{
					System.out.println("잘못된입력입니다. 다시입력해주세요.");
					}
			}//end of if(9<=i && i<=17) else
			else{
				System.out.println("잘못된입력입니다. 다시입력해주세요");
			}
		}// end of while(true)
	}// end of main

}// end of class
