package people;

public class AdultStudentDriver {
	private static AdultStudent MAX= new AdultStudent();
	public static void main(String[] args){
		AdultStudent values= new AdultStudent("Mike", 1995, "CS");
		System.out.println("The Adult Student Array: " +"["+MAX+"]");
	}
}
