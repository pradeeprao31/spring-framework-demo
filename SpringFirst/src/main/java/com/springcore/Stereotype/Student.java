package com.springcore.Stereotype;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("student")// Use the same name as in the test class
@Scope("prototype")
public class Student {

    @Value("pradeep kumar")
    private String studentName;

    @Value("patna")
    private String city;

    @Value("#{ad}") // Inject the list 'ad' defined in the XML
    private List<String> address;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student [studentName=" + studentName + ", city=" + city + ", address=" + address + "]";
    }
}
