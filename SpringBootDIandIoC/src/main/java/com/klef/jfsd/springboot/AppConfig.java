package com.klef.jfsd.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig 
{
   @Bean("empbean")
   public Employee setEmployeeData()
   {
	   Employee emp = new Employee();
	   
	   emp.setId(101);
	   emp.setName("KLUNIVERSITY");
	   emp.setSalary(25000.50);
	   
	   return emp;
   }
   
   @Bean("studentbean")
   public Student setStudentBean()
   {
	   Student student = new Student(4654,"SURYA","CBIT",8.58,0); // constructor
	   
	   return student;
   }
   
   
}
