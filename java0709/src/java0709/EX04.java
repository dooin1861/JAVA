package java0709;

import java.util.Scanner;

public class EX04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("첫번째 값 입력: ");
		String input1 = scanner.nextLine();
		int num1 = Integer.parseInt(input1);
		
		System.out.print("두번째 값 입력: ");
		String input2 = scanner.nextLine();
		int num2 = Integer.parseInt(input2);
		
		if (num1 < num2) {
			System.out.printf("num2가 num1보다 %d 만큼 더 크다\n", num2 - num1);
		} else if (num1 > num2){
			System.out.printf("num1가 num2보다 %d 만큼 더 크다\n", num1 - num2);
		} else {
			System.out.printf("num1과 num2가 값이 같다");
		}
		scanner.close();
	}
}
