package com.employee.controller.employeecontroller.errordecoder;

import com.employee.controller.employeecontroller.exception.CustomException;

import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomErrorDecoder implements ErrorDecoder {

	@Override
	public Exception decode(String methodKey, Response response) {
		if(response.status() == 404)
		{
			return new CustomException("Resource Not Found",404);
		}
		else
		{
			return new CustomException("Server Error",500);
		}
	}

}
