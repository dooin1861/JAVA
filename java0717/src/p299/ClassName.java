package p299;

public class ClassName {
	int field1;        // 인스턴스 필드와 메서드
	void method1() {
		ClassName.field2 = 200;
		this.field1 = 200;
	}
	
	static int field2;            // static이 들어가는 메모리는 (동적과) 영역이 다르다
	static void method2() {
		field2 = 100;
	}
	
	public static void main(String... ar) {  // String... 도 가능함.
//		method1();            // 불가능.
		ClassName.method2();  // 밑에 코드와 동일
		method2();            // static이 붙은 건 가능
		System.out.println(ClassName.field2);
		ClassName c1 = new ClassName();
		c1.method1();
		System.out.println(c1.field1);
	}
}
