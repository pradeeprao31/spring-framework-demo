package com.springcore.spel;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class test {

	public static void main(String[] args) {
		
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/spel/el.xml");
              
		demo demo1= context.getBean("demo", demo.class);
		
		System.out.println(demo1);
//		System.out.println();
//		System.out.println("*************************************************************************");
//		
//		SpelExpressionParser temp= new SpelExpressionParser();
//		
//		
//		org.springframework.expression.Expression exp = temp.parseExpression("44 + 55");
//
//		
//		System.out.println(exp.getValue());
	}

}
