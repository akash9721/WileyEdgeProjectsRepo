import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> name = new Stack<>();
		name.push("akash");
		name.push("vikas");
		name.push("kk");
		name.push("kumar");

		System.out.println(name);
		System.out.println(name.peek());

		name.pop();
		System.out.println(name);

		while (name.empty() == false) {
			System.out.println(name.peek());
			name.pop();
		}
	}

}
