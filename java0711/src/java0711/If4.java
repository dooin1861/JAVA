package java0711;

import java.util.Scanner;

public class If4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력 받은 숫자 중 어느 쪽 숫자가 더 큰지 비교하기 : \n");
		
		System.out.println("첫 번째 숫자 입력: ");
		int num1 = scan.nextInt();
		
		System.out.println("두 번째 숫자 입력: ");
		int num2 = scan.nextInt();
		
		
		if (num1 > num2) {
			int num3 = num1 - num2;
			System.out.printf("첫 번째 숫자가 %d만큼 더 크다\n", num3);
		} else if (num1 < num2) {
			int num3 = num2 - num1;
			System.out.printf("두 번째 숫자가 %d만큼 더 크다\n", num3);
		} else {
			System.out.println("둘의 숫자는 같다.");
		}
	}
}
