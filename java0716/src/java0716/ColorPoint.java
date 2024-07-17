package java0716;

public class ColorPoint extends Point{  // extends 뒤에 다중 상속 불가능
	
	public ColorPoint() {
		super(100, 200);    // super는 맨 위로
		System.out.println("자식 기본 생성자 호출");
		System.out.println(x);
		method1();
	}
	
	public ColorPoint(int x, int y) {
		super (x, y); 
	}

	@Override
	void method1() {
		
		System.out.println("자식이 오버라이딩!");
		super.method1();  // super. 생략 가능
	}
}
