package com.mk.emp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mk.emp.model.Employee;
import com.mk.emp.service.IEmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	
	@Autowired
	private IEmployeeService empser ;
	
	@PostMapping("/Add")
	public String AddingEmployee(@RequestBody Employee emp) {
		String result=empser.AddEmployee(emp);
		return result;
	}
	
	@GetMapping("/viewAll")
	public List<Employee> viewAllEmployee(){
		List<Employee> empList=empser.ViewAllEmployee();
		return empList;
		
	}
    @GetMapping("/viewBy/{id}")
	public Employee getById(@PathVariable int id){
		
		return empser.getEmployee(id);
		
	}
    
    @GetMapping("/viewByS/{name}")
   	public Employee getById(@PathVariable String name){
   		Employee emp=empser.getEmployeeS(name);
   		return emp;
   		
   	}
    
    @PutMapping("/update")
    public String updateEmployee(@RequestBody Employee emp) {
    	String msg=empser.updateEmployee(emp);
    	return msg;
    }
    
    
    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
    	empser.deleteEmployee(id);
    	return "Employee deleted";
    	
    }

}
