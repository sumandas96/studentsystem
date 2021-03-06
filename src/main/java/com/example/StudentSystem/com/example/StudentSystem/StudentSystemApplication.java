package com.example.StudentSystem.com.example.StudentSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableConfigurationProperties
//@EntityScan(basePackages = {"model"}) 
@ComponentScan

public class StudentSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentSystemApplication.class, args);
	}
	
	 @Bean
	   public RestTemplate getRestTemplate() {
	      return new RestTemplate();
	   }

}
