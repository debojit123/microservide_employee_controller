package com.employee.controller.employeecontroller.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.employee.controller.employeecontroller.errordecoder.CustomErrorDecoder;
import com.employee.controller.employeecontroller.model.EmployeeLoginResponse;

@FeignClient(value = "EmployeeService",configuration = {CustomErrorDecoder.class})
public interface EmployeeControllerFeign {
	
	@GetMapping(value = "/loginDetails")
	public EmployeeLoginResponse login(@RequestParam("id")String id);

}
