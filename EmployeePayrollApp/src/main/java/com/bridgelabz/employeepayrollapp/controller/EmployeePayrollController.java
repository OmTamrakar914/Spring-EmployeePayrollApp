package com.bridgelabz.employeepayrollapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.bridgelabz.employeepayrollapp.dto.*;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import com.bridgelabz.employeepayrollapp.service.EmployeePayrollService;
import com.bridgelabz.employeepayrollapp.service.IEmployeeServiceInterface;

//UseCase : 4

@RestController
@RequestMapping("/employeePayrollService")
public class EmployeePayrollController {
	
	@Autowired
	private EmployeePayrollService employeePayrollService;
 
	@GetMapping({"", "/", "/get"})
	public ResponseEntity<ResponseDTO> getAllemployeePayrollData() {
		
		List<EmployeePayrollData> empDataList = null;
		empDataList = employeePayrollService.getEmployeePayrollData();
		EmployeePayrollData empData = null;
		ResponseDTO responsedto = new ResponseDTO("GET: call Successful",  empDataList);
		return  new ResponseEntity(responsedto, HttpStatus.OK);
	}
	
	@GetMapping("/get/{empId}")
	public ResponseEntity<ResponseDTO> getemployeePayrollData(@PathVariable(value = "empId") int id) {
		EmployeePayrollData empData = null;
		empData = employeePayrollService.getEmployeePayrollDatabyId(id);
		ResponseDTO responsedto = new ResponseDTO("GET: call for ID successful",  empData);
		return  new ResponseEntity(responsedto, HttpStatus.OK);
	}
	

	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> createEmployeePayrollData(@RequestBody EmployeeDTO employeeDTO){
		
		EmployeePayrollData empData = null;
		empData = employeePayrollService.createEmployeePayrollData(employeeDTO);
		ResponseDTO resDTO = new ResponseDTO("Created Employee Payroll Data Successfully", empData);
		return new ResponseEntity<ResponseDTO>(resDTO, HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@RequestBody EmployeeDTO employeeDTO){
		EmployeePayrollData empData = null;
		empData = employeePayrollService.updateEmployeePayrollData(employeeDTO);
		ResponseDTO resDTO = new ResponseDTO("Updated Employee Payroll Data Successfully", empData);
		return new ResponseEntity<ResponseDTO>(resDTO, HttpStatus.OK);
	}
	
	
	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable(value = "empId") int empId){
		employeePayrollService.deleteEmployeePayrollData(empId);
		ResponseDTO resDTO = new ResponseDTO("Deleted Successfully, Deleted id: "+empId);
		return  new ResponseEntity<ResponseDTO>(resDTO, HttpStatus.OK);
	}	
	
}
