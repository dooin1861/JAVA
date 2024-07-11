package java0711;

import java.util.Scanner;

public class EX05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		
		System.out.println("+와 -를 번갈아 n개 출력");
		
		do {
			System.out.print("n값: ");
			n = scan.nextInt();
		} while (n <= 0);
		
	for (int i = 0; i < n/2; i++) {
		System.out.print("+-");
	}
	
	if (n % 2 != 0) {         // 홀수라면
		System.out.print("+");
	}
	
//	for (int i = 0; i < n; i++) {
//		if (i % 2 == 0)
//			System.out.print("+");
//		else
//			System.out.print("-");
//		}
	}
}