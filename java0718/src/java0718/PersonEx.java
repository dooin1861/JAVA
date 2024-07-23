package java0718;

public class PersonEx {
	public static void  main(String[] args) {
		
		Driver driver = new Driver();
		Role role = driver;
		
		
		role = new Worker();
		if(role instanceof Worker) {
			Worker worker = (Worker) role;
		}

		
		
		Person person = new Person();
//		person.getRole().MAX = 100; // final이라 값 변경 불가
		
		person.setRole(new Driver());
		person.doIt();
		
		person.setRole(new Worker());
		person.doIt();
		
	}
}
