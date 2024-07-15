package java0715;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorEx1 {
		public static void main(String[] args) {
			List<String> list = new Vector<>();// <String> = 제네릭 list = new ArrayList<String>();      
			
			list.add("123");
			list.add("홍길동");
			list.add("ABC");
			list.add("123");
			
//			이터레이터 (자바 디자인 객체지향 코딩 패턴)
			
			Iterator<String> it = list.iterator();
			while (it.hasNext()) {
				String str = it.next();
				System.out.println(str);
			
			
		}
	}
}
