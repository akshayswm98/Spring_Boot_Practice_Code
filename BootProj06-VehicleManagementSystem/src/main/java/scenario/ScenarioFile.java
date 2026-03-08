package scenario;

public class ScenarioFile {

}
/*
 -----
You are tasked with building a Spring Boot application that models a Motor powered by Fuel. The application's configuration properties are stored in an application.properties file, and these values need to be injected into the relevant Spring beans.

The goal of this application is to:

Load configuration properties from the application.properties file.
Inject these properties into the Fuel and Motor beans.
Display the motor and fuel information by retrieving the Motor bean from the Spring container in the main method.

Configure the Properties File: Add the necessary properties to the application.properties file to define the fuel type, fuel rate, fuel quality, motor type, and motor power.

Create the Fuel Class: Define the Fuel class in such a way that it reads the properties for fuel type, fuel rate, and fuel quality from the application.properties file and injects them using Spring’s @Value annotation. Implement constructors and getter methods as needed.

Create the Motor Class: Define the Motor class to read the motor type and motor power from the application.properties file, using @Value. Ensure it also has a dependency on the Fuel bean, injected using @Autowired.

Bootstrapping the Application: In the MotorTester class, launch the Spring Boot application. Retrieve the Motor bean from the Spring application context and print its details, which should include the motor type, motor power, and the fuel details (as retrieved from the Fuel bean).

Output:
Your program should output the following details when run:

Motor [motorType=automatic, motorPower=3600, fuel=Fuel [fuelType=castrol, fuelRate=1]
 */