package com.wipro.org.entry;
public class EmployeesTable {
     public EmployeesTable(int empid, String empName, String joinData, char desgCode, String dept, int basic,int hra, int it, String desg, int da) {
	  this.setEmpid(empid);
	  this.setEmpName(empName);
	  this.setJoinDate(joinData);
	  this.setDesgCode(desgCode);
	  this.setDept(dept);
	  this.setBasic(basic);
	  this.setHra(hra);
	  this.setIt(it);
	  this.setDa(da);
	  this.setDesg(desg);
   }
  @Override
  public String toString() {
		return "EmployeesTable [empid=" + empid + ", basic=" + basic + ", hra=" + hra + ", it=" + it + ", desg=" + desg
				+ ", da=" + da + ", empName=" + empName + ", joinDate=" + joinDate + ", dept=" + dept + ", desgCode="
				+ desgCode + "]";
  }
  private int empid,basic,hra,it,da;
  public int getEmpid() {
	return empid;
  }
  public void setEmpid(int empid) {
	this.empid = empid;
  }
  public int getBasic() {
	return basic;
  }
  public void setBasic(int basic) {
	this.basic = basic;
  }
  public int getHra() {
	return hra;
  }
  public void setHra(int hra) {
	this.hra = hra;
  }
  public int getIt() {
	return it;
  }
  public void setIt(int it) {
	this.it = it;
  }
  public String getDesg() {
	return desg;
  }
  public void setDesg(String desg) {
	this.desg = desg;
  }
  public int getDa() {
	return da;
  }
  public void setDa(int da) {
	this.da = da;
  }
  public String getEmpName() {
	return empName;
  }
  public void setEmpName(String empName) {
	this.empName = empName;
  }
  public String getJoinDate() {
	return joinDate;
  }
  public void setJoinDate(String joinDate) {
	this.joinDate = joinDate;
  }
  public String getDept() {
	return dept;
  }
  public void setDept(String dept) {
	this.dept = dept;
  }
  public char getDesgCode() {
	return desgCode;
  }
  public void setDesgCode(char desgCode) {
	this.desgCode = desgCode;
  }
  private String empName,joinDate,desg,dept;
  private char desgCode;
}
