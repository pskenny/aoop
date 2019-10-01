package lab1;

public class Person {

	final private int id;

	public Person(int id) {
		this.id = id;
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println(id + " " + this.hashCode());
	}

	public static void main(String[] args) {
		new Runner();
	}
}
