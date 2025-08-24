package com.example.pwd03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.example.pwd03.repository")
public class Pwd03Application {

	public static void main(String[] args) {
		SpringApplication.run(Pwd03Application.class, args);
	}

}
