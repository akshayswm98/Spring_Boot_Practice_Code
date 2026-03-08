package com.patil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.patil.sbean.Student;
import com.patil.sbean.University;

@SpringBootApplication
public class BootProj07UniversityManagementSystem1Application 
{

	public static void main(String[] args) 
	{
		ApplicationContext ctx = SpringApplication.run(BootProj07UniversityManagementSystem1Application.class, args);
			Student student = ctx.getBean(Student.class);
			
			System.out.println(student);
		}
	}


