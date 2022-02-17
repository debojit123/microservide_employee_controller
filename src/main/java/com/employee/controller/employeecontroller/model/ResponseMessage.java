package com.employee.controller.employeecontroller.model;

public class ResponseMessage<T> {
	
	private int status;
	private T body;
	
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public T getBody() {
		return body;
	}
	public void setBody(T body) {
		this.body = body;
	}
	
	

}
