package module_1;

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
	
	//method to get and set first name
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String fName) {
		firstName = fName;
	}
	

	//method to get and set last name
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lName) {
		lastName = lName;
	}
	
	
	//method to get and set employee ID
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int empID) {
		employeeID = empID;
	}
	
	
	/*
	 * method to print employee information as 
	 * First name:  
	 * Last name:  
	 * Employee ID:  
	 * Salary: 
	 */
	public void printAll() {
		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);
		System.out.println("Employee ID: " + employeeID);
		System.out.println("Salary: " + salary);
	}
}
