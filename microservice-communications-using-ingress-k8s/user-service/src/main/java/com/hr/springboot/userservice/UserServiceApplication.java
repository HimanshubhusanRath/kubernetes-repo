package com.hr.springboot.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/user")
public class UserServiceApplication {

	@GetMapping
	public String message()
	{
		return "Hello from User Service";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
