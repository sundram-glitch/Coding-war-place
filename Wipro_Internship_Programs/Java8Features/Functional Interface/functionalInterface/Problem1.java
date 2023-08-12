/*
 * Given an ArrayList with 5 employee(id,name,location,salary) objects,
 * WAP to extract the location detail of each Employee and store it in an ArrayList, with help of function
 */
 	/**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
     **/
package functionalInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
class Employee{
	String name;
	int empID;
	String location;
	float salary;
	public Employee(String name, int empID, String location, float salary) {
		super();
		this.name = name;
		this.empID = empID;
		this.location = location;
		this.salary = salary;
	}
}
public class Problem1 {
	public static void main(String[] args) {
		List<Employee> arr = new ArrayList<Employee>();
		List<String> location = new ArrayList<String>();
		arr.add(new Employee("Sundram",256,"Pune",40000));
		arr.add(new Employee("Himanshu",378,"Mumbai",50000));
		arr.add(new Employee("Sita",42,"Banglore",30000));
		arr.add(new Employee("Sandeep",957,"Delhi",500000));
		arr.add(new Employee("Tarik",234,"Chennai",30000));
		Function<Employee,String> func1 = emp -> (emp.location);
		arr.forEach(n -> location.add(func1.apply(n)));
		System.out.println("Location array is given as2: ");
		System.out.println(location);
	}
}