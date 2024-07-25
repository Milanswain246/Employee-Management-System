package com.mk.emp.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.mk.emp.model.Employee;
import com.mk.emp.repo.EmployeeRepo;


@Service
public class IEmployeeImpl implements IEmployeeService {
	
	
	@Autowired
	private EmployeeRepo erpo;

	@Override
	public String AddEmployee(Employee emp) {
		erpo.save(emp);
		return "Employee record inserted with id :-"+emp.getId();
	}

	@Override
	public List<Employee> ViewAllEmployee() {
		List<Employee> emp=erpo.findAll();
		// TODO Auto-generated method stub
		return emp;
	}

	@Override
	public Employee getEmployee( int id) {
		//Employee emp=erpo.getById(id);
		return erpo.getById(id);
	}

	@Override
	public Employee getEmployeeS(String name) {
		Employee emp=erpo.findByName(name);
		return emp;
	}

	@Override
	public String updateEmployee(Employee emp) {
		Employee empUpdate=erpo.save(emp);
		return "Employee update with employee id ::"+emp.getId();
	}

	@Override
	public void deleteEmployee(int id) {
		 erpo.deleteById(id);
	}


	
	
}
