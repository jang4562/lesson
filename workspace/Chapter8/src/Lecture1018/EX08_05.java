package Lecture1018;

public class EX08_05 {
	public static void main(String[] args){
		int aa[] = new int[100];
		int	bb[] = new int[100];
		int i;
		int cnt = 0;
		
		for(i = 0;i < 100; i++){ // 문자출력용 for문을 따로만들어서 출력해야함 
			aa[i] = i * 2 ;
			System.out.printf("%d\t", aa[i]);
//			cnt ++;
//			if(cnt == 10){ System.out.printf("\n");
//			cnt = 0;
//			}
		}// end of for( i = 0.....
		System.out.printf("\n");
		for(i = 99;0 <= i; i--){ // for(i = 0;i < 100; i++);
			bb[i] = i * 2 ; // bb[99-i] = aa[i];
			System.out.printf("%d\t", bb[i]);
//			cnt ++;			
//			if(cnt == 10){ System.out.printf("\n");
//			cnt = 0;
//			}
		}// end of for( i = 99...
		
	}
	
}
