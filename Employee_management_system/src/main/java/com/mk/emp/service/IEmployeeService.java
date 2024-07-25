package com.mk.emp.service;

import java.util.List;
import java.util.Optional;

import com.mk.emp.model.Employee;

public interface IEmployeeService {
	
	public String AddEmployee(Employee emp);
	
	public List<Employee> ViewAllEmployee();
	
	public Employee getEmployee(int id );
	
	public Employee getEmployeeS(String name );
	
	public String updateEmployee(Employee emp);
	
	public void deleteEmployee(int id);
	


}
