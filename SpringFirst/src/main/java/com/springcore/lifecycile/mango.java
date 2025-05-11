package com.springcore.lifecycile;

public class mango {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price...");
		this.price = price;
	}

	public mango() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "mango [price=" + price + "]";
	}
	
	
	public void init() {
		System.out.println("Inside init method");
	}
	
	public void destroy() {
		System.out.println("Inside destroy method");
	}
	

}
