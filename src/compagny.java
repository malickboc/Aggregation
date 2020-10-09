import java.util.List;

public class compagny {
	
	private List<Employee> employees;

	public compagny(List<Employee> employees2) {
		// TODO Auto-generated constructor stub
		this.employees = employees2;
	}

	/**
	 * Constructs the company given a list of employees that work there.
	 * 
	 * @param employees: The employees of the company.
	 * @return 
	 */
	public void Company(List<Employee> employees) {
		this.employees = employees;
	}

	/**
	 * Adds an employee to the list of employees.
	 * 
	 * @param employee: The employee to add to the list.
	 * @return True if the employee was added to the list, false otherwise.
	 */
	public boolean addEmployee(Employee employee) {
		return employees.add(employee);
	

}
}