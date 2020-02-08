package com.wipro.onlineassesment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.wipro.onlineassesment")
public class OnlineAssessmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineAssessmentApplication.class, args);
	}

}
