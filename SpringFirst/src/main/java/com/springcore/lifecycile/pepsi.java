package com.springcore.lifecycile;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class pepsi implements InitializingBean , DisposableBean{
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "pepsi [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("taking pepsi from shop...");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("after deinking pepsi return the boutle to the shop...");
		
	}
	
	

}
