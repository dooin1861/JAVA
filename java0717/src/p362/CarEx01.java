package p362;

public class CarEx01 {
	Tire frontLeftTire = new Tire("앞 왼쪽", 6);
	Tire frontRightTire = new Tire("앞 오른쪽", 2);
	Tire backLeftTire = new Tire("뒤 왼쪽", 3);
	Tire backRightTire = new Tire("뒤 오른쪽", 4);
	
	TireLoc run() {
		System.out.println("자동차가 달립니다.");
		if (frontLeftTire.roll()==false) {
			stop();
			return TireLoc.FrontLeftTire; };
		if (frontRightTire.roll()==false) {
			stop();
			return TireLoc.FrontRightTire; };
		if (backLeftTire.roll()==false) {
			stop();
			return TireLoc.BackLeftTire; };
		if (backRightTire.roll()==false) {
			stop();
			return TireLoc.BackRightTire; };
		
		return TireLoc.NoProblem;
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}

