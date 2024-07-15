package Project2;

import java.io.Serializable;

public class Member implements Serializable {
	String name;
	String ssn; // 주민번호 6
	String tel;
	int balance;
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", ssn=" + ssn + ", tel=" + tel + ", balance=" + balance + "]";
	}
	
	public Member(String name, String ssn, String tel) {
		super ();
		this.name = name;
		this.ssn = ssn;
		this.tel = tel;
	}

	public Member() {}
}
