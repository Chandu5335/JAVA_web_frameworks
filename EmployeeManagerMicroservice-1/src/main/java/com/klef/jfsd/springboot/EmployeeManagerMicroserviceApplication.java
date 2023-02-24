package com.klef.jfsd.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan(basePackages = "com.klef.jfsd.springboot")
public class EmployeeManagerMicroserviceApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(EmployeeManagerMicroserviceApplication.class, args);
		System.out.println("Employee Manager Microservice ... !!");
	}
	
	@Bean
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}


}
