package example;

import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		ArrayList<String> al2 = new ArrayList<String>();
		
		al1.add("È«±æµ¿");
		al1.add("¸ô¶ó¿ä");
		al1.add("10");
		
		al2.add("Çö´ë");
		al2.add("±â¾Æ");
		al2.add("100");
		
		al2.addAll(al1);
		
		for(int i = 0; i< al1.size();i++) {
			System.out.println(al1.get(i));
		}
		System.out.println("--------------");
		for(String s : al2) {
			System.out.println(s);
		}
	}
		
}		
		