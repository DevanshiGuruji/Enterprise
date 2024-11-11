package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.Dao.EmpDao;
import com.spring.jdbc.entities.Employee;

public class App 
{
    
	private static ApplicationContext c;
	public static void main( String[] args )
    {
   
        ApplicationContext c = new ClassPathXmlApplicationContext("com/spring/jdbc/Config.xml");
        EmpDao t=c.getBean("EmpDao",EmpDao.class);
        Employee c1=new Employee();
        c1.setEid(225);
        c1.setEname("Devanshi");
        c1.setDname("Accountant");
        int r =t.insert(c1);
        
        System.out.println("Record Inserted"+r);
        
    }
}
