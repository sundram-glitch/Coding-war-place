/*Write a program to store a group of employee names into a HashSet, retrieve the elements one by one using an Iterator.
*/
import java.util.HashSet;
import java.util.Iterator;
public class Problem2 {
	public static void main(String[] args) {
		HashSet<String> employee = new HashSet<>();
		employee.add("Sundram");
		employee.add("Shivam");
		employee.add("Satyam
		");
		System.out.println("List of Employee is as follows: ");
		Iterator<String> itr = employee.iterator();
		while(itr.hasNext()) 
			System.out.println(itr.next());
	}

}
