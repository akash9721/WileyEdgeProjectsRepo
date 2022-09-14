import java.util.Scanner;

public class StringDemo1 {

	private static void stringMethods(String str) {
		// TODO Auto-generated method stub

		System.out.println(str.length());

		System.out.println(str.isEmpty());

		str = str.trim();
		System.out.println(str);

		System.out.println(str.charAt(0));

		String s2 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			s2 += str.charAt(i);
		}
		System.out.println(s2);

		String s1 = "akash"; // unicode of a=97 and A=65
		String s3 = "Akash";
		System.out.println(s1.compareTo(s3));

		System.out.println(s1.equals(s3));
		System.out.println(s1 == s2);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();

		stringMethods(str);

	}
}
