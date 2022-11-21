package com.example.POC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PocApplication {

	public static void main(String[] args) {

		SpringApplication.run(PocApplication.class, args);
		System.out.println("Welcome to the Boot...");  //This is the procedure how we can print any statement on the Console window in spring-boot.
	}

}
