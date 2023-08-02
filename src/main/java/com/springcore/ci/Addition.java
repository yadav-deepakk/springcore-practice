package com.springcore.ci;

public class Addition {
	private int x;
	private int y;
	
	public Addition() {
		super();
	}
	public Addition(String x, String y) {
		super();
		this.x = Integer.parseInt(x);
		this.y = Integer.parseInt(y);
		System.out.println("Constructor: String, String");
	}
	public Addition(double x, double y) {
		super();
		this.x =(int) x;
		this.y =(int) y;
		System.out.println("Constructor: double, double");
	}
	public Addition(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		System.out.println("Constructor: int, int");
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void doSum() {
		System.out.println("Sum="+(this.x+this.y));
	}
	
	@Override
	public String toString() {
		return "Addition [x=" + x + ", y=" + y + "]";
	}

}
