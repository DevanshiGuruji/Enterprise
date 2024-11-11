package com.mvc.controlers;

public class HomeController {
	
	@RequestMapping("/home")
	public String Home() 
	{
		System.out.println("this is front page");
		return index;
	}
}
