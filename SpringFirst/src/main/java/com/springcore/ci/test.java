package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/ci.xml");
		
		Preson p= (Preson)context.getBean("person");
		
		addition add=(addition) context.getBean("Add");
		
		
		System.out.println(add);
		
		add.doSum();
		
		System.out.println(p);
		

	}

}
