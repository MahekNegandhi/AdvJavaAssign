public class EmployeeBean {
	private int EmployeeCode;
	private String name; 
	private int salary;
	private String designation;
	
	public EmployeeBean() {
	}

	public EmployeeBean(int employeeCode, String name, int salary,
			String designation) {
		super();
		EmployeeCode = employeeCode;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}

	public int getEmployeeCode() {
		return EmployeeCode;
	}

	public void setEmployeeCode(int employeeCode) {
		EmployeeCode = employeeCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}
