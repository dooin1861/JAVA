package p362;

public class CarEx02 {
	public static void main(String... args) {
		CarEx01 car = new CarEx01();
		
		for (int i=1; i <= 5; i++) {
			TireLoc problemLocation = car.run();
			
			switch (problemLocation) {
			case FrontLeftTire:
				System.out.println("앞 왼쪽 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("앞 왼쪽", 15);
				break;
			case FrontRightTire:
				System.out.println("앞 오른쪽 HankookTire로 교체");
				car.frontRightTire = new HankookTire("앞 왼쪽", 13);
				break;
			case BackLeftTire:
				System.out.println("뒤 왼쪽 HankookTire로 교체");
				car.backLeftTire = new HankookTire("앞 왼쪽", 14);
				break;
			case BackRightTire:
				System.out.println("뒤 오른쪽 HankookTire로 교체");
				car.backRightTire = new HankookTire("앞 왼쪽", 17);
				break;
			case NoProblem:
				System.out.println("문제 없음");
				break;
			}
			System.out.println("---------------------------");
		}
	}
}
