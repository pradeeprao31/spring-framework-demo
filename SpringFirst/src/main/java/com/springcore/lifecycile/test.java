package com.springcore.lifecycile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycile/Mm.xml");
		
//		mango M1 = (mango)context.getBean("Mango");
//
//		System.out.println(M1);
		context.registerShutdownHook();
//		
//		
//		System.out.println("***********************************************************************************");
//		
//		 pepsi p1=(pepsi)context.getBean("p1");
//		 
//		 System.out.println(p1);
		
		
		example e1= (example)context.getBean("e1");
		
		System.out.println(e1);
		
	}

}
