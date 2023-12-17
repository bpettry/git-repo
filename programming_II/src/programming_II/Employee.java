package programming_II;

public class Employee {
	
	//fields for Employee superclass
	String firstName;
	String lastName;
	int employeeID;
	double salary;

	/*
	 * Methods
	 */
	
	//constructor method to initialize salary at 0
	Employee(){
		salary = 0.0;
	}
	
	//method to set and get first name
	public void setFirstName(String fName) {
		firstName = fName;
	}
	public String getFirstName() {
		return firstName;
	}
	
	//method to set and get last name
	public void setLastName(String lName) {
		lastName = lName;
	}
	public String getLastName() {
		return lastName;
	}
	
	//method to set and get employee ID
	public void setEmployeeID(int empID) {
		employeeID = empID;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	
	/*
	 * method to print employee information as 
	 * First name:  
	 * Last name:  
	 * Employee ID:  
	 * Salary: 
	 */
	public void printEmployee() {
		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);
		System.out.println("Employee ID: " + employeeID);
		System.out.println("Salary: " + salary);
	}
}
