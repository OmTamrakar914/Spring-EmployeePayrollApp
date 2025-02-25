package com.bridgelabz.employeepayrollapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.bridgelabz.employeepayrollapp.dto.*;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;

//UseCase : 3

@RestController
@RequestMapping("/employeePayrollService")
public class EmployeePayrollController {
 
	@GetMapping("/get")
	public ResponseEntity<ResponseDTO> getAllemployeePayrollData() {
		
		EmployeePayrollData empData = null;
		empData = new EmployeePayrollData(1, new EmployeeDTO("Om", 50000.00));
		ResponseDTO responsedto = new ResponseDTO("GET: getting all employee record",  empData);
		return  new ResponseEntity(responsedto, HttpStatus.OK);
	}
	
	@GetMapping("/get/{empId}")
	public ResponseEntity<ResponseDTO> getemployeePayrollData(@PathVariable(value = "empId") int id) {
		EmployeePayrollData empData = null;
		empData = new EmployeePayrollData(1, new EmployeeDTO("Om", 50000.00));
		ResponseDTO responsedto = new ResponseDTO("GET: call for ID successful",  empData);
		return  new ResponseEntity(responsedto, HttpStatus.OK);
	}
	

	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> createEmployeePayrollData(@RequestBody EmployeeDTO employeeDTO){
		
		EmployeePayrollData empData = null;
		empData = new EmployeePayrollData(1,employeeDTO);
		ResponseDTO resDTO = new ResponseDTO("Created Employee Payroll Data Successfully", empData);
		return new ResponseEntity<ResponseDTO>(resDTO, HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@RequestBody EmployeeDTO employeeDTO){
		EmployeePayrollData empData = null;
		empData = new EmployeePayrollData(1,employeeDTO);
		ResponseDTO resDTO = new ResponseDTO("Updated Employee Payroll Data Successfully", empData);
		return new ResponseEntity<ResponseDTO>(resDTO, HttpStatus.OK);
	}
	
	
	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable(value = "empId") int empId){
		ResponseDTO resDTO = new ResponseDTO("Deleted Successfully, Deleted id: "+empId);
		return  new ResponseEntity<ResponseDTO>(resDTO, HttpStatus.OK);
	}	
	
}
