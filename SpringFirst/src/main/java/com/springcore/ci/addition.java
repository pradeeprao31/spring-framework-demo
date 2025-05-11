package com.springcore.ci;

public class addition {
	
	private int a;
	private int b;
	
	public addition(int a, int b) {
		this.a=a;
		this.b=b;
		System.out.println(" constructor : int + int");
	}
	
	public addition(double a, double b) {
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("constructor overload/...");
	}
	
	public addition(String a, String b) {
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println(" constructor : String + String");
		
	}
	
	public  void doSum() {
		System.out.println("sum is :" +(this.a+this.b));
		
	}

	@Override
	public String toString() {
		return "addition [a=" + a + ", b=" + b + "]";
	}
	

}
