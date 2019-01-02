package Lecture1010;
import java.util.Scanner; // 선생님이 입력한 스캐너 //
public class EX03_06 {

	public static void main(String[] args) {
	System.out.printf("\n줄바꿈\n연습 \n");
	System.out.printf("\t탭키\t연습 \n");
	System.out.printf("이것을\r덮어씁니다 \n");
	System.out.printf("글짜가 \"강조\"되는 효과 \n");
	System.out.printf("\\\\\\ 역슬래시 세개 출력 \n");
	
	int a; //변수 A를 선언 (선생님이 입력)
	Scanner s = new Scanner(System.in); // 스캐너 호출 //
	System.out.print("데이터를 입력해주세요[ ]");
	System.out.printf("\b\b"); // 빽스페이스 두번으로 [ ]안에 들어가게함 //
	a = s.nextInt(); //,가 아닌 .을 입력 그리고 숫자만입력 //
	System.out.printf("%d\n", a);
		
	}

}
