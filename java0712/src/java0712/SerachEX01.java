package java0712;

import java.util.Scanner;

public class SerachEX01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String a[] = {"Hello", "자바", "World", "Spring", "Python"};
		String val;
		
		System.out.print("찾을 문자열 : ");
		val = scan.nextLine();
		int find = -1;    // 찾기 전 또는 못찾았을 때
		
		for (int i = 0; i < a.length; i++) {
			if (a[i].equals(val)) { // val 문자형이라 .equalsq
				find = i;
				break;
			}
		}
		
		System.out.println("인덱스: " + find);
	}
}
