package iteratorEx01;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Student2 student2 = new Student2(4);
		student2.appendBook(new Student("AAA", "1", 90));
		student2.appendBook(new Student("BBB", "2", 80));
		student2.appendBook(new Student("CCC", "3", 70));
		student2.appendBook(new Student("DDD", "4", 100));
		
		Iterator <Student> it = student2.iterator();
		while (it.hasNext()) {
			Student student = it.next();
		}
		
		System.out.println("-----------------");
		for (Student student: student2) {
			System.out.println(student);
		}
	}


}
