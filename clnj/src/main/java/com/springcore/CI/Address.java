package com.springcore.CI;

public class Address {
	
	@Override
	public String toString() {
		return this.area+","+ this.pin;
	}
	String area;
	int pin;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String area, int pin) {
		super();
		this.area = area;
		this.pin = pin;
	}
	

}
