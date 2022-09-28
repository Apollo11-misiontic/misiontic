package com.prueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication()
//(exclude = { SecurityAutoConfiguration.class, ManagementWebSecurityAutoConfiguration.class })
//(exclude = { SecurityAutoConfiguration.class })

public class Apollo11Application {

	public static void main(String[] args) {
		SpringApplication.run(Apollo11Application.class, args);
	}

}
