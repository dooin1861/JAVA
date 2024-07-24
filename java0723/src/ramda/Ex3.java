package ramda;

public class Ex3 {
	public static void main(String[] args) {
		MyInterf2 myInterf2 = a -> { // 하나짜리는 괄호를 안써도 됨
			System.out.println(a+300);
		};
		
		myInterf2.method(100);
	}
}
