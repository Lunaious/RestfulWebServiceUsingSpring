package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // A convenience annotation that adds all of the following:
//	1) @Configuration: Tags a class as a source of bean definitions for the application context
//	2) @EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings, other beans, or various property settings
//	3) @ComponentScan: Tells spring to look for other components, configurations, and services
public class RestserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestserviceApplication.class, args); // main() uses spring boot's SpringApplication.run() method to launch an application
	}// Notice theres no use of xml or even a web.xml file. The web application we've build is 100% java

}// A jar file is our program packaged up with all of its dependencies etc thus making it easy to ship, version, and deploy the service for someone else to use
		//To run our application if using Gradle: ./gradlew bootRun
		//To first build a Jar file of our project and then run that Jar file if using GRADLE 1) ./gradlew build 2) java -jar build/libs/gs-rest-service-0.1.0.jar

		//To run our application if using Maven: .mvnw spring-boot:run
		//To first build a jar file of our project and then run that Jar file if using MAVEN: 1) ./mvnw clean package 2) java -jar target/gs-rest-service-0.1.0.jar