package com.combine.dao;

import java.util.List;

import com.combine.model.Employee;

public interface EmployeeDao {

	void add(Employee emp);
	 List<Employee> list();
	String getFirstName();
	String getLastName();
}
