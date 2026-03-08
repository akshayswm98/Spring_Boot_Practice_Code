package com.patil.sbean;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("${student.name}")
    private String name;

    @Value("${student.age}")
    private int age;

    @Value("${student.major}")
    private String major;

    @Value("${student.year}")
    private String year;

	private University university;

   

    // Constructor Injection
    public Student(University university) {
        this.university = university;
   
    }

    @Override
    public String toString() {
        return "Student [name=" + name
                + ", age=" + age
                + ", major=" + major
                + ", year=" + year
                + ", university=" + university + "]";
    }
}