package java0709;

import java.util.Scanner;

public class Prob06 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("학점 입력: ");
		String input1 = scanner.nextLine();
		int num1 = Integer.parseInt(input1);
		
		switch(num1/10) { // 몫을 계산
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		case 5:
			System.out.println("E");
			break;
		default:
			System.out.println("F");
		
		
		}
	}
}

