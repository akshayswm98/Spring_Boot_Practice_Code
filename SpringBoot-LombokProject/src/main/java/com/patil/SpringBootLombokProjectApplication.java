package com.patil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.patil.dto.User;

@SpringBootApplication
public class SpringBootLombokProjectApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(SpringBootLombokProjectApplication.class, args);
		
		
		//System.out.println("user id "+user.setId(101));//before @AllArgsCOnstructor
		//System.out.println("user name "+user.setName("Akshay"));
		//System.err.println("user id is "+user.getId());// before @toString
		//System.err.println("User name is "+user.getName());
		
		
		User user = new User(10, "Akshay");
		System.out.println(user);
		
	}

}
