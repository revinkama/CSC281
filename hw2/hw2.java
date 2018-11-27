package hw2;
import java.util.*;

// Kevin Rama
// Put your collaboration statement here

public class hw2 {

	// Do not modify this method except to uncomment/comment lines
	public static void main(String[] args) {
		
		try
		{
			double [] rainfall = enterMeasure();
			System.out.println("The rainfall measurements:");
			printArray(rainfall);
			System.out.println("The average rainfall is: " + findAvg(rainfall));
			
			// Two arrays that will cause problems -- put them into your code to test that
			// the method that finds the average handles erroneous arrays correctly
			// The line numbers are referenced in the assignment description
			//double [] empty = new double[0]; // line 1
			//double [] incorrect = {3.5, -1.1}; // line 2
			//System.out.println("The average for empty is: " + findAvg(empty)); // line 3
			//System.out.println("The average for incorrect is: " + findAvg(incorrect)); // line 4
		}

		catch (IllegalArgumentException exception)
		{
			System.out.println("The computation of the average failed.");
			System.out.println(exception);
		}
	}
	
	// A method that prints a 1D double array to standard output, all on one line
	public static void printArray(double[] output) {
		for(int i=0;i<output.length;i++){
			System.out.print(output[i]+ " ");
		}
		System.out.println();
	}

	// A method that enters rainfall measurements from the user into an array
	// It forces the user to enter positive values for the number of elements and
	// non-negative values for the measurements
	public static double[] enterMeasure() {
		int count=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("How many measurements(>0) are there?");
		int num= sc.nextInt();
		double[] arr=new double[num];
		while(count<num){
			for(int i=0; i<arr.length;i++){
				System.out.println("Enter a non-negative rainfall measurement: ");
				double num2=sc.nextDouble();
				if(num2<=0){
					System.out.println("You entered a Negative Value: ");
				}
				else{
					arr[count]=num2;
					count++;
				}
				sc.close();
			}
		}
		return arr;
		
	}
	// A method that returns the average of an array of non-negative (>= 0) values
	// If an empty array or an array with negative values is passed as a parameter
	// it raises an IllegalArgumentException
	public static double findAvg(double [] measure) throws IllegalArgumentException {
		double num=0;
		double avg=0;
		if(measure.length!=0){
			for(int i=0; i<measure.length;i++){
				num+=measure[i];
				avg=num/measure.length;
			}
		}
		else throw new IllegalArgumentException("Empty Set");
		
		return avg;
	}
}
