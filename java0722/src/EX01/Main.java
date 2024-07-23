package EX01;

public class Main {

	public static void main(String[] args) {
//		A a = new A();
//		A.B b = new B();
		
		A.B b = new A().new B(); // 한번에 선언 가능
//		A.B b = new A.B();       // 불가능
		
		A.C c = new A.C();
	}
}
