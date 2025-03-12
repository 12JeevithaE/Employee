package com.example.employee_management.service;import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.employee_management.entity.Employee;
import com.example.employee_management.repository.EmployeeRepository;


@Service

public class EmployeeService {
	@Autowired
	public EmployeeRepository emprepo;
	

   public Employee getEmployee(Long id) {
	   return emprepo.findById(id).get();
   }
   
  public List<Employee> getAllEmployee( ){
	   return emprepo.findAll();
   }
   
   public Employee addEmployee(Employee e) {
	   return emprepo.save(e);
   }
   
   public Employee updateEmployee(long id, Employee e) {
	   Employee existingEmployee=getEmployee(id);
	   if (existingEmployee != null) {
//		   existingEmployee.setId(e.getId());
		   existingEmployee.setName(e.getName());
		   existingEmployee.setDesignation(e.getDesignation());
		   existingEmployee.setSalary(e.getSalary());
		   return emprepo.save(existingEmployee);
	   }
	   return (null);
   }
   
   
   public void deleteEmployee(long id) {
	    emprepo.deleteById(id);

   }

public List<Employee> findEmployeesByName(String name) {
	// TODO Auto-generated method stub
	return emprepo.searchEmployees(name);
}
   
   

}



