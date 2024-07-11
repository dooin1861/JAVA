package java0711;

public class Max {
	public static void main(String[] args) {
		int a[] = {1, 3, 10, 2, 8};
		int max = a[0];
		
		for (int i = 1; i < a.length; i++) { // i가 a보다 작으면 1씩 증가 시킴
			if (max < a[i]) {                // max가 a보다 작은지를 확인
				max = a[i];                  // 조건이 충족되면 max를 a값과 동일하게 갱신
			}
		}
		
		System.out.print("최대값 : " + max);
	}
}
