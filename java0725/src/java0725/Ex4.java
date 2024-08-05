package java0725;



public class Ex4 {
	
	public static void method() throws ClassCastException {
		try {
			Class.forName("ASDSD.ASD");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			method();
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
	}

}
