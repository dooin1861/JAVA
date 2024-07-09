package java0709;

import java.util.Scanner;

public class EX05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("학점 입력: ");
		String input1 = scanner.nextLine();
		int num1 = Integer.parseInt(input1);
		
		if (num1 < 0 || num1 > 100) {
			System.out.println("유효한 숫자를 입력 (100까지)");
		} else {
			if (num1 >= 90) {
				System.out.println("A");
			} else if (num1 >= 80) {
				System.out.println("B");
			} else if (num1 >= 70) {
				System.out.println("C");
			} else if (num1 >= 60) {
				System.out.println("D");
			} else if (num1 >= 50) {
				System.out.println("E");
			} else {
				System.out.println("F");
			}
			scanner.close(); 
		}
	}
}
