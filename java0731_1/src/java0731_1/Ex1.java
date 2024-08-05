package java0731_1;

import java.util.HashMap;

public class Ex1 {
	public static void main(String [] args) {
		var map = new HashMap<String, Integer>();
		map.put("분", 99);
		map.put("홍", 98);
		map.put("신", 87);
		
		var es = map.entrySet();
		for (var mm : es) {
			var k1 = mm.getKey();
			System.out.println(k1);
			
			var v1 = mm.getValue();
			System.out.println(v1);
		}
	}
}
