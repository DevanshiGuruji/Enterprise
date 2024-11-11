package com.springcore.lifecycle;

public class Department {
	
	@Override
	public String toString() {
		return "Department [dname=" + dname + "]";
	}
	
	public void init()
	{
		System.out.println("initializa department value");
	}
	
	public void destroy()
	{
		System.out.println("destroy department value"); 
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	private String dname;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
