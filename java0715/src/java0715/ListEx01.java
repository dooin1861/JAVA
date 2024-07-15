package java0715;

import java.util.ArrayList;
import java.util.Iterator;

public class ListEx01 {
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();  // <String> = 제네릭 list = new ArrayList<String>();      
		
//		Object는 최상위 
//		ArrayList<String> list2 = new ArrayList<String>();
//		ArrayList<String> list3 = new ArrayList<>();
//		List<String> list4 = new ArrayList<String>();
		
		list.add("123");
		list.add("홍길동");
		list.add("ABC");
		list.add("123");
		
//		이터레이터 (자바 디자인 객체지향 코딩 패턴)
		
		Iterator<Object> it = list.iterator();
		while (it.hasNext()) {
			Object str = it.next();
			int num = (int)str + 100;
			System.out.println(num);
		
//		for (String str : list) {
//			System.out.println(str);
		}
	}
}
