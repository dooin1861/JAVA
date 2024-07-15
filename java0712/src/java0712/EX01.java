package java0712;

import java.util.Scanner;

public class EX01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("로또 번호 뽑기\n");
		
		for (int i=0; i < 6; i++) {
//			 System.out.println(Math.random());
			System.out.println((int)(Math.random()* 45+1)); // Math.random 앞에 타입을 붙이면 그 타입에 맞는 값이 나옴
		}
	}
}
