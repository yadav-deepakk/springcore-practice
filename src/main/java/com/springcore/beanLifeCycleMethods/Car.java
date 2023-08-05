package com.springcore.beanLifeCycleMethods;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Car implements InitializingBean, DisposableBean{
	private String brand;
	private String model;
	private int price;
	
	// Constructors
	public Car() {
		super();
	}
	public Car(String brand, String model, int price) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	// Getters and Setters 
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

	public void afterPropertiesSet() throws Exception {
		System.out.println("This is " + this.getClass().getSimpleName() + "'s Init Method");
	}
	
	public void destroy() throws Exception {
		System.out.println("This is " + this.getClass().getSimpleName() + "'s Destroy Method");
		
	}
	
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", price=" + price + "]";
	}
	
}
