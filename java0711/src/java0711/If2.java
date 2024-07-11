package java0711;

import java.util.Scanner;

public class If2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학점에 따른 등급 매기기");
		
		int grade = scan.nextInt();
		
		if (grade >= 90) {
			System.out.println("A");
		} else if (grade >= 80) {
			System.out.println("B");
		} else if (grade >= 70) {
			System.out.println("c");
		} else if (grade >= 60) {
			System.out.println("D");
		} else if (grade >= 50) {
			System.out.println("E");
		} else {
			System.out.println("F");
		}
		
		scan.close();
	}	
}

