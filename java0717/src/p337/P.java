package p337;

public class P { // final 클래스를 쓰면 상속 불가능
	final int x;
	
	P(int x) {
		this.x = x;
	}
	
	final void method1() {
		System.out.println(x); // 메소드에 fianl을 붙이면 재정의를 못함
	}
}
