package hw3;

// Kevin Rama

import java.util.*;

public class Hw3 {
	// Do not change this method
	public static void main(String[] args) {
		Scanner aScan = new Scanner(System.in);
	
		System.out.println("How many people are there? ");
		int max = getPosInt(aScan);
		
		String[] names = getNames(max, aScan);
		
		System.out.println("The names you entered are: ");
		printSArray(names);
		aScan.close();	
	}
	
	// Write this method
	public static int getPosInt(Scanner theScan) {
		System.out.println("Entering the getPosInt method ...");
		// Put code here to complete the method as described
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a positive(>0) whole number: ");
		int num =sc.nextInt();
		while(num<=count){
			System.out.println("Positive Number Please: ");
			num=sc.nextInt();
		}	
		sc.close();
		System.out.println("Leaving the getPosInt method ...");
		return num;
		
		// The return statement below is a stub -- replace it with the correct return
	}
	
	// Write this method
	public static String[] getNames(int m, Scanner theScan) {
		System.out.println("Entering the getNames method ...");
		// Put code here to complete the method as described
		String[] newarr= new String[m];
		for(int i=0; i<newarr.length;i++){
			System.out.println("Enter a Name: ");
			String names=theScan.nextLine();
			newarr[i]=names;
			
		}
		System.out.println("Leaving the getNames method ...");
		// The return statement below is a stub -- replace it with the correct return
		return newarr;
	}
	
	// The method below contains compilation and runtime errors which you 
	// should: 1. correct and 2. mark so that I can see the changes you've made.
	// Do not change the basic functioning of the method -- just make it run.
	// There are a total of five mistakes
	public static void printSArray(String[] sArray) {
		System.out.println("Entering the printSArray method ...");
		for (int i = 0; i < sArray.length; i++)
			System.out.println(sArray[i]);
		System.out.println("Leaving the printSArray method ...");
	}
}
