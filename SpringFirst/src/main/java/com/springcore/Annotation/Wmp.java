package com.springcore.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Wmp {
	@Autowired
	@Qualifier("A2")
	private Adderss address;

	public Adderss getAddress() {
		System.out.println("Setting value");
		return address;
	}
	//@Autowired
	public void setAddress(Adderss address) {
		System.out.println("Getting value");
		this.address = address;
	}

	public Wmp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Wmp(Adderss address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Wmp [address=" + address + "]";
	}


	

}
