package Lecture1024;
import java.util.Scanner;
public class PR09_01 {
	   public static void main(String args[]){
		   String str = "    �ѱ�    ABCD    efgh";
		   String strSub;
		   String result = "";
		   
		   strSub = str.substring(4,6);
		   System.out.println("�� ���ڿ� ==> [" + str + "]");
		   System.out.println("�빮�ڷ� ==> [" + str.toUpperCase() + "]");
		   System.out.println("�ҹ��ڷ� ==> [" + str.toLowerCase() + "]");
		   System.out.println("�������� ==> [" + str.trim() + "]");
		   System.out.println(strSub);
		   
		   for(int i = 0; i < str.length(); i++){
			   if(str.charAt(i) != ' ')
				   result += str.substring(i,i+1);
		   }
		   System.out.println("�������� ==> [" + result + "]");
	   }
}