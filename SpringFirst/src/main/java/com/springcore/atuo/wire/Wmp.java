package com.springcore.atuo.wire;

public class Wmp {
	
	private Adderss address;

	public Adderss getAddress() {
		return address;
	}

	public void setAddress(Adderss address) {
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
