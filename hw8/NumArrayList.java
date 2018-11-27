package hw8;

// Kevin Rama
// No Collabs

import java.util.ArrayList;

public class NumArrayList<T extends Number>{

	private ArrayList<T> L;

	public NumArrayList() {
		L= new ArrayList<T>();
	}
	
	// Create a new NumArrayList, initializing it with the parameter
	public NumArrayList(T[] initValues) {	
		L=new ArrayList<T>();
		for(int i=0;i<initValues.length;i++){
			L.add(initValues[i]);
		}
	}
	
	public void add(T elem) {
		L.add(elem);
	}
	
	public T get(int index) {
		return L.get(index);
	}

	// Return the String representation of the NumArrayList
	public String toString(){
		String s="";
		for(int i=0; i<L.size();i++){
			s=s+L.get(i);
			s=s+" ";
		}
		return String.format("%s "+" \n", s);
	}

	
	// Multiply the NumArrayList by an Integer value
	public NumArrayList<Integer> iMult(Integer val) {
		// replace this with the correct implementation
		NumArrayList<Integer> iItem = new NumArrayList<Integer>();
		// Put your code to fill the NumArrayList iItem here
		for(int i=0;i<L.size();i++){
			int c= L.get(i).intValue();
			c*=val;
			iItem.add(c);
		}
		return iItem;
	}
}


