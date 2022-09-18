
public class ArrayQuestion {
	public static boolean check(int a[]) {
		if (a[0] == a[a.length - 1])
			return true;
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3, 4, 5, 1 };
		if (check(a))
			System.out.println("First and last elements are same");
		else
			System.out.println("First and last elements are not same");
	}

}
