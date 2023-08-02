package com.springcore.beanLifeCycleMethods;

public class Shop {	
	private String shopName; 
	private String openTime; 
	private String closeTime;
	
	public Shop() {
		super();
	}	
	
	public Shop(String shopName) {
		super();
		this.shopName = shopName;
	}
	
	public Shop(String shopName, String openTime, String closeTime) {
		super();
		this.shopName = shopName;
		this.openTime = openTime;
		this.closeTime = closeTime;
	}
	
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
		if(this.openTime!=null) System.out.println("openTime="+ this.openTime);
		if(this.closeTime!=null) System.out.println("closeTime="+ this.closeTime);
	}
	
	public void destroy() {
		System.out.println(this.getClass().getName() + "'s destroy() has been called.");
	}

	@Override
	public String toString() {
		return "Shop [openTime=" + openTime + ", closeTime=" + closeTime + "]";
	}
}
