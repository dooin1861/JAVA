package java0711;

import java.util.Scanner;

public class EX09 {
	public static void main(String[] args) {
		
		int n;
		
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("n값: ");
			n = scan.nextInt();
		} while (n < 10 || n > 99);
		
		System.out.println("변수 n의 값은 " + n + " 입니다");
	}
}
