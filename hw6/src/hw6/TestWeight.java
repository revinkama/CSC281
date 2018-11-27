package hw6;

import wt.DogWeight;

// Feel free to change this test program when developing the DogWeight subclass
// You will not hand in this file

public class TestWeight {

	public static void main(String[] args) {
		System.out.println("The number of DogWeight objects: " + DogWeight.getNumDogs());
		DogWeight w1 = new DogWeight();
		System.out.println("The first dog: " + w1);
		System.out.println("The number of DogWeight objects: " + DogWeight.getNumDogs());
		DogWeight w2 = new DogWeight(55, 'k');
		System.out.println("The second dog: " + w2);
		System.out.println("The number of DogWeight objects: " + DogWeight.getNumDogs());
		DogWeight w3 = new DogWeight(0, '%');
		System.out.println("The third dog: " + w3);
		System.out.println("The number of DogWeight objects: " + DogWeight.getNumDogs());
		DogWeight w4 = new DogWeight(10, 'p');
		System.out.println("The fourth dog: " + w4);
		System.out.println("The number of DogWeight objects: " + DogWeight.getNumDogs());
		DogWeight w5 = new DogWeight(-3, 'k');
		System.out.println("The fifth dog: " + w5);
		System.out.println("The number of DogWeight objects: " + DogWeight.getNumDogs());
		System.out.println("Are the first and second dogs the same? " + w1.equals(w2));
		System.out.println("Are the first and fourth dogs the same? " + w1.equals(w4));
	}
}
