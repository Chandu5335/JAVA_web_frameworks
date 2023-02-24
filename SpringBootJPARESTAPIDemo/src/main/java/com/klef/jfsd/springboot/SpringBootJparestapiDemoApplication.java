package com.klef.jfsd.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.klef.jfsd.springboot")
public class SpringBootJparestapiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJparestapiDemoApplication.class, args);
		System.out.println("Spring Boot Application to implement RESTFul Web Services with JPA");
	}

}
