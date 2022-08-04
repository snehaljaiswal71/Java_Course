package com.example.Employee.validation;

import org.springframework.stereotype.Component;

import com.example.Employee.model.Employees;

@Component
public class EmployeesValidation {

	public void employeesCheck(Employees employees) throws Exception{
		if(employees.getEmailId()==null){
			throw new Exception("Employees is Empty");
		}
	}
	
}
