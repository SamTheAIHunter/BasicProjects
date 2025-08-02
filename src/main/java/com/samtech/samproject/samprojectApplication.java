package com.samtech.samproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class samprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(samprojectApplication.class, args);
	}

}
