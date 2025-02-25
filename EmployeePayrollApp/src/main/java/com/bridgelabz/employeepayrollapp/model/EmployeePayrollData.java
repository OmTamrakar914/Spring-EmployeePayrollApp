package com.bridgelabz.employeepayrollapp.model;
import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmployeePayrollData {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private String name;
	private int id;
	private double salary;
	
	public EmployeePayrollData(int id, EmployeeDTO employeedto) {
		this.id = id;
		this.name = employeedto.getName();
		this.salary = (double) employeedto.getSalary();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
