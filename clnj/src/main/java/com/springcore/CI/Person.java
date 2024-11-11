package com.springcore.CI;

public class Person {
	
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", add=" + add + "]";
	}
	private int pid;
	private String pname; 
	private Address add;
	public Person(int pid, String pname, Address add) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.add = add;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	

}
