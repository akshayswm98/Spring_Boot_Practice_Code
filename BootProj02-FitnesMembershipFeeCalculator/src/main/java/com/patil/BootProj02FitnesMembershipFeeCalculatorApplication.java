package com.patil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.patil.sbean.FeeCalulator;

@SpringBootApplication
public class BootProj02FitnesMembershipFeeCalculatorApplication {

	public static void main(String[] args) {
		
		try(ConfigurableApplicationContext ctx = SpringApplication.run(BootProj02FitnesMembershipFeeCalculatorApplication.class, args);){
				
			FeeCalulator feeCalulator = ctx.getBean(FeeCalulator.class);
			double bill = feeCalulator.generateBill("premium", true);
			System.out.println("Final bill : "+bill);
		}catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
