package java0710;

import java.util.Scanner;

public class EX10 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------------------------------");
			System.out.println("선택: ");
			
			String input = scan.nextLine();
			
			System.out.println("현재 잔고는 : " + balance + "원");
			switch (input) {
				case "1":
					System.out.println("예금액 입력 : ");
					balance += Integer.parseInt(scan.nextLine());
					break;

				case "2":
					System.out.println("출금액 입력: ");
					int amount = Integer.parseInt(scan.nextLine());
					if (amount <= balance) {
						balance -= amount;
					} else {
						System.out.println("잔고가 부족해요.");
					}
					break;
				case "3":
					System.out.printf("현재 잔고는: %d원 이에요", balance);
					break;
				case "4":
					run = false;
					System.out.println("프로그램 종료");
					break;
				default:
					System.out.println("잘못된 입력이에요. 1, 2, 3, 4중에서 선택하세요.");
					
			}
		}
	}
}
