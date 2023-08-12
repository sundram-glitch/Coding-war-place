package com.wipro.org.bean;

public class EmployeeBean {
  public EmployeeBean(int empID, String name, float sal, String desg) {
   this.setEmpID(empID);
   this.setName(name);
   this.setSalary(sal);
   this.setDesg(desg);
  }
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
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
  private int empID;
  private String name;
  private float salary;
  private String desg;
}
