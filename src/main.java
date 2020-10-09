import java.util.ArrayList;
import java.util.List;

public class main {
	
	public static void main(String[] args) {

		Employee e1 = new Employee("Taylor Ripke");
		Employee e2 = new Employee("Vikas Jogiparthi");

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(e1);
		employees.add(e2);

		compagny company = new compagny(employees);
		company = null;
		System.out.println(employees); // Still exists after the company reference was set to null.

	}


}
