package com.springcore.beanLifeCycleMethods;

public class ShopBean {
	private String shopName;
	private String openTime;
	private String closeTime;

	// Constructors
	public ShopBean() {
		super();
	}
	public ShopBean(String shopName) {
		super();
		this.shopName = shopName;
	}
	public ShopBean(String shopName, String openTime, String closeTime) {
		super();
		this.shopName = shopName;
		this.openTime = openTime;
		this.closeTime = closeTime;
	}

	
	// Getters and Setters
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getOpenTime() {
		return openTime;
	}
	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}
	public String getCloseTime() {
		return closeTime;
	}
	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}
	
	
	public void init() {
		System.out.println("From Init method...");
		if (this.openTime != null)
			System.out.println("openTime=" + this.openTime);
		if (this.closeTime != null)
			System.out.println("closeTime=" + this.closeTime);
	}

	public void destroy() {
		System.out.println(this.getClass().getSimpleName() + "'s destroy() has been called.");
	}

	@Override
	public String toString() {
		return "Shop [openTime=" + openTime + ", closeTime=" + closeTime + "]";
	}
}
