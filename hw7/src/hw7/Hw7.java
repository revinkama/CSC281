package hw7;

import people.AdultStudent;

public class Hw7 {

	public static void main(String[] args) {
		
		AdultStudent[] students = new AdultStudent[3];
		students[0] = new AdultStudent("Joon", 1994, "art history");
		students[1] = new AdultStudent();
		students[2] = new AdultStudent("Gertrude", 2007, "digital cinema");
		
		System.out.println("The students:");
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
		System.out.println();
		
		int index = findMax(students);
		System.out.println("The largest element in the AdultStudent array is: ");
		System.out.println(students[index]);
		System.out.println();
	}
	
	public static <T extends Comparable<T>> int findMax(T[] values) {
		
		int maxPosition = 0;
    	for (int index = 1; index < values.length; index++ )
    	{
        		if (values[index].compareTo(values[maxPosition]) > 0)
            		maxPosition = index;
    	}
   
    	return maxPosition;
	}
}
