package Scenario;

public class ScenarioFile {

}
/*
 Scenario 2: Fitness Center Membership Fee Calculator
-------------------------------------------------------------------
Components

1. MembershipService

Methods:

double getBaseFee(String type)

BASIC → 500

STANDARD → 800

PREMIUM → 1200

double getTrainerFee(boolean personalTrainer)

if true → 600 else 0

2. FeeCalculator

Has-A: MembershipService
Methods:

double calculateTotal(String type, boolean trainer)

total = baseFee + trainerFee

double applyOffer(double total)

If type = PREMIUM → 15% off

double generateBill(String type, boolean trainer)




 */