

import java.util.ArrayList;
import java.util.Collections;

public class Arraylistexample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(2);
		a.add(21);
		a.add(9);
		System.out.println(a);

		a.set(0, 333); // for inserting or setting any value in any index of arraylist
		System.out.println(a);

		int val = a.get(3);
		System.out.println("value at index 3 is:=" + val); // The Java ArrayList get() method returns the element
															// present in specified position.

		boolean b = a.contains(2); // returns true/false if the specified element is present or not in the
									// arraylist.
		System.out.println(b);

		a.clear(); // for clearing all the value from the Arraylist
		System.out.println(a);

		for (int x : a) { // for displaying or iterating all the values
			System.out.print(x + " ");
		}
		System.out.println();

		System.out.println("sorted list");
		Collections.sort(a); // for sorting the arraylist element
		for (int x : a) {
			System.out.print(x + " ");
		}

	}

}
