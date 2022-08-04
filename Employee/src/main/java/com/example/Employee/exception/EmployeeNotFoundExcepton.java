package com.example.Employee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class EmployeeNotFoundExcepton extends Exception {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmployeeNotFoundExcepton(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
	
}
