package com.restweb.services.helloworldcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(method = RequestMethod.GET, path = "/req-hello-world")
	public String reqSayHelloWorld() {
		return"RequestMapping Hello World!!";
	}
	
	@GetMapping("/get-hello-world")
	public String getSayHelloWorld() {
		return"GeMapping Hello World!!";
	}
}
