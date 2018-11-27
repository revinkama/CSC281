package hw8;

public class TestNumArrayList {
	
	public static final int arrSize = 10;

	public static void main(String[] args) {
		
		Integer[] iarr = new Integer[arrSize];
		for (int i = 0; i < arrSize; i++)
			iarr[i] = new Integer(1 + (int) (100 * Math.random()));
		
		NumArrayList<Integer> iArrLst = new NumArrayList<>(iarr);
		System.out.println("The Integer NumArrayList: " + iArrLst);
		
		NumArrayList<Double> dArrLst = new NumArrayList<>();
		for (int i = 0; i < arrSize; i++)
			dArrLst.add(new Double(100* Math.random()));
		
		System.out.println("The Double NumArrayList: ");
		for (int i = 0; i < arrSize; i++)
			System.out.printf("%.2f\n", dArrLst.get(i));
		System.out.println();
		
		NumArrayList<Integer> secIArrLst = iArrLst.iMult(arrSize);
		System.out.println("The result of calling iMult: " + secIArrLst);
	}
}
