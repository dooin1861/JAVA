package java0730;

import java.util.stream.IntStream;

public class Ex5 {

	public static void main(String[] args) {
		IntStream ii1 = IntStream.range(1, 5);
		IntStream ii2 = IntStream.rangeClosed(1, 5); // 위랑 다르게 5까지 나옴.
		
		IntStream ii3 = IntStream.rangeClosed(1, 10);
		
//		ii.forEach(System.out::println);
		
		// 위랑 같음.
		
		ii1.forEach(a->{
			System.out.println(a);
		});
		
		ii2.forEach(a->{
			System.out.println(a);
		});
	}
}
