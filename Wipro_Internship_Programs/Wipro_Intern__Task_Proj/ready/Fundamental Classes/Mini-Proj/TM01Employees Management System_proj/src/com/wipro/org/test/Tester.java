package com.wipro.org.test;
import com.wipro.org.supclass.EmployeesManagementSystem;
import com.wipro.org.entry.EmployeesTable;
import java.util.Scanner;
public class Tester implements EmployeesManagementSystem{
  static int totalEntries;
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     totalEntries = sc.nextInt();
     EmployeesTable[] empArr = new EmployeesTable[totalEntries];
     Tester call = new Tester(); 
      for (int i = 0; i < empArr.length; i++) {
	   int empid = sc.nextInt(); sc.nextLine();
	   String empName = sc.next();
	   String joinData = sc.next();
	   char desgCode = sc.next().charAt(0);
	   String dept = sc.next();
	   String desg = sc.next();
	   int basic = sc.nextInt();
	   int hra = sc.nextInt();
	   int it = sc.nextInt();	   
	   int da = sc.nextInt();	 
       empArr[i] = new EmployeesTable(empid, empName, joinData, desgCode,dept,  basic, hra, it,desg, da);
      }
      int empid = sc.nextInt();sc.close();
      EmployeesTable res = call.checkEmpid(empArr,empid);
      if(res!=null) {
    	  System.out.println("Emp No.\tEmp Name\tDeparment\tDesignation\tSalary");
    	  System.out.println(res.getEmpid()+"\t"+res.getEmpName()+"\t\t"+res.getDept()+"\t\t"+res.getDesg()+"\t\t"+(res.getBasic()+res.getHra()+res.getDa()-res.getIt()));
      }
      else System.out.println("There is no employee with empid:"+empid);
  }
   @Override
   public EmployeesTable checkEmpid(EmployeesTable[] empArr, int id) {
      EmployeesTable temp = null;
      for (EmployeesTable emptab: empArr) if(emptab.getEmpid()==id)temp = emptab;
	   return temp;
   }
}
