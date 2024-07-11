package java0710;

public class Prob03 {
	public static void main(String[] args) {
		for(int j = 1; j < 10; j++) {            // 가로 인지 세로인지 방향은 5, 6줄 코드를 서로 위치바꿈.
			for(int i = 2; i < 10; i++) {
			
			System.out.printf("%d X %d = %d\t", i, j, i*j);
			}
			System.out.println();
		}
	}
}
