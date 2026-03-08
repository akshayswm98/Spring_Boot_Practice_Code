package scenario;

public class ScenarioFile {

}
/*
 Develop a Spring Boot application that models the relationship between a Student and a University. The application's configuration properties are stored in an application.properties file, and these values need to be injected into the relevant Spring beans. The system should allow for dynamic configuration and demonstrate dependency injection principles.

Requirements:
Configure the Properties File:
Create an application.properties file
Property Descriptions:

	University Properties:
	name: The name of the university.
	location: The location/city where the university is situated.
	ranking: The national ranking of the university (integer value).

	Student Properties:
	name: The full name of the student.
	age: The age of the student (integer value).
	major: The major or field of study of the student.
	year: The current academic year of the student (e.g., Freshman, Sophomore, Junior, Senior).

Create the University Class:
Define a University class that:
Is annotated with @Component to be managed by Spring.
Includes private fields for name, location, ranking and injects them using Spring’s @Value annotation.

Create the Student Class:
Define a Student class that:
Includes private fields for name, age, major, year and injects them using Spring’s @Value annotation.
Has a dependency on the University bean, injected via constructor injection.

Bootstrapping the Application:
Create a main application class named StudentUniversityApp that: Initializes the Spring Boot application. Retrieves the Student bean from the Spring application context. Prints the student and university details.

Output:
Your program should output the following details when run:

Student [name=Sanjay Singhaniya, age=21, major=Computer Science, year=Junior, university=University [name=Harvard University, location= Cambridge, ranking=3]]



 */