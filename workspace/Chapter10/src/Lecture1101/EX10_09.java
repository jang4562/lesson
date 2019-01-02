package Lecture1101;
import java.io.FileInputStream;
public class EX10_09 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:/temp/data3.txt");
		
		int ch;
		
		while ((ch = fis.read()) != -1)
		System.out.print((char) ch);
		
		fis.close();
	}

}
