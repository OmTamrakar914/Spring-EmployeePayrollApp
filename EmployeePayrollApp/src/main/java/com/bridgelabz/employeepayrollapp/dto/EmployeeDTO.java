package com.bridgelabz.employeepayrollapp.dto;
import lombok.*;
import jakarta.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
	
  @NotEmpty(message = "Employee name cannot br null")
  @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee name Invalid")
  private String name;
  
  @Min(value=500,message = "Min Wage should be more than 500")
  private double salary;
  
}
