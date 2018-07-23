package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		/*On starting spring boot-
		 * Sets up default configuration
		 * Starts spring application context
		 * performs class path scan
		 * starts tomcat server*/
		SpringApplication.run(CourseApiApp.class, args);// It tells to start the application,creates a servlet container and host this application in the container.
	}

}
