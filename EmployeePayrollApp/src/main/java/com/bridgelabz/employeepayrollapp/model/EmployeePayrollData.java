package com.bridgelabz.employeepayrollapp.model;
import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;
import java.util.*;

@Entity
public @Data class EmployeePayrollData {

	
 	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private String name;
	//private int id;
	private double salary;
	private String gender;
	private LocalDate startDate;
	private String note;
	private String profilePic;
	private List<String> departments;
	
	public EmployeePayrollData() {
		
	}
	
	public EmployeePayrollData(int id, EmployeeDTO employeedto) {
		//this.id = id;
		this.name = employeedto.getName();
		this.salary = (double) employeedto.getSalary();
		this.gender = employeedto.gender;
		this.note = employeedto.note;
		this.startDate = employeedto.startDate;
		this.profilePic = employeedto.profilPic;
		this.departments = employeedto.department;
		
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
	
//	public int getEmployeeId() {
//		return id;
//	}
	
}
