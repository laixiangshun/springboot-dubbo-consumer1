package com.rainbow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:consumers.xml"})
public class SpringbootDubboLearningConsumer1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDubboLearningConsumer1Application.class, args);
	}
}
