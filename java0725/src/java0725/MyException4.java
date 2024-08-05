package java0725;

class MyClass2 {
	void method() throws MyException3 {
		throw new MyException3("나의 예외");
	}
}

public class MyException4 {

	public static void main(String[] args) {
		MyClass2 mc = new MyClass2();
		try {
			mc.method();
		} catch (MyException3 e) {
			e.printStackTrace();
		}
	}
}
