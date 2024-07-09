package java0709;

import java.util.Scanner;

public class EX06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("숫자 입력: ");
		String input1 = scanner.nextLine();
		int num1 = Integer.parseInt(input1);
		
		if (num1 > 0) {
			System.out.println("양수");
		} else if (num1 < 0) {
			num1 = -num1;
			System.out.printf("값이 음수여서 양수로 변환됨: %d\n", num1);
		}
		
		scanner.close();
	}
}