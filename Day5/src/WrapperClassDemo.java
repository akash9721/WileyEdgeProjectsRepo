
public class WrapperClassDemo {

	public static void main(String[] args) {
		// primitive data type to obj
		int i = 5;
		Integer I = Integer.valueOf(i);// converting int into Integer
		Integer b = i; // autoboxing
		System.out.println(i + "        " + I + "         " + b);

		// obj to primitive data type
		Integer j = 15;
		int k = j.intValue();// unboxing i.e converting Integer to int
		int l = j; // unboxing
		System.out.println(j + "        " + k + "         " + l);
	}

}
