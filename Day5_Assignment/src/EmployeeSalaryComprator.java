import java.util.Comparator;

public class EmployeeSalaryComprator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return (int) (e1.getEmpBasicSalary() + e2.getEmpBasicSalary());
	}

}
