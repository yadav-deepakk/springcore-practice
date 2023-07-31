package com.springcore.springcore;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private int employeeId;
	private String employeeName;
	private List<String> employeePhoneNumbers;
	private Set<String> employeeAddresses;
	private Map<String, String> courses;

	// Constructors
	public Employee() {
		super();
	}
	public Employee(int employeeId, String employeeName, List<String> employeePhoneNumbers, Set<String> employeeAddresses,
			Map<String, String> courses) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeePhoneNumbers = employeePhoneNumbers;
		this.employeeAddresses = employeeAddresses;
		this.courses = courses;
	}

	// Getters and Setters
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public List<String> getEmployeePhoneNumbers() {
		return employeePhoneNumbers;
	}
	public void setEmployeePhoneNumbers(List<String> employeePhoneNumbers) {
		this.employeePhoneNumbers = employeePhoneNumbers;
	}
	public Set<String> getEmployeeAddresses() {
		return employeeAddresses;
	}
	public void setEmployeeAddresses(Set<String> employeeAddresses) {
		this.employeeAddresses = employeeAddresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	// printing object details
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}

}
