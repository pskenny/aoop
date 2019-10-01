package lab2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
	private String studentID;
	Date dob;
	List<Book> books;

	public Student(String studentID, Date dob) {
		this.studentID = studentID;
		this.dob = dob;

		books = new ArrayList<Book>();
	}

	public void addBook(Book b) {
		books.add(b);
	}

	public List<Book> books() {
		return books;
	}

	public boolean hasBook(Book b) {
		return books.contains(b);
	}

	public int count() {
		return books.size();
	}

	public void clear() {
		books.clear();
	}
}
