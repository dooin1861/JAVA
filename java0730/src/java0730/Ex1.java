package java0730;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class Ex1 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("Ken", 100));
		list.add(new Student("Shin", 60));
		list.add(new Student("Kim", 80));
		
		long num1 = list.stream().filter(s->s.getScore() >= 70).count();
			System.out.println(sum);
		
		long num2 = list.stream()   // Ken, 100이 필터를 타면서 카운트에 누적됨.
		.filter(s->s.getScore() >= 70).count(); // Shin은 70이하라 필터를 타도 카운트 X.
		System.out.println("70점 이상은 " + num2 + "명");
		
		list.stream()  // 스트림
		.filter(s->s.getScore() >= 70)  // 중간 작업
		.forEach(s->System.out.println(s.getName()));  // 최종 작업

		
		// 속도는 람다 식 보다 빠르다. (for-loop VS stream)
//		for (int i =0; i < list.size(); i++) { // 0번부터 list.size만큼 돌리고 점수가 70점 미만이면 리스트에서 제거
//			if (list.get(i).getScore() < 70) {
//				list.remove(i);
//			}
//		}
		
		// for문을 쓰지 않고 반복문 사용 가능
		list.stream().forEach(a-> {  // stream을 람다 식이라고 함.
			String msg = MessageFormat.format("{0}, {1}", a.getName(), a.getScore());
			System.out.println(msg);
		});
		
//		for (Student st : list) {
//			String msg = MessageFormat.format("{0}, {1}", st.getName(), st.getScore());
//			System.out.println(msg);
//		}
	}

}
