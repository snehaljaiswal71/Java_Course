package com.example.Employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Employees")
public class Employees {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "firstName")
	private String firstName;
	
	@Column(name = "LastName")
	private String LastName;
	
	@Column(name = "phonenumber")
	private String phoneNumber;
	
	@Column(name = "emailId")
	//@OneToOne(mappedBy = "LastName")
	private String emailId;

	public Employees() {
		// TODO Auto-generated constructor stub
	}

	public Employees(long id, String firstName, String lastName, String emailId,String phoneNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		LastName = lastName;
		this.emailId = emailId;
		this.phoneNumber=phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
