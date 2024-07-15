package java0712;

import java.util.Scanner;

public class EX07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("학생 수 입력: ");
		int num1 = Integer.parseInt(scan.nextLine());
		double scores[][] = new double[num1][3]; // 국어, 수학, 평균
		
		for (int i=0; i < scores.length; i++) {
			System.out.println(i+1 + "번째 학생 ");
			System.out.println("국어 점수 입력: ");
			scores[i][0] = Double.parseDouble(scan.nextLine());
			
			System.out.println("수학 점수 입력: ");
			scores[i][1] = Double.parseDouble(scan.nextLine());
				
			scores[i][2] = (scores[i][0] + scores[i][1]) / 2;  // 평균 구하기
		
		}		
		System.out.printf("\t국어\t수학\t평균\n");
		System.out.println("===============================");
		for (int i=0; i < scores.length; i++) {
			
			System.out.printf("%d번 학생\t%3.2f\t%3.2f\t%3.2f\n", i+1, scores[i][0], scores[i][1], scores[i][2]);
		}
	}
}
