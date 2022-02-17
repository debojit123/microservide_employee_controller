package com.employee.controller.employeecontroller.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.employee.controller.employeecontroller.exception.CustomException;
import com.employee.controller.employeecontroller.model.ErrorResponse;

@RestControllerAdvice
public class GlocalExceptionHandler {
	
	@ExceptionHandler(value = {CustomException.class})
	public ResponseEntity<ErrorResponse> handleCustomException(CustomException e){
		
		ErrorResponse err = new ErrorResponse();
		
		err.setMessage(e.getMessage());
		
		return new ResponseEntity<ErrorResponse>(err,HttpStatus.valueOf(e.getStatus()));
		
	}
	

}
