package p303;



public class Person {
	final String nation = "Korea";     // final필드는 초기화하면 수정할 수 없는 필드
	static final double PI = 3.141592;   
	
	public static void main(String... ar) {
		Person p1 = new Person();
//		p1.nation = "USA";
//		PI = 3.14;
		System.out.println(p1.nation);
	}
}
