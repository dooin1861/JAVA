package java0716;

public class EX01 {
	public static void main(String[] args) {
		Cat cat = new Cat("페르시안", "검정", 9);
//		cat.age = 9;
		cat.setAge(9);
		
		System.out.println(cat); // cat.toString() 도 가능
	}
}
