package com.springcore.standalone.collection;

import java.util.List;

public class Employee {
	
	@Override
	public String toString() {
		return "Employee [Ename=" + Ename + "]";
	}

	public List<String> getEname() {
		return Ename;
	}

	public void setEname(List<String> ename) {
		Ename = ename;
	}

	private List<String> Ename;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(List<String> ename) {
		super();
		Ename = ename;
	}
	
	

}
