package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.javaconfig")
public class javaconfig {
	
	@Bean
	public Student getStudent() {
		
		Student student = new  Student();
		return student;
		
	}

}
