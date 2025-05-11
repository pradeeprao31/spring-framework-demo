package com.springcore.ci;

public class Preson {
	
	private String name;
	private int personId;
	private Cert cert;
	
	public Preson(String name, int personId, Cert cert) {
		this.name= name;
		this.personId= personId;
		this.cert=cert;		
	}


	@Override
	public String toString() {
		
		return this.name+" : " +this.personId +" {"+ this.cert.name+"}";
	}
	

}
