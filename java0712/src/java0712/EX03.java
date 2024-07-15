package java0712;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class EX03 {
	
	public static void main(String[] args) {
//		int[] lotto = new int[6]; // 인덱스 0~5 (개수 6개)
		Random rand = new Random();
		Set <Integer> lottoSet = new HashSet<>(); // 중복이 일어나지 않게 Set 사용
		
		while (lottoSet.size() < 6) {
			int number = rand.nextInt(45) + 1;
			lottoSet.add(number);
		}
		
//		lottoSet.add(14);
//		lottoSet.add(14);
//		lottoSet.add(7);
//		lottoSet.add(5);
//		System.out.println(lottoSet.size()); 
		System.out.println(lottoSet);
		
	}

}
