package com.akshay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.akshay.sbeans.DBService;

@SpringBootApplication
@PropertySource("com/akshay/commons/dbconfig.properties")
public class DBConfigLoader {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx = 
				SpringApplication.run(DBConfigLoader.class, args);){
			
		   DBService service = ctx.getBean(DBService.class);
		   System.out.println(service);
		}
	}

}
