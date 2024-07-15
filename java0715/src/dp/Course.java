package dp;

import java.util.Vector;

public class Course {
	
	// 과목을 나타내는 클래스. 과목 이름 관리, 수강 신청 학생들을 관리.
	// 'Vector'를 사용하여 학생들을 저장, 각 메서드를 통해 과목 관련 정보 조회, 수정
	
//	private String id; // 그림의 데이터가 -라면 private, +면 public
	private String name;		// 과목 이름
	private int numOfStudents = 0; // 수강 신청자 수. 0부터 시작.
	private Vector<Student> students;   // 수강 신청한 학생들을 저장하는 벡터
	
	public Course(String id, String name) {
		super();
//		this.id = id;
		this.name = name;
		this.students = new Vector<Student>();  // Vector를 사용하여 학생 리스트 초기화
	}
	
	public String getName() {  // 과목 이름 반환하는 메서드
		return name;
	}

	public void setName(String name) {  // 과목 이름 설정하는 메서드
		this.name = name;
	}
	
	public void addStudent(Student student) {  // 학생을 과목에 추가하는 메서드
		students.add(student);
		++numOfStudents;
	}
	
	public void deleteStudent(Student student) { // 학생을 과목에 제거하는 메서드
		if (students.contains(student)) {
			students.remove(student);
			--numOfStudents;
		}
	}
	
	public Vector<Student> getStudents() {  // 수강 신청한 학생들을 반환하는 메서드
		return students;
	}
	
	public int getNumOfStudents() {  // 수강 신청자 수를 반환하는 메서드
		return numOfStudents;
	}
}
