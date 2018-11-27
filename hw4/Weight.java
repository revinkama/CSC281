package hw4;

// Author: Amber Settle
// CSC 281
// Put your name here
// Put your collaborator(s) name(s) and details of your collaboration here

import java.util.Scanner;

public class Weight
{
	// Please do not declare any additional members of the class
	// Feel free to use local variables as necessary in each method
	private double wValue;
	private String c;
	// If you like, you can change the type of scale to Character
	private char scale;
	
	private final double FACTOR = 2.2046;
	private Scanner vScan = new Scanner(System.in);

 	// The default constructor for the class
 	public Weight()
 	{
 		wValue=0;
 		scale='P';
 	}

 	// The parameterized constructor for the class
	public Weight(double initW, char initS)
	{
		if(initW>=0) wValue=initW;
		if(initS=='p'&&initS=='P'&&initS=='k'&&initS=='K') scale=initS;		
	}

 	// Input values for the instance variables using the Scanner vScan
 	public void set()
 	{
 		System.out.println("Entering the set method.");
 		// Put your code here
 		System.out.println("Please Enter the weight scale: ");
 		c=vScan.nextLine();
 		while(!c.equalsIgnoreCase("P")&&!c.equalsIgnoreCase("k")){
 			System.out.println("Only Pounds and Kilos are valid (P or K): ");
 			c=vScan.nextLine();
 		}
 		scale=c.charAt(0);
 		System.out.println("Please enter a weight measurement: ");
 		double w=vScan.nextDouble();
 		while(w<wValue){
 			System.out.println("Non-Negative Numbers Only: ");
 			w=vScan.nextDouble();
 		}
 		this.wValue=w;
     	System.out.println("Leaving the set method.");
 	}

 	// Return the weight in pounds
	public double getP(){
		double pValue=wValue;
		char s='P';
		if(s!=scale){
			pValue=wValue*FACTOR;
		}
		return pValue;
	}

	// Return the weight in kilos
	public double getK(){
		double kValue=wValue;
		char s='P';
		if(s==scale){
			kValue= (wValue/(FACTOR));
		}
		return kValue;
	}

}

