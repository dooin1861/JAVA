package java0723;

public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B {     // static이 붙지 않은 클래스는 호출 가능
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	public static void main (String[] args) {
		System.out.println(A.field2); // static은 static인 애들끼리만 가능
//		A.B b = new A.B();
		A a = new A();
		System.out.println(a.field1);
		
//		A.B b = a.new B();
//		b.method();
	}
}
