
public class Employee {
	private String empFirstName;
	private String empLastName;
	private double salary;

	public Employee(String empFirstName, String empLastName, double salary) {
		super();
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.salary = salary;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "employee first name: " + this.empFirstName + ", employee last name: " + this.empLastName
				+ ", employee salary: " + this.salary;
	}

	public int compareTo(Employee e1) {
		return this.empFirstName.compareTo(e1.empFirstName);
	}

}
