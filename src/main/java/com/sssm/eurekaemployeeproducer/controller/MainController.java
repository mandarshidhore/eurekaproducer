package com.sssm.eurekaemployeeproducer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sssm.eurekaemployeeproducer.model.Employee;

@RestController
public class MainController {

	@GetMapping(value = "/employee")
	public Employee getEmployee() {
		Employee emp = new Employee();
		emp.setEmpId(1);
		emp.setFirstName("John");
		emp.setSalary(20000);
		return emp;
	}

}
