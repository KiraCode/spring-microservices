package com.example.currency_exchange_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
public class CircuitBreakerController {

	@Retry(name = "default", fallbackMethod="hardcodeResponse")
	@CircuitBreaker(name = "default")
	@GetMapping("/simple-api")
	public String simpleApi() {
		String entity = new RestTemplate().getForEntity("http://localhost:8080/", String.class).getBody();
		return entity;
	}
	
	public String hardcodeResponse(Exception ex) {
		return "Hardcoded Response";
	}
}
