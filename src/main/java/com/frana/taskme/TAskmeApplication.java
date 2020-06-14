package com.frana.taskme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.frana.taskme"})//to scan repository files
@EntityScan(basePackages = {"com.frana.taskme"})
public class TAskmeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TAskmeApplication.class, args);
	}

}
