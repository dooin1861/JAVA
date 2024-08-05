package iteratorEx01;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StudentIterator implements Iterator<Student> {
	
	private Student2 student2;
	private int index;
	
	public StudentIterator(Student2 student2) {
		this.student2 = student2;
		this.index = 0;
	}
	@Override
	public boolean hasNext() {
		if (index < student2.getLength()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Student next() {
		if (!hasNext()) {
			throw new NoSuchElementException(); // 예외 발생
		}
		Student student = student2.getBookAt(index);
		index++;
		return student;
	}

}
