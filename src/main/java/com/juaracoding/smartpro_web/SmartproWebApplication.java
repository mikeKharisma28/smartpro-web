package com.juaracoding.smartpro_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SmartproWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartproWebApplication.class, args);
	}

}
