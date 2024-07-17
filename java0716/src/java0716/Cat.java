package java0716;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString

public class Cat {
	String breed; // 품종
	String color;
	private int age;
	
	public Cat(String breed) {
//		super();         // this()
//		this.breed = breed;
		this(breed, "흰색", 10);   // this 위에 코드는 허용이 안됨.
	}

//	public Cat(String breed, String color) {
////		super();
////		this.breed = breed;
//		this(breed, color, 10);
//	}
//
//	public Cat(String breed, String color, int age) {
//		super();       // this. super.
//		this.breed = breed;
//		this.color = color;
//		if (age > 9) {
//			this.age = age;
//		} else {
//			this.age = 10;
//		}
//	}

	Cat() {   // 기본 생성자 default
		System.out.println("cat()");
	}
	
	Cat(int age) {
		
	}
	
}
