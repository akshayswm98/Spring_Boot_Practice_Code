package com.patil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.patil.sbeans.BillCalculator;

@SpringBootApplication
public class BootProj01ElectricityBillCalculatorApplication {

	public static void main(String[] args) {
		
		try(ConfigurableApplicationContext ctx = SpringApplication.run(BootProj01ElectricityBillCalculatorApplication.class, args);){
			
			
			BillCalculator billCalculator = ctx.getBean(BillCalculator.class);
			double finalBill = billCalculator.generateFinalBill(1100);
			
			System.out.println("Final Bill is : "+finalBill);
		}catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
