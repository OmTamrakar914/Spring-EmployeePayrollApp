package com.bridgelabz.employeepayrollapp.dto;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

import jakarta.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public @ToString class EmployeeDTO {
	
	
  @NotEmpty(message = "Employee name cannot br null")
  @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee name Invalid")
  private String name;
  
  @Min(value=500,message = "Min Wage should be more than 500")
  private double salary;
  
  public String gender;
  
  public LocalDate startDate;
  
  public String note;
  
  public String profilPic;
  
  public List<String> department;
}
