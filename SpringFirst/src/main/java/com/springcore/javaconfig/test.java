package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		ApplicationContext  context= 
				new AnnotationConfigApplicationContext(javaconfig.class);
		
		Student  student=context.getBean("getStudent",Student.class);
		
		System.out.println(student);
		student.stu();
		

	}

}
