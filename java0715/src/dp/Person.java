package dp;

public class Person {
	private Phone[] phones;
	
	public Person() {  // 생성자에는 public
		phones = new Phone[2];  // 생성자를 통해서 만드는게 좋다
		
	}
	
	public Phone getPhone(int i) {  // 나쁜 설계의 예
		if(i == 0 || i == 1) {
			return phones[i];   // 0일 때는 집 전화, 1일 때는 회사 전화
		}
		return null;
	}
}
