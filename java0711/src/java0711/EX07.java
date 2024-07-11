package java0711;

import java.util.Scanner;

public class EX07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n, w;

		System.out.println("*를 n개마다 출력하되 w개마다 줄을 변경 ");
		
		do {
			System.out.print("n값: ");
			n = scan.nextInt();
		} while (n <= 0);
		
		do {
			System.out.print("w값: ");
			w = scan.nextInt();
		} while (w <= 0 || w > n);
			
		for (int i = 0; i < n / w; i++) {
			System.out.print("*".repeat(w));  // 줄바꿈
			if (i % w == w-1) {
				System.out.println();
			System.out.println("완료");
			}
		}
	}
		
}
