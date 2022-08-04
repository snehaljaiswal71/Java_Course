package com.example.Employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.jdbc.Sql;

import com.example.Employee.model.Employees;

@Repository   // this class act as  database layer
public interface EmployeeRepository extends JpaRepository<Employees, Long> {
   
	
	//  insert into table tablename values()
}
