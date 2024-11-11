package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	
	@Override
	public String toString() {
		return "Example [sub=" + sub + "]";
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	private String sub;

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct 
	public void start()
	{
		System.out.println("subject start");
	}
	
	@PreDestroy 
	public void end() 
	{
		System.out.println("subject end");
	}
	
	

}
