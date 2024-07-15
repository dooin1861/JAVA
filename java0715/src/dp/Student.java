package dp;

import java.util.Vector;

public class Student {
	
	// 학생을 나타내는 클래스로 학생 이름('name')과 수강 중인 과목 리스트('course')를 포함함.
	// registerCourse 메서드로 학생이 과목을 수강 신청하면 학생 객체에 과목을 추가,
	// 과목 객채에도 학생을 추가.
	
//	private Professor advisor;         
	private String name;               // 학생 이름
	private Vector<Course> courses;    // 수강 중인 과목 리스트
	
	public Student() {}
	
	public Student(String name) {
		super();
		this.name = name;
		this.courses = new Vector<Course>();  // Vector를 사용하여 과목 리스트 초기화
	}
	
	public void registerCourse(Course course) { // 과목을 수강 신청하는 메서드
		courses.add(course);
	}
	
	public void dropCourse(Course course) {   // 수강 중인 과목을 취소하는 메서드
		if (courses.contains(course)) {
			courses.remove(course);
		}
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", courses=" + courses + "]";
	}

	public String getName() {  // 학생 이름을 반환하는 메서드
		return name;
	}

//	public void setAdvisor(Professor advisor) {
//		this.advisor = advisor;
//	}

//	public void advise(String msg) {  //
//		System.out.println(msg);
//	}
}
