package com.kappa.kmeans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The Kmeans PP algorithm
 * 
 * @author khalil
 *
 */
@RestController
@EnableAutoConfiguration
public class Application {
	
	@RequestMapping("/status")
	public String status() {
		return "UP";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
