

import java.util.ArrayList;
import java.util.Comparator;

public class Arraylistexample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> oldarray = new ArrayList<Integer>();
		oldarray.add(101);
		oldarray.add(102);
		oldarray.add(11);
		oldarray.add(32);
		oldarray.add(89);
		oldarray.add(101);
		System.out.println("old arraylist is:==" + oldarray);

		ArrayList<Integer> newarray = new ArrayList<Integer>();
		newarray.add(18);
		newarray.add(16);
		newarray.addAll(oldarray); // The addAll() method adds all the elements of a collection to the arraylist.
		System.out.println("new arraylist is:==" + newarray);

		int pos = newarray.indexOf(101); // The Java ArrayList indexOf() method returns the position of the specified
											// element in the arraylist.
		System.out.println(pos);

		newarray.sort(Comparator.naturalOrder()); // sort arraylist in ascending order
		System.out.println("Ascending order array:=" + newarray);

		newarray.sort(Comparator.reverseOrder());
		System.out.println("Descending order array:=" + newarray); // sort arralist in descending order

		int sizeis = newarray.size();
		System.out.println("size of new array is:=" + sizeis); // size of array list

		int removeele = newarray.remove(1);
		System.out.println("removed element is:=" + removeele); // remove element at particular pos

		newarray.remove(Integer.valueOf(11));
		System.out.println(newarray);

		newarray.removeAll(newarray);
		System.out.println(newarray); // remove all element from array

	}

}
