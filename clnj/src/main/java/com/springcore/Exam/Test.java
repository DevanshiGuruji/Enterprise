package com.springcore.Exam;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static AbstractApplicationContext context;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		Exam1 p1=(Exam1)context.getBean("exam");
		System.out.println(p1.getQuestion());
		System.out.println(p1.getAnswer());
		

	}

}
