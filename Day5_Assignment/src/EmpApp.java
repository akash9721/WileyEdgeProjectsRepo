import java.util.Arrays;

public class EmpApp {

	public static void main(String[] args) {

		Employee e1 = new Employee(123, "xyz", "CS", 22000);
		Employee e2 = new Employee(232, "john", "ME", 21000);
		Employee e3 = new Employee(345, "sia", "ECE", 15000);
		Employee e4 = new Employee(666, "akki", "CS", 25000);
		Employee e5 = new Employee(156, "prabh", "IT", 20000);

		Employee[] employess = { e1, e2, e3, e4, e5 };
		System.out.println("-------------------------before sorting------------------------------");
		for (int i = 0; i < 5; i++) {
			System.out.println(employess[i]);
		}
		EmployeeSalaryComprator empSalCom = new EmployeeSalaryComprator();
		Arrays.sort(employess, empSalCom);
		System.out.println("-------------------------After sorting------------------------------");
		for (int i = 0; i < 5; i++) {
			System.out.println(employess[i]);
		}

	}

}
