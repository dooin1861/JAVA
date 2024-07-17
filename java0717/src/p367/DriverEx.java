package p367;

import java.util.Scanner;

public class DriverEx {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("차량을 선택하세요 (1: 버스, 2: 택시) : ");
		int num = scan.nextInt();
		
		Driver driver = new Driver();
		Vehicle v1 = null;
		
//		switch (num) {
//		case 1: v1 = new Bus();
//			break;
//		case 2: v1 = new Taxi();
//			break;
//		default:
//			System.out.println("선택 오류");
//		}
		
		if (num == 1) {
			v1 = new Bus();
			System.out.println(v1);
		} else if (num == 2) {
			v1 = new Taxi();
			System.out.println(v1);
		} else {
			System.out.println("선택 오류");
		}
		
//		Bus bus = new Bus();
//		Taxi taxi = new Taxi();
//		Vehicle vehicle = new Vehicle();
//		Vehicle v1 = new Bus();
		
		driver.driver(v1);
		
	}
}

