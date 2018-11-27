package people;

import java.time.LocalDate;

public class Person {
	
	protected int bYear;
	protected String name;
	
	public Person() {
		LocalDate today = LocalDate.now();
		name = "default";
		bYear = today.getYear();
	}
	
	public Person(String initName, int birthYear) {
		name = initName;
		bYear = birthYear;
	}
	
	public int age() {
		LocalDate today = LocalDate.now();
		return today.getYear() - bYear;
	}
	
	public String toString() {
		return String.format("Name: %s, birth year: %d", name, bYear);
	}
}
