package com.employee.controller.employeecontroller.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class EmployeeLoginResponse extends Response{
	
	private String message;
	
	@JsonInclude(Include.NON_NULL)
	private EmployeeLogin body;

	public EmployeeLogin getBody() {
		return body;
	}

	public void setBody(EmployeeLogin body) {
		this.body = body;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
