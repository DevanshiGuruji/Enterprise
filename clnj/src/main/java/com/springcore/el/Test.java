package com.springcore.el;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) throws Exception {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/el/config.xml");
		Demo s1=(Demo)context.getBean("demo");
		System.out.println(s1);                                                                             
		
	}
	
	

}
