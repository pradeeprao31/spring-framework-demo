package com.springcore.Stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    public static void main(String[] args) {
        // Load the Spring context from the correct XML file path
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/Stereotype/ST.xml");
        
        // Get the bean by the name 'student' as defined in @Component("student")
        Student student = context.getBean("student", Student.class);
        
//        // Print the student object
//        System.out.println(student);
//        
//        // Print the address of the student
//        System.out.println(student.getAddress());
//        System.out.println();
//        System.out.println("&&&&&&&*************************************************&&&&&&&&&");
//        System.out.println();
//        Student student2= context.getBean("student", Student.class);
//        
//        
//        
//        System.out.println(student.hashCode());
//        
//        System.out.println(student2.hashCode());
        
        
        bjp rss= context.getBean("RSS",bjp.class);
        bjp rss2= context.getBean("RSS",bjp.class);
        
        System.out.println(rss);
        System.out.println(rss2);
    }
}
