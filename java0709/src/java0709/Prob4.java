package java0709;

import java.util.Scanner;

public class Prob4 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("두 수를 입력");
		String str1, str2;
		
		int in1 = 0;
		int in2 = 0;
		int result = 0;
		
		for(;;) {
			System.out.println("숫자1을 입력");
			str1 = scan.nextLine();
			
			System.out.println("숫자2를 입력");
			str2 = scan.nextLine();
			
			in1 = Integer.parseInt(str1);
			in2 = Integer.parseInt(str2);
			
			if (in1 > in2) {
				result = in1;
			} else if (in1 == in2) {
				result = 0;
			} else {
				result = in2;
			}
			
			System.out.println(result);
			scan.close();
		}
	}
}
