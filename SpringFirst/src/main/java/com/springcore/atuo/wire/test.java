package com.springcore.atuo.wire;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@Configuration
@ComponentScan(basePackages = "com.springcore.auto.wire")
public class test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/atuo/wire/au.xml");
		Adderss a1 = (Adderss)context.getBean("A1",Adderss.class);
		System.out.println(a1);

	}

}
