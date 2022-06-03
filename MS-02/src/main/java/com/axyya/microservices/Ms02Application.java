package com.axyya.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Ms02Application {

	public static void main(String[] args) {
		SpringApplication.run(Ms02Application.class, args);
	}

}
