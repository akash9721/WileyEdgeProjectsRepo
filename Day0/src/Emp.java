
public class Emp {
	private int empId;
	private String empName;
	private String empDept;
	private double empBasicSalary;
	private double empGrossSalary;

	public Emp(int empId, String empName, String empDept, double empBasicSalary, double empGrossSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empBasicSalary = empBasicSalary;
		this.empGrossSalary = empGrossSalary;
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

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public double getEmpBasicSalary() {
		return empBasicSalary;
	}

	public void setEmpBasicSalary(double empBasicSalary) {
		this.empBasicSalary = empBasicSalary;
	}

	public double getEmpGrossSalary() {
		return empGrossSalary;
	}

	public void setEmpGrossSalary(double empGrossSalary) {
		this.empGrossSalary = empGrossSalary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
