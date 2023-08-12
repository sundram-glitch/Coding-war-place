package com.wipro.org.exercise.set.problem03;
import java.util.*;
public class Employee { 
  public Employee(int empID, String name, float sal) {
     this.setEmpID(empID);
     this.setName(name);
     this.setSalary(sal);
  }
public Employee() {}
public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
  private int empID;
  private String name;
  private float salary;
  TreeSet<Object > set = new TreeSet<>((obj1, obj2)->{
		  Integer sal1 =(int) ((Employee)obj1).getSalary();
		  Integer sal2 =(int) ((Employee)obj2).getSalary();
		  return sal1.compareTo(sal2);
  });
   public void addEmployees(Employee empArr) {
	   set.add(empArr); 
   }
   public void displayAllEmployees() {
	 Iterator<Object> itr = set.iterator();
	 while(itr.hasNext()) {
		 Employee temp =(Employee) itr.next();
		 System.out.println(temp.getEmpID()+" "+temp.getName()+" "+temp.getSalary());
	 }
   }
}
