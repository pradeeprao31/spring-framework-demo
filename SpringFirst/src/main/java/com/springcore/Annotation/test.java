package com.springcore.Annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@Configuration
@ComponentScan(basePackages = "com.springcore.auto.wire")
public class test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/Annotation/anno.xml");
		Wmp a1= (Wmp) context.getBean("W1",Wmp.class);
		System.out.println(a1);

	}

}
