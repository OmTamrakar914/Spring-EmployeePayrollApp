package com.bridgelabz.employeepayrollapp.service;
import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import com.bridgelabz.employeepayrollapp.model.*;
import java.util.*;

public interface IEmployeeServiceInterface {

	 List<EmployeePayrollData> getEmployeePayrollData();
	
	 EmployeePayrollData getEmployeePayrollDatabyId(int empId);
	
	 EmployeePayrollData createEmployeePayrollData(EmployeeDTO employeeDTO);
	 
	 EmployeePayrollData updateEmployeePayrollData(EmployeeDTO employeeDTO);
	 
	 void deleteEmployeePayrollData(int empID);
	
	
}
