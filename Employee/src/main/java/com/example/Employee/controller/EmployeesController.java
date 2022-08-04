package com.example.Employee.controller;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.Employee.exception.EmployeeNotFoundExcepton;
import com.example.Employee.model.Employees;
import com.example.Employee.repository.EmployeeRepository;
import com.example.Employee.validation.EmployeesValidation;

@RestController 
@RequestMapping("/api/v1")
public class EmployeesController {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	EmployeesValidation valid;
	

	@PostMapping("/employees")   // to create / add
	public Employees createEmployes(@RequestBody Employees employees) throws Exception {
		valid.employeesCheck(employees);
		RestTemplate restTemplate =new RestTemplate();
		restTemplate.postForEntity("http://localhost:8056/api/v2/employees", employees, String.class);
		return employeeRepository.save(employees);
	}

	@GetMapping("/getEmployees")   // to get all
	public List<Employees> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@GetMapping("/getEmployees/{id}")  // to get by id
	public Optional<Employees> getEmployees(@PathVariable("id") long id) {
		return employeeRepository.findById(id);
	}

	@DeleteMapping("/getEmployees/{id}")// to delete by id
	public ResponseEntity<Employees> deleteEmployees(@PathVariable("id") long id) {
		employeeRepository.deleteById(id);
		return ResponseEntity.status(HttpStatus.ACCEPTED).build();
	}
	
	@PutMapping("/updateEmployees/{id}")
    public ResponseEntity<Employees> updateEmployees(@PathVariable("id") long id  ,
    		@RequestBody Employees employees ) throws EmployeeNotFoundExcepton{
	Employees emp=employeeRepository.findById(id).orElseThrow(()->
	new EmployeeNotFoundExcepton("Employee Not FOUND " +employees.getId()));
	emp.setEmailId(employees.getEmailId());
	emp.setFirstName(employees.getFirstName());
	emp.setLastName(employees.getLastName());
	employeeRepository.save(emp);
	return ResponseEntity.status(HttpStatus.OK).build();
    }
	
	  private HttpHeaders setHeader() {
	        HttpHeaders headers = new HttpHeaders();
	        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
	        headers.setContentType(MediaType.APPLICATION_JSON);
	        return headers;
	    }
	
	private HttpEntity<?> requestEntity(Object payload, HttpHeaders headers) {
        return new HttpEntity<>(payload, headers);
    }
}
