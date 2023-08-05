package com.springcore.beanLifeCycleMethods;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Bicycle {
	private double price;
	private String brand;

	public Bicycle() {
		super();
	}
	public Bicycle(double price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Bicycle [price=" + price + ", brand=" + brand + "]";
	}

	@PostConstruct
	public void start() {
		System.out.println(this.getClass().getSimpleName() + "'s Init Mentod called.");
	}

	@PreDestroy
	public void end() {
		System.out.println(this.getClass().getSimpleName() + "'s Destroy Mentod called.");
	}
}
