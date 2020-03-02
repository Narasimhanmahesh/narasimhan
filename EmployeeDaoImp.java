package com.combine.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.combine.model.Employee;

public class EmployeeDaoImp implements EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;
	public void add(Employee emp) {
		sessionFactory.getCurrentSession().save(emp);
	 
	}

	@Override
	public List<Employee> list() {
	
		return null;
	}

	
	public String getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return null;
	}

}
