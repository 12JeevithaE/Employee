package com.example.employee_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee_management.entity.Employee;
import com.example.employee_management.service.EmployeeService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("employee")
@CrossOrigin("*")
public class EmployeeController {
	@Autowired
	public EmployeeService empser;
	
	
	@GetMapping("/all")
	public List<Employee> getAllEmployee() {
		return empser.getAllEmployee();
	}

	@GetMapping("/{id}")  
	public Employee getEmployeeById(@PathVariable Long id) {
		return empser.getEmployee(id);
	}
	
	@PostMapping
	public Employee postMethodName(@RequestBody Employee e) {
		//POST request
		return empser.addEmployee(e);
	}
	
	@PutMapping("{id}")
	public Employee putMethodName(@PathVariable long id, @RequestBody Employee e) {
		 //PUT request
		return empser.updateEmployee(id,e);
	}
	
	@DeleteMapping("{id}")
	public void deleteEmployee(@PathVariable long id) {
		empser.deleteEmployee(id);

	}
	
	@GetMapping
	   public List<Employee> getMethodNme(@RequestParam(required = false, defaultValue = "")String name){
		   List<Employee> employees = empser.findEmployeesByName(name);
		   System.out.println("Retrieved employee: " + employees);
		   return employees;
	   }
	
}
