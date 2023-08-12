package com.wipro.org.main;
import java.util.*;
import com.wipro.org.bean.EmployeeBean;
import com.wipro.org.service.EmployeeService;
public class MainClass {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//Operation 1: Insertion
	int num = sc.nextInt();
	EmployeeService empserve = new EmployeeService();
	for (int i = 0; i < num; i++) {
		int empID = sc.nextInt(); sc.nextLine();
		String name = sc.nextLine();
		float sal = sc.nextFloat(); sc.nextLine();
		String desg = sc.nextLine();
		System.out.println(empserve.insertEmployee(new EmployeeBean(empID, name, sal, desg)));
	}
	//Operation 2: Insertion by position
	System.out.println(empserve.insertEmployeeByPosition(new EmployeeBean(1002, "Shivam", 15000,"operator engg" ),1));
	//Operation 3: Retrievable
	List<EmployeeBean> listitr = empserve.fetchAllEmployees();
	for (EmployeeBean employeeBean : listitr) 
		System.out.println(employeeBean.getEmpID()+" "+employeeBean.getName()+" "+employeeBean.getSalary()+" "+employeeBean.getDesg());
	//Operation 4: Deletion by ID
    System.out.println(empserve.deleteEmployeeByEmpID(1001));
    //Operation 5: Updation by ID
    System.out.println(empserve.updateEmployeeByEmpID(1002, new EmployeeBean(1004, "Aman", 0000.0f, "nagarpalika")));
    //Operation 6: Search by ID
	EmployeeBean foundEmp =  empserve.findEmployeeByEmpID(1003);
	if(foundEmp!=null) System.out.println(foundEmp.getEmpID()+" "+foundEmp.getName()+" "+foundEmp.getSalary()+" "+foundEmp.getDesg());
    sc.close();
  }
}
