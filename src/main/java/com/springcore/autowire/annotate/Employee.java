package com.springcore.autowire.annotate;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	@Autowired
	private Address empAddress;
	
	// Constructors
	public Employee() {
		super();
		System.out.println("Employee's constructor is called.");
	}
	
	// @Autowired
	public Employee(Address empAddress) {
		super();
		this.empAddress = empAddress;
		System.out.println("Employee's parameterised constructor is called.");
	}

	// Getters, Setters
	public Address getEmpAddress() {
		return empAddress;
	}
	
	// @Autowired
	public void setEmpAddress(Address empAddress) {
		System.out.println("Setting address property.");
		this.empAddress = empAddress;
	}
	
	@Override
	public String toString() {
		return "Employee [empAddress=" + empAddress + "]";
	}

}
