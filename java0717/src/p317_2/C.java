package p317_2;

import p317.A;
import p317.B;

public class C {
	B b;  // 패키지가 다른 경우 접근이 불가능, 다만 import로 가능하게 만들 순 있음.
	A a;  // 접근하려는 클래스의 접근 제한자가 public이 아닌 경우 import를 해도 접근 불가능.
	
	void method() {
		a.x = 200;   // 다른 패키지를 접근 하려면 패키지 클래스의 접근 제한자를 public으로 변경해야 함.
	}
	
} 
