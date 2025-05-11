package com.springcorejdbc.Dao;

import java.util.*;
import com.springcorejdbc.Dao.entite.Student;

public interface Studentdao {
    int insert(Student student);
    int change(Student student);
    int delete(int studentId);
    
    Student getStudent(int studentId);
    
    List<Student> getAllStudent();
    
    
    
}
