// You must use this package
package wt;

// CSC 281
// Kevin Rama
// No Collabs

public class DogWeight extends Weight {
	
	private final int MAXP = 350;
	private final int MINP = 1;
	private final double MAXK = 158.757;
	private final double MINK = 0.453592;

	private static int numDogs = 0;
	
	public static int getNumDogs() {
		// Replace this when you write the method
		return DogWeight.numDogs;
	}
	
	// The default constructor
	public DogWeight() {
		Weight w= new Weight();
		w.scale=scale;
		w.wValue=wValue;
		numDogs++;
	}
	
	// The parameterized constructor
	public DogWeight(double initW, char initS) {
		if(initS=='K' || initS=='k'|| initS=='p'||initS=='P'){
			scale=Character.toUpperCase(initS);
			if(initW<=MAXK&&initW>=MINK){
				wValue=initW;
			}
			else wValue=MINK;
		}
		else {
			scale='P';
			if(initW<=MAXP&&initW>=MINP){
				wValue=initW;
			}
			else wValue=MINP;
		}
		numDogs++;
	}
	
	public String toString() {
		// Replace this when you write the method
		if(scale=='K'||scale=='k'){
			return String.format("%.2f  %s"+"ilograms", wValue, scale);
		} else {
			scale=Character.toUpperCase(scale);
			return String.format("%.2f  %s"+"ounds", wValue, scale);
		}
	}
	
	public boolean equals(DogWeight other) {
		// Replace this when you write the method
		Weight k= new Weight();
		if(other.getK()==k.getK()){
			return true;
		}
		else if(other.getP()==k.getP()){
			return true;
		}
		return false;
	}
}
