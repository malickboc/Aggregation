
public class Employee {
	
	private String name;

	/**
	 * Constructs an employee given a name.
	 * 
	 * @param name
	 */
	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}

	public void setName(String name) {
		this.name = name;
	}


}
