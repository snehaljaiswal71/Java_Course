package com.example.Employee.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.example.Employee.model.Employees;

@ControllerAdvice
public class GlobalExceptionHandle {

	@ExceptionHandler(EmployeeNotFoundExcepton.class)
	public ResponseEntity<ErrorDetails> handleException(EmployeeNotFoundExcepton ex, WebRequest request) {
		ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	/*@ExceptionHandler(SystemExeption.class)
	public ResponseEntity<ErrorDetails> handleException(EmployeeNotFoundExcepton ex, WebRequest request) {
		ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}*/

}
