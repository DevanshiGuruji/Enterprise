package com.spring.jdbc.Dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.EmpDao;
import com.spring.jdbc.entities.Employee;

public class App 
{
    private static ApplicationContext c;
	public static void main( String[] args )
    {
    	
    	c = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
    	EmpDao cd = c.getBean("EmpDao",EmpDao.class);
    	
    	Employee c1 = new Employee();
    	c1.setEid(225);
    	c1.setEname("Devanshi");
    	c1.setDname("Accountant");
    	int r = cd.insert(c1);
    	
    	System.out.println("Record inserted" +r);
    }
}
