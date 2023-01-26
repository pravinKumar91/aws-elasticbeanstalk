package com.tutorials.aws.examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsElasticbeanstalkApplication {

	@GetMapping("/deploystatus")
	public String deploy(){
		return "Application deployed on AWS elastic beanstalk";
	}

	public static void main(String[] args) {
		SpringApplication.run(AwsElasticbeanstalkApplication.class, args);
	}

}
