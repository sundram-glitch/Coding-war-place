package com.wipro.org.interitenceInPerson;

public class Employee extends Person {
    double  salary; 
    Person person1 ;
	public Employee(Person person1, double sal, int yr, String string) {
	 super(person1.name);
    this.person1 = person1;
	this.setSalary(sal);
	this.setStartedYear(yr);
	this.setNiNum(string);
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getStartedYear() {
		return startedYear;
	}
	public void setStartedYear(int startedYear) {
		this.startedYear = startedYear;
	}
	public String getNiNum() {
		return NiNum;
	}
	public void setNiNum(String niNum) {
		NiNum = niNum;
	}
	int startedYear;
    String NiNum;
}
