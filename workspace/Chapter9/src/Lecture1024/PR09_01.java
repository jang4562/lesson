package Lecture1024;
import java.util.Scanner;
public class PR09_01 {
	   public static void main(String args[]){
		   String str = "    한글    ABCD    efgh";
		   String strSub;
		   String result = "";
		   
		   strSub = str.substring(4,6);
		   System.out.println("원 문자열 ==> [" + str + "]");
		   System.out.println("대문자로 ==> [" + str.toUpperCase() + "]");
		   System.out.println("소문자로 ==> [" + str.toLowerCase() + "]");
		   System.out.println("공백제거 ==> [" + str.trim() + "]");
		   System.out.println(strSub);
		   
		   for(int i = 0; i < str.length(); i++){
			   if(str.charAt(i) != ' ')
				   result += str.substring(i,i+1);
		   }
		   System.out.println("공백제거 ==> [" + result + "]");
	   }
}