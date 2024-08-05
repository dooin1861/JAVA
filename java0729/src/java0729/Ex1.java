package java0729;

import java.util.Date;

class Aa {
	String ss = "Aa 클래스";

	@Override
	public String toString() {
		return "Aa [ss=" + ss + "]";
	}
}

public class Ex1 {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();
		System.out.println(obj1);
		System.out.println(obj2);
//		System.exit(0);
		
		Aa aa = new Aa();
		System.out.println(aa);
		
		Class clazz = aa.getClass();
		System.out.println(clazz.getName());
	}

}
