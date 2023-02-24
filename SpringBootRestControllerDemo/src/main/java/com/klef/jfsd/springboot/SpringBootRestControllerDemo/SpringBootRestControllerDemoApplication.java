package com.klef.jfsd.springboot.SpringBootRestControllerDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.klef.jfsd.springboot")
public class SpringBootRestControllerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestControllerDemoApplication.class, args);
		System.out.println("Sprin Boot Rest Controller Demo");
	}

}
