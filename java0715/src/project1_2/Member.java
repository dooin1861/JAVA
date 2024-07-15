package project1_2;

import java.io.Serializable;

public class Member implements Serializable {
	private String name;
	private String ssn; // 주민번호 6자리 패스워드
	private String tel;
	private int balance;
	
	// 입금
	public void deposit(int deposit) {
		if (deposit <= 0) {
			System.out.println("금액을 정확히 입력하세요."); // 0보다 작거나 같으면 불가능하게
			return;
		}
		balance += deposit;
	}
	
	public void withdraw(int withdraw) {
		if (withdraw > balance) {
			System.out.println("잔액이 부족합니다.");  // 밸런스가 더 작으면 잔액부족
			return;
		}
		balance -= withdraw;
	}
	
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

	public void setName(String name) {
		this.name = name;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Member() {}
}
