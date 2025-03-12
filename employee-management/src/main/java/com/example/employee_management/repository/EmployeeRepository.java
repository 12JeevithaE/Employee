package com.example.employee_management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.employee_management.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	@Query("SELECT e FROM Employee e WHERE " + "LOWER(e.name) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " 
	+ "LOWER(e.designation) LIKE LOWER(CONCAT('%', :keyword, '%' )) OR "
    + "CAST(e.salary AS  string) LIKE CONCAT('%' , : keyword, '%')")


	List<Employee> searchEmployees(@Param("keyword")String keyword);
}
