package java0725;

class MyClass {
	void method() throws Exception {
		int x = 100;
		if (x > 90) {
			throw new MyException("나의 예외");
		}
	}
}

public class MyException2 {

	public static void main(String[] args) {
		MyClass mc = new MyClass();
		try {
			mc.method();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
