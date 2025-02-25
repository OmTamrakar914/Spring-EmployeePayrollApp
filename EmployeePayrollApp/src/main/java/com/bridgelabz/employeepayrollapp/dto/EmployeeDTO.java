package com.bridgelabz.employeepayrollapp.dto;


public class EmployeeDTO {
  private String name;
  private double salary;
  
  
  public EmployeeDTO(String name, double salary) {
	  this.name = name;
	  this.salary = salary;
  }
  
  public String getName() {
	  return name;
  }
  
  public void setMessege(String messege) {
	  this.name = name;
  }
   
  public Object getSalary() {
	  return salary;
  }
  public void setSalary(double salary) {
	  this.salary = salary;
  }
}
