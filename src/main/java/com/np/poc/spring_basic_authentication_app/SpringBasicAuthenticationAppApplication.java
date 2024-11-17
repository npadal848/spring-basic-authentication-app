package com.np.poc.spring_basic_authentication_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
public class SpringBasicAuthenticationAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBasicAuthenticationAppApplication.class, args);
	}

}
