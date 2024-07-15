package dp;

public class Main2 {
	public static void main(String[] args) {
		
		// main 메서드에서 과목과 학생 객체를 생성, 관계를 설정한 후 각
		// 과목 별 수강 신청자와 수강 신청자 목록을 출력함.
		
		// 과목 객체 생성
		Course java = new Course("cs100", "자바"); // 코스 등록
		Course cplus = new Course("cs101", "C/C++"); // 코스 등록2
		Course python = new Course("cs102", "Python"); // 코스 등록3
		
		Student minsu = new Student("민수");  // 학생 등록1
		minsu.registerCourse(java);          // 민수는 자바 과목을 듣는다
		minsu.registerCourse(cplus);
		java.addStudent(minsu);              // 자바 과목에 민수가 들어왔으므로 +1
		cplus.addStudent(minsu);
		
		Student gildong = new Student("길동");  // 학생 등록2
		gildong.registerCourse(java);
		java.addStudent(gildong);
		
		Student daehan = new Student("대한");   // 학생 등록3
		daehan.registerCourse(java);
		daehan.registerCourse(cplus);
		java.addStudent(daehan);
		cplus.addStudent(daehan);
		
		Student dooin = new Student("두인");  // 학생 등록4
		dooin.registerCourse(java);
		dooin.registerCourse(python);
		java.addStudent(dooin);
		python.addStudent(dooin);
		
		// 각 과목별로 수강 신청자 출력
		System.out.println("자바 수강 신청자: " + java.getNumOfStudents() + "명");
		for (Student student : java.getStudents()) {
			System.out.println(student.getName());
		}
		
		System.out.println("\nC/C++ 수강 신청자: " + cplus.getNumOfStudents() + "명");
		for (Student student : cplus.getStudents()) {
			System.out.println(student.getName());
		}
		
		System.out.println("\n파이썬 수강 신청자: " + python.getNumOfStudents() + "명");
		for (Student student : python.getStudents()) {
			System.out.println(student.getName());
		}
	}
}
