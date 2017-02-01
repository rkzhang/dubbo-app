package com.springboot.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class SpringbootBootstrap {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBootstrap.class, args);
	}
}
