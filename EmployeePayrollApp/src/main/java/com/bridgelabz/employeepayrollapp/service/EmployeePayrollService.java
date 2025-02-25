package com.bridgelabz.employeepayrollapp.service;
import java.util.*;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.bridgelabz.employeepayrollapp.dto.*;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;

@Service
public class EmployeePayrollService implements IEmployeeServiceInterface{
    @Override
	public List<EmployeePayrollData> getEmployeePayrollData(){
		List<EmployeePayrollData> empDataList = new ArrayList<>();
		empDataList.add(new EmployeePayrollData(1, new EmployeeDTO("Om Tamrakar",100000.00)));
		return empDataList;
	}

	@Override
	public EmployeePayrollData getEmployeePayrollDatabyId(int empId) {
		EmployeePayrollData empData = null;
		empData = new EmployeePayrollData(1,new EmployeeDTO("Om Tamrakar",100000.00));
		return empData;
	}

	@Override
	public EmployeePayrollData createEmployeePayrollData(EmployeeDTO employeeDTO) {
		EmployeePayrollData empData = null;
		empData = new EmployeePayrollData(1,employeeDTO);
		return empData;
	}

	@Override
	public EmployeePayrollData updateEmployeePayrollData(EmployeeDTO employeeDTO) {
		EmployeePayrollData empData = null;
		empData = new EmployeePayrollData(1,employeeDTO);
		return empData;
	}

	@Override
	public void deleteEmployeePayrollData(int empID) {
		
	}
}
