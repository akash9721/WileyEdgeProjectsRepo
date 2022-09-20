import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(20);
		al.add(50);
		al.add(70);
		al.add(220);

		Iterator it = al.iterator();
		while (it.hasNext()) {

		}
		ListIterator li = al.listIterator();
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

}
