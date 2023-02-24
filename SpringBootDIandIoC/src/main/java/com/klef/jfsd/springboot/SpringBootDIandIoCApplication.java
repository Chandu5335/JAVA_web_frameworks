package com.klef.jfsd.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDIandIoCApplication 
{
	public static void main(String[] args) 
	{
		//SpringApplication.run(SpringBootDIandIoCApplication.class, args);
		
		//the above method returns a variable of type ConfigurableApplicationContext (IoC)
		
		
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootDIandIoCApplication.class, args);
		
		System.out.println("*****Spring Boot with Setter DI*****");
		
		Employee emp = (Employee) applicationContext.getBean("empbean");
		
		System.out.println(emp.toString());
		
		System.out.println("*****Spring Boot with Constructor DI*****");
		
		Student student = (Student)applicationContext.getBean("studentbean");
		
		System.out.println(student.toString());
		
		
		//System.out.println("Happy Diwali ..... !!!!  ");
		
	}

}
