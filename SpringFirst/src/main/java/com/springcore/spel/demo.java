package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class demo {
	
	@Value("#{14+22}")
	private int x;
	
	@Value("#{14+22+85}")
	private int y;
	
	
	@Value("#{T(java.lang.Math).sqrt(66)}")
	private int z;
	
	@Value("#{T(java.lang.Math).E}")
	private double E;
	
	
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
	
	
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	
	public double getE() {
		return E;
	}
	public void setE(int e) {
		this.E = e;
	}
	
	@Value("#{8>3}")
	private boolean isActive;


	@Override
	public String toString() {
		return "demo [x=" + x + ", y=" + y + ", z=" + z + ", E=" + E + ", isActive=" + isActive + "]";
	}


	
	
	
	
	
	
	
	

}
