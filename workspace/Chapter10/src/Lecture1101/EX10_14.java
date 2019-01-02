package Lecture1101;
import java.io.FileWriter;
import java.util.Scanner;
public class EX10_14 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		FileWriter fw = new FileWriter("C:/temp/data3.txt");
		String str;
		
		while (!(str = sc.nextLine()).equals(""))
			fw.write(str + "\r\n");
		
		fw.close();
	}

}
