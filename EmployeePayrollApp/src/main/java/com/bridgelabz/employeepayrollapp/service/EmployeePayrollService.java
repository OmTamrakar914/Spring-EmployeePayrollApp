package com.bridgelabz.employeepayrollapp.service;
import java.util.*;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.bridgelabz.employeepayrollapp.dto.*;
import com.bridgelabz.employeepayrollapp.exceptions.EmployeePayrollException;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;

@Service
public class EmployeePayrollService implements IEmployeeServiceInterface{
	
	private List<EmployeePayrollData> employeePayrollList = new ArrayList<>();
    @Override
	public List<EmployeePayrollData> getEmployeePayrollData(){
	
		return employeePayrollList;
	}

	@Override
	public EmployeePayrollData getEmployeePayrollDatabyId(int empId) {
	
		return employeePayrollList.stream()
				.filter(empData -> empData.getEmployeeId() == empId)
				.findAny()
				.orElseThrow(() -> new EmployeePayrollException("Employee Not Found"));
	}

	@Override
	public EmployeePayrollData createEmployeePayrollData(EmployeeDTO employeeDTO) {
		EmployeePayrollData empData = null;
		empData = new EmployeePayrollData(employeePayrollList.size()+1,employeeDTO);
		employeePayrollList.add(empData);
		return empData;
	}

	@Override
	public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeeDTO employeeDTO) {
		EmployeePayrollData empData = this.getEmployeePayrollDatabyId(empId);
		empData.setName(employeeDTO.getName());
		empData.setSalary((double)employeeDTO.getSalary());
		employeePayrollList.set(empId-1,empData);
		return empData;
	}

	@Override
	public void deleteEmployeePayrollData(int empID) {
		employeePayrollList.remove(empID-1);
	}
}
