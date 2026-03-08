package com.patil.sbean;

import org.springframework.stereotype.Component;

@Component

public class MembershipService 
{

 public double getBaseFee(String type) 
 {

     if (type.equalsIgnoreCase("BASIC")) 
     {
         return 500;
     }
     else if (type.equalsIgnoreCase("STANDARD")) 
     {
         return 800;
     }
     else if (type.equalsIgnoreCase("PREMIUM")) 
     {
         return 1200;
     }else {
    	 
    	 return 0;
     }

      
 }

 public double getTrainerFee(boolean personalTrainer) 
 {

     if (personalTrainer) 
     {
         return 600;
     }else {
    	 return 0;
     }

     
 }
}
