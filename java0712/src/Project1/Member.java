package Project1;

public class Member {
	String name1;
	String jumin; // 주민번호 6
	String phone;
	
	@Override
	public String toString() {
		return "Member [name= " + name1 + ", jumin= " + jumin + ", phone= " + phone + "]";
	}
	
	public Member(String name, String jumin, String phone) {
		super ();
		this.name1 = name;
		this.jumin = jumin;
		this.phone = phone;
	}
	
	public Member() {}
}
