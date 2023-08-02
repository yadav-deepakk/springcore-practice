package com.springcore.ci;

import java.util.List;

public class Person {
	private int personId;
	private String name;
	private String gender;
	private float age;
	private Certificate cert;
	private List<String> addressList;
	
	// Constructors
	public Person() {
		super();
	}
	public Person(int personId, String name, String gender, float age, Certificate cert,List<String> addressList ) {
		super();
		this.personId = personId;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.cert = cert;
		this.addressList = addressList;
	}

	// Getters and Setters
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	public List<String> getAddressList() {
		return this.addressList;
	}
	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}

	// toStringMethod
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", gender=" + gender +
				", age=" + age + ", cert=" + cert + ", addressList=" + addressList + "]";
	}
	
	
}
