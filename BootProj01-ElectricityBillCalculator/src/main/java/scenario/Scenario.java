package scenario;

public class Scenario {

}
/*
 Scenario 1: Electricity Bill Calculator (Spring Component Based)
--------------------------------------------------------------------------------
Requirement

Create a Spring Boot application to calculate electricity bills for customers.

Components
1. Component: PriceService

Methods:

double calculateUnitCost(int units)

If units ≤ 100 → ₹5/unit

101–200 → ₹7/unit

200 → ₹10/unit

double calculateFixedCharge()

Fixed charge = ₹50

2. Component: BillCalculator

Has-A: PriceService
Methods:

double calculateTotalBill(int units)

total = unitCost + fixedCharge

double calculateDiscount(double total)

If total > 1000 → 10% discount

double generateFinalBill(int units)

final = total − discount
 */