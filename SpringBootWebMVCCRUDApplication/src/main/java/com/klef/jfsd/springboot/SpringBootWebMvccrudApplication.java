package com.klef.jfsd.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.klef.jfsd.springboot")
public class SpringBootWebMvccrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebMvccrudApplication.class, args);
		System.out.println("Spring Boot Web MVC Application");
	}

}
