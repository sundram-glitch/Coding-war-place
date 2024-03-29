package com.wipro.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Employee;

public class EmployeeAdmin {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure("com/wipro/resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		Employee emp = new Employee();
		emp.setName("AAA");
		emp.setDesignation("manager");
		emp.setSalary(2000);
		session.save(emp);
		transaction.commit();
		System.out.println("record inserted");
		session.close();
		sf.close();
	}

}
