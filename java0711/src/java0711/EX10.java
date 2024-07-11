package java0711;

public class EX10 {

	public static void main(String[] args) {
		int scores[] = {83, 90, 87};            // 방 3개에 값을 넣음
		int scores2[] = new int[] {83, 90, 87}; // 위랑 같음. 그러나 잘 쓰지 않는다.
		double sum = 0.0;
		double avg = 0;       // 평균을 구하는 건 double 사용
		
		System.out.println(scores[2]);
		
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총 합계 : " + sum);
		
		for (int i = 0; i < scores.length; i++) {
			avg = sum / scores.length;
			System.out.println("평균 : " + avg); 
		}
		
		int myArr[] = new int[5];               // 배열 생성 (초기화)
		
		for (int i = 0; i < 5; i++) {
			System.out.println(myArr[i]);
		}
		
		double myArr2[] = new double[5];
	
		for (int i = 0; i < 5; i++) {
			System.out.println(myArr2[i]);
		}
		
		boolean myArr3[] = new boolean[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println(myArr3[i]);
		}
	}
}
