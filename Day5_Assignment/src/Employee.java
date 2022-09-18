
public class Employee {

	private int empId;
	private String empName;
	private String empDept;
	private double empBasicSalary;
	private double empGrossSalary;

	public Employee(int empId, String empName, String empDept, double empBasicSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empBasicSalary = empBasicSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDep(String empDept) {
		this.empDept = empDept;
	}

	public double getEmpBasicSalary() {
		return empBasicSalary;
	}

	public void setEmpBasicSalary(double empBasicSalary) {
		this.empBasicSalary = empBasicSalary;
	}

	public double grossSalary() {
		double da = (empBasicSalary * 8) / 100;
		double hra = (empBasicSalary * 12) / 100;
		empGrossSalary = empBasicSalary + da + hra;
		return empGrossSalary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + ", empBasicSalary="
				+ empBasicSalary + ", empGrossSalary=" + empGrossSalary + "]";
	}

}
