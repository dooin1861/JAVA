package iteratorEx01;

import java.util.Iterator;

public class Student2 implements Iterable<Student> {

	private Student[] students;
	private int last = 0;
	
	@Override
	public Iterator<Student> iterator() { // 생성자
		return new StudentIterator(this);
	}

	public Student2(int maxsize) {
		this.students = new Student[maxsize];
	}
	
	public Student getBookAt(int index) {  // 해당 인덱스의 학생을 리턴
        return students[index];
    }

    public void appendBook(Student student) { // 학생을 추가
        this.students[last] = student;
        last++;
    }

    public int getLength() { // 학생들의 총 건수
        return last;
    }
}
