package EX01;


// 바깥 클래스
public class A {
	
	// 인스턴스 필드
	B field1 = new B();  // 자바 버전 11에서는 허용됨
	C field2 = new C();
			
	// 인스턴스 메서드
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	// 정적 필드 초기화
//	static B field3 = new B(); // B는 스태틱으로 할 수 없다
	static C field4 = new C();
	
	// 정적 메서드
	static void method2() {
//		B var1 = new B(); 
		C var2 = new C();
	}
	
	// 인스턴스 멤버 클래스
	class B {}
	
	
	// 정적 멤버 클래스
	static class C {}
}
