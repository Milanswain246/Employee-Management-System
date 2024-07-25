package com.mk.emp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mk.emp.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
	
	public Employee findByName(String name);

}
