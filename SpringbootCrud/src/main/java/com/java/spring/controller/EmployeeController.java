package com.java.spring.controller;

import java.util.List;

import org.json.JSONObject;
import org.json.XML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.spring.model.Employee;
import com.java.spring.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/v2")
public class EmployeeController {

	@Autowired
	EmployeeRepository repository;

	@PostMapping(value = "/employees") // create // get // put // delete
	public ResponseEntity<Boolean> createEmployee(@RequestBody Employee employee) {
		boolean checck = employee.getPhoneNumber().startsWith("99");
		return ResponseEntity.status(HttpStatus.CREATED).body(checck);

	}

	@GetMapping("/getEmployees")
	public List<Employee> getAllEmployees() {
		return repository.findAll();

	}

}
