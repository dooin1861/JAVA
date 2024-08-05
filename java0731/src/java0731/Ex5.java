package java0731;

import java.util.Arrays;
import java.util.List;

public class Ex5 {

	public static void main (String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", Member.MALE, 24),
				new Member("고길동", Member.FEMALE, 29),
				new Member("박길동", Member.MALE, 34),
				new Member("최길동", Member.FEMALE, 22)
				);
		// 전체 평균 나이
		double avgAll = list.stream().mapToDouble(Member::getAge).average().orElse(0);
		System.out.println("전체의 평균 나이: " + avgAll);
		
		double avgMale = list.stream()
				.filter(x->x.getSex() == Member.MALE) // 남자만 필터링
				.mapToDouble(a->a.getAge())
				.average().orElse(0);
		System.out.println("남성의 평균 나이: " + avgMale);
	}
}
