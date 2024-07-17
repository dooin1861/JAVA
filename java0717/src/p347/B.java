package p347;

public class B {

	void method() {
		A a = new A();
		a.field = "value";
		a.method();          // protected 접근 제한자는 아무것도 안쓴 상태(default)랑 같음.
	}
}
