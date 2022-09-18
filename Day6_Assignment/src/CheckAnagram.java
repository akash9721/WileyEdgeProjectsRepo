import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {

	public static boolean isAnagram(String s1, String s2) {
		if (s1 == null || s2 == null || s1.isEmpty() || s2.isEmpty())
			return false;
		if (s1.length() != s2.length())
			return false;
		char[] str1 = s1.toCharArray();
		char[] str2 = s2.toCharArray();

		Arrays.sort(str1);
		Arrays.sort(str2);

		for (int i = 0; i < str1.length; i++) {
			if (str1[i] != str2[i])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String first = sc.next();
		System.out.println("Enter second string");
		String second = sc.next();
		if (isAnagram(first, second)) {
			System.out.println("String are Anagram");
		} else {
			System.out.println("String are not Anagram");
		}
	}

}
