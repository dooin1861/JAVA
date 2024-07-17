package P348;

import p347.A;

public class C extends A{ // extends - 상속 선언
	public void method() {
		this.field = "val";
		method();    // this. 생략 가능
		
//		A a = new A();
	}
}
