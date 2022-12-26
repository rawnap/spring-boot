package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args)
	{
		System.out.println("Hello world! \nhan bhai kya haal hain");
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

    	com.example.demo.Alien a= context.getBean(com.example.demo.Alien.class);

		a.show();
//		a.show1();
	}

}
