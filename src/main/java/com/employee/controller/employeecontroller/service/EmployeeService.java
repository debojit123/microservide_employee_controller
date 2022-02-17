package com.employee.controller.employeecontroller.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.controller.employeecontroller.feign.EmployeeControllerFeign;
import com.employee.controller.employeecontroller.model.EmployeeLogin;
import com.employee.controller.employeecontroller.model.EmployeeLoginRequest;
import com.employee.controller.employeecontroller.model.EmployeeLoginResponse;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeControllerFeign employeeproxy;

	public EmployeeLoginResponse login(EmployeeLoginRequest login)
	{
		EmployeeLoginResponse response =employeeproxy.login(login.getUserid());
		EmployeeLogin obj = response.getBody();
		char[] password = login.getPassword().toCharArray();
		if(obj!=null && Arrays.equals(password, obj.getPassword()))
		{
		response.setMessage("Success");
		response.setStatus(200);
		}
		else
		{
			response.setMessage("Failed");
			response.setStatus(200);
		}
		response.setBody(null);
		
		return response;
	}

}
