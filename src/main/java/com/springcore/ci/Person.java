package com.springcore.ci;

public class Person {
	private int personId;
	private String name;
	private String gender;
	private float age;
	private Certificate cert;
	
	// Constructors
	public Person() {
		super();
	}
	public Person(int personId, String name, String gender, float age, Certificate cert) {
		super();
		this.personId = personId;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.cert = cert;
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

	// toStringMethod
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", gender=" + gender + ", age=" + age + 
				", cert=" + cert + "]";
	}
	
	
}
