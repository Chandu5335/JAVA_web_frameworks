package com.klef.jfsd.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.info.ConditionalOnEnabledInfoContributor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan(basePackages = "com.klef.jfsd.springboot")
public class AdminMicroserviceProjectApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(AdminMicroserviceProjectApplication.class, args);
		System.out.println("Admin Microservice ... !!! ");
	}
	
	@Bean
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}

}
