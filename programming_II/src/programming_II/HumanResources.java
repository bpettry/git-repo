package programming_II;

public class HumanResources {
	public static void main(String[] args) {
		//innitialize an employee and a manager
		Employee employee00089 = new Employee();
		Manager manager11145 = new Manager();
			
		
		employee00089.setFirstName("Selena");
		employee00089.setLastName("Kyle");
		employee00089.setEmployeeID(89);
		employee00089.printAll();
		
		System.out.println();

		
		manager11145.setFirstName("Tom");
		manager11145.setLastName("Selleck");
		manager11145.setEmployeeID(11145);
		manager11145.setDepartment("Sales");
		manager11145.printAll();
	}
}
