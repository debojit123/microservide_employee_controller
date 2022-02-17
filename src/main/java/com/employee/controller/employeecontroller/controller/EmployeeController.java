package com.employee.controller.employeecontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.controller.employeecontroller.model.EmployeeLoginRequest;
import com.employee.controller.employeecontroller.model.EmployeeLoginResponse;
import com.employee.controller.employeecontroller.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/login")
	public ResponseEntity<EmployeeLoginResponse> login(@RequestBody EmployeeLoginRequest login)
	{
		EmployeeLoginResponse response = service.login(login);
		return new ResponseEntity<EmployeeLoginResponse>(response,HttpStatus.valueOf(response.getStatus()));
		
	}

}
