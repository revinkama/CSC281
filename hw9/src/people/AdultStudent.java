package people;

import java.time.LocalDate;

// Put your name here
// Put your collaborator(s) name(s) here and describe your collaboration with them

public class AdultStudent extends Person implements Comparable<AdultStudent>{

	private String major;
	
	private final int AGE_MAJ = 18;
	
	public AdultStudent() {
		LocalDate today = LocalDate.now();
		name = "default";
		bYear = today.getYear() - AGE_MAJ;
		major = "computer science";
	}
	
	public AdultStudent(String n, int y, String m) {
		LocalDate today = LocalDate.now();
		int year = today.getYear();
		if (y <= year - AGE_MAJ) 
			bYear = y;
		else bYear = year - AGE_MAJ;
		name = n;
		major = m;
	}
	
	public String getMajor() {
		return major;
	}
	
	public int compareTo(AdultStudent other) {
		return age() - other.age();
	}
	
	public String toString() {
		return super.toString() + ", major: " + major;
	}
}
