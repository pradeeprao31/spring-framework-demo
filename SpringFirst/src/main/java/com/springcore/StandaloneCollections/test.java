package com.springcore.StandaloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/StandaloneCollections/alon.xml");

        // Get the Preson bean (or Person if you've corrected the spelling)
        Preson p1 = context.getBean("P1", Preson.class);

        // Print the bean's toString() output
        System.out.println(p1);
        
        System.out.println(p1.getFriend().getClass().getName());
        
        
        System.out.println("*********************************************************************");
        
        System.out.println(p1.getFeesStructre());
    }
}
