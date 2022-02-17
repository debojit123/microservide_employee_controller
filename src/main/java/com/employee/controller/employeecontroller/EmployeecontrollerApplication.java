package com.employee.controller.employeecontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EmployeecontrollerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeecontrollerApplication.class, args);
	}

}
