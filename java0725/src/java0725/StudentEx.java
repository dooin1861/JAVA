package java0725;

import java.util.Arrays;
import java.util.Comparator;

public class StudentEx {
	public static void main(String[] args) {
		Student[] students = {
			new Student("AAA", 97),	
			new Student("BBB", 87),	
			new Student("CCC", 69),	
			new Student("DDD", 76),	
			new Student("EEE", 95)
		};
		
		Comparator<Student> c = new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				return Integer.compare(o2.getScore(), o1.getScore());
			}
		};
		
		Arrays.sort(students, c);
		for (Student st : students) {
			System.out.println(st);
		}
	}
}
