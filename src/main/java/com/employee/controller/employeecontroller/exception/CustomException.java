package com.employee.controller.employeecontroller.exception;

public class CustomException extends Exception {
	
	private int status;
	
	public CustomException(String errorMessage, int status) {
		super(errorMessage);
		
		this.status = status;
	}

	public int getStatus() {
		return status;
	}
	
	

}
