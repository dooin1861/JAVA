package Project1;

import java.util.Scanner;

public class Bank176P {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		String name1 = "";
		String name2 = "";
		String pass1 = "";
		String pass2 = "";
		String jumin = "";
		String phone = "";
		int balance = 0;

		while (run) {
			System.out.println("-----------------------------------------");
			System.out.println("1. 로그인 | 2. 회원가입 | 3. 예금/출금 | 4. 종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택 > ");
			
			int menuNum2 = Integer.parseInt(scan.nextLine());
			
			switch(menuNum2) {
		
				case 1:
					System.out.print("ID 입력하세요(본인이름) : ");
					name1 = scan.nextLine();
					System.out.print("비밀번호를 입력하세요 : ");
					pass1 = scan.nextLine();
				
					if (name1.equals(name2) && pass1.equals(pass2)) {
						System.out.print("\nID와 비밀번호가 확인되셨습니다.\n");
					} else {
						System.out.print("\nID와 비밀번호가 맞지 않습니다.\n");
					}
					break;
				
				case 2:
					System.out.print("이름을 입력하세요 : \n");
					name2 = scan.nextLine();
					
					System.out.print("사용할 비밀번호를 입력하세요 : \n");
					pass2 = scan.nextLine();
				
					System.out.print("주민번호 앞자리를 입력하세요 : \n");
					jumin = scan.nextLine();
				
					System.out.print("전화번호를 입력하세요 : \n");
					phone = scan.nextLine();
				
					System.out.println("\n[입력 정보 확인]\n");
					System.out.printf("이름 : %s\n", name2);
					System.out.printf("비밀번호 : %s\n", pass2);
					System.out.printf("가입자 주민번호 앞자리 : %s\n", jumin);
					System.out.printf("가입자 전화번호 : %s\n", phone);
					break;
				
				case 3:
					System.out.println("---------------------------------");
					System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
					System.out.println("---------------------------------");
					System.out.print("선택 > ");

					int menuNum = Integer.parseInt(scan.nextLine());

					switch (menuNum) {
						case 1:
							System.out.print("예금하실 금액: ");
							balance += Integer.parseInt(scan.nextLine());
							break;
						case 2:
							System.out.print("출금하실 금액: ");
							balance -= Integer.parseInt(scan.nextLine());
							break;
						case 3:
							System.out.print("잔고 : 원");
							System.out.println(balance);
							break;
						case 4:
							run = false;
							break;
					}
				
				case 4:
					System.out.println("\n프로그램 종료");
					run = false;
					break;
			
				}
			}
		scan.close();
	}
}

	