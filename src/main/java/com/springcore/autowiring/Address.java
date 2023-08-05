package com.springcore.autowiring;

public class Address {
	private String street;
	private String city;
	private String pincode;

	// Constructor
	public Address() {
		super();
	}
	public Address(String street, String city, String pincode) {
		super();
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}
	
	// Getters and Setters
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", pincode=" + pincode + "]";
	}
}
