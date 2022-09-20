import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmpArrayListDemo {
	public static void main(String[] args) {
//		Employee e = new Employee("akash", "kumar", 50000);
//		Employee e1 = new Employee("vikas", "yadav", 27000);
//		Employee e2 = new Employee("prabh", "jot", 20000);
//		Employee e3 = new Employee("tejbir", "singh", 58000);
//
////		ArrayList<Employee> al = new ArrayList<Employee>();
////		al.add(e);
////		al.add(e1);
////		al.add(e2);
////		al.add(e3);

		List<Employee> emp = Arrays.asList(new Employee("akash", "kumar", 50000), new Employee("vikas", "yadav", 27000),
				new Employee("prabh", "jot", 20000), new Employee("tejbir", "singh", 58000));
		System.out.println("----------------------------before sorting------------------------------------");
		for (Employee et : emp) {
			System.out.println(et);
		}
		System.out.println("----------------------------after sorting--------------------------------------");
		EmployeeInfoSorting compare = new EmployeeInfoSorting();
		Collections.sort(emp, compare);
		for (Employee et : emp) {
			System.out.println(et);
		}

	}

}
