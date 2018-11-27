package people;

import java.time.LocalDate;


// Kevin Rama
// No Collabs

public class AdultStudent extends Person implements Comparable<AdultStudent>{

	private String major;
	private final int AGE_MAJ = 18;
	LocalDate today=LocalDate.now();
	
	public AdultStudent() {
		
		name="default";
		bYear=today.getYear()-AGE_MAJ;
		major="Computer Science";
	}
	
	public AdultStudent(String n, int y, String m) {
		major=m;
		name=n;
		if(y>=AGE_MAJ){
			bYear=y;
		}
		else bYear=today.getYear()-AGE_MAJ;
	}
	
	public int compareTo(AdultStudent other) {
		AdultStudent curr= new AdultStudent();
		int val=0;
		if(curr.age() <other.age()){
			val=-1;
		}
		else if(curr.age()>other.age()){
			val=1;
		}
		else val=0;
		
		return val;
	}
	
	public String toString() {
		
		return String.format("Name: %s"+" Birth Year: %d"+" Major: %s", name, bYear, major);
	}
}
