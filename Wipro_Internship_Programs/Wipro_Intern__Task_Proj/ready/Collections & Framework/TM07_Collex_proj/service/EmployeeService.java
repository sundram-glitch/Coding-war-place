package com.wipro.org.service;
import java.util.*;
import com.wipro.org.bean.EmployeeBean;
public class EmployeeService {
  private List<EmployeeBean> listEmp = new ArrayList<>();
  public boolean insertEmployee(EmployeeBean bean) {
	  return listEmp.add(bean);
  }
  public String insertEmployeeByPosition(EmployeeBean bean, int position) {
	  if(listEmp.size()-1<=position) {
		  listEmp.add(bean);
	  return "Inserted employee at end position:"+(listEmp.size()-1);
	  }
      listEmp.add(position, bean);
	  return "Inserted employee at position:"+position;
  }
  public List<EmployeeBean> fetchAllEmployees(){  
	  return listEmp.isEmpty()?null:listEmp;
  }
  public boolean deleteEmployeeByEmpID(int empID) {
	  boolean flag  = false;
	  ListIterator<EmployeeBean> itr = listEmp.listIterator();
	  while(itr.hasNext()) {
		  EmployeeBean temp = itr.next();
		  if(temp.getEmpID()==empID) return listEmp.remove(temp);
	  }
	  return flag;
  }
  public boolean updateEmployeeByEmpID(int empID, EmployeeBean bean) {	  
	  ListIterator<EmployeeBean> itr = listEmp.listIterator();
	  int i = 0;
	  while(itr.hasNext()) {
	   EmployeeBean temp = itr.next(); 
	   if(temp.getEmpID()==empID) { 
	   listEmp.set(i, bean);
	   return true;
	   }i++;
	  }
	  return false;
  }
  public EmployeeBean findEmployeeByEmpID(int empID) {
	  EmployeeBean temp = null;
	  ListIterator<EmployeeBean> itr = listEmp.listIterator();
	  while(itr.hasNext()) {
		  temp = itr.next();
		  if(temp.getEmpID()==empID)return temp; 
	  }
	  return temp;
  }
}
