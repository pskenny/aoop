package lab2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Runner {

	List<Student> students;

	public Runner() {
		students = new ArrayList<Student>();
		for (int i = 0; i < 100; i++) {
			Student s = new Student("G" + i, new Date(System.nanoTime()));

			for (int j = 0; j < 20; j++) {
				Book b = new Book(j);
				s.addBook(b);
			}
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			students.add(s);
		}
		
		Student key = new Student("G50", new Date(System.nanoTime()));
		boolean found = students.contains(key);
		
	}
}
