package lab1;

import java.util.ArrayList;

class Runner {
	ArrayList<Person> people;

	public Runner() {
		people = new ArrayList<Person>();
		for (int i = 0; i < 1_000_000_000; i++) {
			// Add every 100 person to array
			if (i % 100 == 0) {
				people.add(new Person(i));
			} else {
				new Person(i);
			}
		}

	}
}
