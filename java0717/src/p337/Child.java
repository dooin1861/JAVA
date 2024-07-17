package p337;

public class Child extends P{
	
	Child(int x) { 
		super(x);  // 부모의 생성자를 호출한다.
		
//		super.x = 700; x에 final이 붙어있어 접근 불가.
		System.out.println(x);
		method1();
		
	}

//	@Override
//	void method1() {
//		
//	}
	
	
}
