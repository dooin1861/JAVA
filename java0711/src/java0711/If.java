package java0711;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("수를 입력하시오 : ");
		int number = scan.nextInt();
		
		if (number > 0) {
			System.out.printf("입력한 수 %d는 정수 입니다.", number);
		} else if (number < 0) {
			System.out.printf("입력한 수 %d는 음수 입니다.", number);
		} else {
			System.out.printf("입력한 수 %d는 0 입니다.", number);
		}
	}
}
