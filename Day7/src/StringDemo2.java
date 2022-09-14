
public class StringDemo2 {
	public static void stringMethod2() {
		String Dateformate = String.join("-", "14", "09", "2022");
		System.out.println(Dateformate);

		String st = String.join(">", "seven ", " Five ", " three ", " one ");
		System.out.println(st);

		String s1 = "Javalanguage";
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(0, 6));
		System.out.println(s1.subSequence(0, 6));

	}

	public static void main(String[] args) {
		stringMethod2();
	}

}
