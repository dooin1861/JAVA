package java0711;

import java.util.Scanner;

public class EX04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int n;
		
		System.out.println("1부터 n까지의 합을 구하시오");
		
		do {
			System.out.print("n의 값: ");
			n = scan.nextInt();
		} while (n <= 0);
		
		int sum = 0;
		
		for (int i = 1; i < n; i++) {
			if (i < n) {
				System.out.print(i + "+");
				sum += i;              // sum에 i를 더함
		}
		
		}
		
		System.out.print(n + " = ");
		sum += n;                      // sum에 n을 더함
		System.out.print(sum);
	}
}