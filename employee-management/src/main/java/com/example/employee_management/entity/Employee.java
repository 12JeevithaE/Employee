package com.example.employee_management.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="myEmployee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;
	private String name;
	private String designation;
	private int salary;
	
	public Employee(long id, String name, String designation, int salary) {
		
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary; 
	}

	public Employee() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
