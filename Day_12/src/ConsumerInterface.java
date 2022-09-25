import java.util.Arrays;
import java.util.List;

public class ConsumerInterface {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 4, 5, 6, 7, 9, 10);
		list.forEach(n -> System.out.println(n)); // for each take obj of consumer interface
	}

}
