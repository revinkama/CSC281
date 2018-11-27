// To use or not as you wish
package hw1;
//Kevin Rama


public class Craps {
	
	// Do not change the main method
	public static void main(String[] args) {
		int num = 10;
		int n = num;
		int total = 0;
		int ans;
		
		while (n > 0) {
			ans = craps();
			if (ans == 1)
				System.out.println("You won!");
			else
				System.out.println("You lost.");
			total += ans;
			System.out.println();
			n--;
		}
		System.out.println("The number of wins was " + total + " out of " + num + ".");
	}
	
	public static int craps() {
		
		// Do not change this part of the craps() method
		int die1 = (1 + (int) (6 * Math.random()));
		int die2 = (1 + (int) (6 * Math.random()));
		int initRoll = die1 + die2;
		// You may need to add variables, which is fine
		// But do not change existing variables
		
		System.out.println("Roll: " + die1 + " and " + die2 + " = " + initRoll);
		if (initRoll == 7 || initRoll == 11)
			return 1;
		else if (initRoll == 2 || initRoll == 3 || initRoll == 12)
			return 0;
		else {
			boolean correct=false;
			int ans=0;
			while(correct == false){
				int die3 = (1 + (int) (6 * Math.random()));
				int die4 = (1 + (int) (6 * Math.random()));
				int newinitRoll = die3 + die4;
				System.out.println("Roll: " + die3 + " and " + die4 + " = " + newinitRoll);
				if(newinitRoll==initRoll){
					correct=true;
					ans= 1;
				}
				else if(newinitRoll==7||newinitRoll==11){
					correct=true;
					ans= 0;
				}
			}
			// Add code to modify ans based on playing the game of craps
			return ans;
		}
	}

}
