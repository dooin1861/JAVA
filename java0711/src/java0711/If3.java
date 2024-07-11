package java0711;

import java.util.Scanner;

public class If3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력받은 연도가 윤년인지 계산하기 : ");
		
		int year = scan.nextInt();
		
		boolean isLeapYear = false;
		
		if (year % 4 == 0) {   // year를 4로 나눴을 때 나머지 값이 0인지 확인
			if (year % 100 != 0 || year % 400 == 0)  {  //year를 100으로 나눴을 때 나머지 값이 0과 다르거나
				isLeapYear = true;                      //year를 400으로 나눴을 때 0과 같다면 트루
			}
			  
		}
		
		if (isLeapYear) {
			System.out.println(year + "년은 윤년입니다.");
		} else {
			System.out.println(year + "년은 평년입니다.");
		}
	}

}
