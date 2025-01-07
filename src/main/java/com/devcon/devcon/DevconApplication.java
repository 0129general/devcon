package com.devcon.devcon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevconApplication {
	
	@GetMapping("/hello")
	public String check(){
		return "Hello World";
	}
	public static void main(String[] args) {
		SpringApplication.run(DevconApplication.class, args);
	}

	@GetMapping("/")
	public String home() {
		return new String("Welcome to Tutorialspoint");
	}
	
}
