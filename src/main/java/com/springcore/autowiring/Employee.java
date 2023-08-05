package com.springcore.autowiring;

public class Employee {
	private int empId;
	private String empName;
	private Address empAddress;
	
	// Constructors
	public Employee() {
		super();
	}
	public Employee(int empId, String empName, Address empAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
	}

	// Getters, Setters
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(Address empAddress) {
		this.empAddress = empAddress;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + "]";
	}

}
