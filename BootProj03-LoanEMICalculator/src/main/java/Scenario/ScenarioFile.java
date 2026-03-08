package Scenario;

public class ScenarioFile {

}
/*
 Scenario 3: Loan EMI Calculator
---------------------------------------

1. InterestService

Methods:

double getRate(String loanType)

Home → 7%

Personal → 11%

Vehicle → 9%

2. LoanCalculator

Has-A: InterestService
Methods:

double calculateMonthlyInterest(double principal, double rate)

(principal * rate) / 12 / 100

double calculateEMI(double principal, int months, String type)

double getProcessingFee(String type)

home → 2000

personal/vehicle → 1000

double generateFinalAmount(double emi, double fee)


 */