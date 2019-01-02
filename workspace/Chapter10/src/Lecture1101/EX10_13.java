package Lecture1101;
import java.io.FileOutputStream;
public class EX10_13 {
	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("C:/temp/data3.txt");
		
		int ch;
		
		while ((ch = System.in.read()) != 13)
			fos.write((byte) ch);
		
		fos.close();
	}
}
