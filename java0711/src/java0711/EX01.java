package java0711;

import java.util.Scanner;

public class EX01 {
	
	public static int med (int a, int b, int c) {
		if ((b >= a && c <= a) || (b <= a && c >= a)) { // b가 a보다 크거나 같고 동시에 c가 a보다 작거나 같은 경우
			return a;
		} else if ((a > b && c < b) || (a < b && c > b)) {
			return b;
		} 
		return c;
		
//		if (a >= b) {
//			if (b >= c) {
//				return b;
//			} else if (a <= c) {
//				return a;
//			} else {
//				return c;
//			}
//		
//		} else if (a > c) { // a는 b보다 작다
//			return a;
//		} else if (b > c) { // a는 b보다 작다
//			return c;
//		} else { // a는 b보다 작고 a는 c보다 작거나 같다, b는 c보다 작거나 같다
//			return b;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("세 정수의 중앙값 구하기");
		System.out.println("a 값 : ");
		int a = scan.nextInt();
		System.out.println("b 값 : ");
		int b = scan.nextInt();
		System.out.println("c 값 : ");
		int c = scan.nextInt();
		
		System.out.println(med(a, b, c)); // med 메서드를 불러옴.
		
		scan.close();
		
//		if (a >= b) {
//			if (b >= c) {
//				System.out.printf("세 정수의 중앙값은 a이고 값은 : %d\n", a);
//			} else if (a <= c) {
//				System.out.printf("세 정수의 중앙값은 b이고 값은 : %d\n", b);
//			} else {
//				System.out.printf("세 정수의 중앙값은 c이고 값은 : %d\n", c);
//			}
//		} else if (a > c) { // a는 b보다 작다
//			System.out.println(a);
//		} else if (b > c) { // a는 b보다 작다
//			System.out.println(b);
//		} else { // a는 b보다 작고 a는 c보다 작거나 같다, b는 c보다 작거나 같다
//			System.out.println(c);
		
	}
}
