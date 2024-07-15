package java0715;

public class Sam06Ex {
	public static void main(String[] args) {
		Sample01<Integer> age = new Sample01<Integer>();
		Sample01<String> name = new Sample01<>(); // 제네릭 타입스킵 가능
		
		age.setT(18);
		name.setT("BBB");
		
		System.out.println(age.getT()+ ", " + name.getT());
	}
}
