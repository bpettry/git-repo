package module_1;

public class Manager extends Employee{
	//fields for Manager subclass
	String department;

	/*
	 * Methods
	 */
	
	//method to set and get department
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String deptName) {
		department = deptName;
	}
		
	//method to extend printAll from Employee class
	@Override
	public void printAll() {
		super.printAll();
		System.out.println("Department: " + department);
	}
	

}
