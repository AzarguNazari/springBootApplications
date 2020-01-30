package com.example.core;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreApplication.class, args);
	}

	@Bean
	public GroupedOpenApi anotherTestGroup(){
		return GroupedOpenApi.builder().setGroup("Another Test Group").pathsToMatch("/**").build();
	}

	@Bean
	public GroupedOpenApi studentGroup(){
		return GroupedOpenApi.builder().setGroup("Student Test Group").pathsToMatch("/**").build();
	}
}
