import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccurence {

	public static void cntEachChar(String str) {

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		char[] arr = str.toCharArray();
		for (char ch : arr) {
			if (hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch) + 1);
			} else {
				hm.put(ch, 1);
			}
		}
		for (Map.Entry entry : hm.entrySet()) {
			System.out.println(entry.getKey() + " ->" + entry.getValue());
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		cntEachChar(str);
	}

}
