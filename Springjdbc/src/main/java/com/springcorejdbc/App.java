package com.springcorejdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springcorejdbc.Dao.Studentdao;
import com.springcorejdbc.Dao.entite.Student;

public class App {
    public static void main(String[] args) {
        System.out.println("My program is start........");

        ApplicationContext context = new AnnotationConfigApplicationContext(jdbcConfig.class);

        Studentdao studentdao= (Studentdao) context.getBean("studentdao", Studentdao.class);
        
        Student student= new Student();
        student.setId(45);
        student.setName("Manish");
        student.setCity("India");
        
        int result= studentdao.insert(student);
        System.out.println("Student is added.."+result);
        
//        Student student= new Student();
//        student.setId(32);
//        student.setName("rahul");
//        student.setCity("UAE");
//        
//        int result = studentdao.change(student);
//        
//        System.out.println("Updated database..."+ result);
        
        
//        int deleted = studentdao.delete(1);
//        System.out.println("Deleted rows: " + deleted);
//
////        
//        Student student=  studentdao.getStudent(32);
//        
//        System.out.println(student);
//        
//        
//        
       List<Student> student1= studentdao.getAllStudent();
       
       for(Student s: student1) {
    	   System.out.println(s);
       }
    
        
    }
}
