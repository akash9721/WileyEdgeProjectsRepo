import java.util.Scanner;

public class ReverseString {

	public static void reverseStr(String str) {
		char ch[] = str.toCharArray();

		String revstr = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			revstr += ch[i];
		}
		System.out.println(revstr);
	}

	public static void main(String[] args) {

		Scanner cs = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = cs.nextLine();
		reverseStr(str);

	}

}
