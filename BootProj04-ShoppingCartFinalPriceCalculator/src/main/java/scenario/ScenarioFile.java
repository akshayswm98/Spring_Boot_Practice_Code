package scenario;

public class ScenarioFile {

}
/*
 
 Scenario 4: Shopping Cart Final Price Calculator
-----------------------------------------------------------

Components
1. DiscountService

Methods:

double getCategoryDiscount(String category)

ELECTRONICS → 10%

GROCERY → 5%

FASHION → 8%

double getFestivalDiscount()

fixed → 5%

2. CartService

Has-A: DiscountService
Methods:

double calculateCategoryPrice(double price, String category)

double applyFestivalOffer(double price)

double calculateTax(double price)

tax = 18%

double checkout(double price, String category)
 */