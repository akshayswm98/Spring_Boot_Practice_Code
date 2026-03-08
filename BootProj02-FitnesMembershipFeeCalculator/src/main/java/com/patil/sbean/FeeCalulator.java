package com.patil.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FeeCalulator 
{   
	@Autowired
	MembershipService membershipService;
	
	
	public double calculator(String type, boolean trainer)
	{
		double baseFee = membershipService.getBaseFee(type);
		double trainerFee = membershipService.getTrainerFee(trainer);
		double total = baseFee + trainerFee;
		return total;
	}
	
	public double applyOffer(String type, double total) 
	{

        if (type.equalsIgnoreCase("PREMIUM")) 
        {
            double discount = total * 0.15;
            return  discount;
        }

        return 0; 
    }
	
	public double generateBill(String type, boolean trainer) 
	{

        double total = calculator(type, trainer);
        double offer = applyOffer(type, total);

        return total- offer;
    }
}
