package java0730;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("가나다", 85);
		map.put("바바바", 90);
		map.put("신용권 ", 80);
		map.put("홍길동 ", 80);
		System.out.println(map.size());
//		System.out.println(map.get("신용권"));
//		System.out.println(map.get("홍길동"));
//		System.out.println(map.get("가나다"));
//		System.out.println(map.get("바바바"));
		
		Set<String> kkk = map.keySet();
		for (String str : kkk) {
			System.out.print(str);
			System.out.println(map.get(str));
		}
		
		
		Set<Map.Entry<String, Integer>> es = map.entrySet();
		for (Map.Entry<String, Integer> kv : es) {
			String k = kv.getKey();
			Integer v = kv.getValue();
			String msg = MessageFormat.format("키는 {0}이고, 값은 {1}이다.", k, v);
			System.out.println(msg);
		}
	}
}
