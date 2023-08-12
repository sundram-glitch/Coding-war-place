package com.wipro.org.exercise.set.problem03;
import java.util.Scanner;
public class TreeSetDemo {
    /**4/2/2022
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
    static int n;
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter how many employee you want to enter:");
     n = sc.nextInt();
     Employee empArr, emp = new Employee();
     for (int i = 0; i < n; i++) {
	     int empID = sc.nextInt(); sc.nextLine();
    	 String name = sc.nextLine();	
    	 float sal = sc.nextFloat();
    	 empArr= new Employee(empID, name, sal);
    	 emp.addEmployees(empArr);
	 }sc.close();
     emp.displayAllEmployees();
	}
}
