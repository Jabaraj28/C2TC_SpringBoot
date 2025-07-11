package com.tnsif.DI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext var = SpringApplication.run(DiApplication.class, args);
	   
	    
	    Customer3 c3 = var.getBean(Customer3.class);
	    c3.show();
	}
}
