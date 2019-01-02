package example;

import java.util.*;

public class HashMapEx {
//	상품 DB를 구축하는 HashMap
	HashMap<String, ArrayList<String>> productdb;
	
	// 생성자
	public HashMapEx(){
		productdb = new HashMap<String, ArrayList<String>>();
		
		// 제조사별 제품 등록
		ArrayList<String> plist1 = new ArrayList<String>();
		ArrayList<String> plist2 = new ArrayList<String>();
		ArrayList<String> plist3 = new ArrayList<String>();
		
		plist1.addAll(Arrays.asList("스마트TV","갤럭시S7","노트20.1"));
		productdb.put("삼성", plist1);
		
		plist2.addAll(Arrays.asList("커브드TV","옵티무스G10","시원에어컨2"));
		productdb.put("엘지", plist2);
		
		plist3.addAll(Arrays.asList("애플TV","아이폰7S","아이패드프로"));
		productdb.put("애플", plist3);
	}
	void search() {
		System.out.println("## 상품 검색 ##");
		System.out.println("# 제조사를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		
		String p = scan.next();
		
		// 입력된 제조사의 상품 목록을 검색
		ArrayList<String> result = (ArrayList<String>)productdb.get(p);
		if(result != null) {
			for(String s : result) {
				System.out.println(s);
			}
		}
		else
			System.out.println("검색결과가 없습니다.!!");
			scan.close();
	}
	

	public static void main(String[] args) {
		HashMapEx app = new HashMapEx();
		app.search();
	}

}
