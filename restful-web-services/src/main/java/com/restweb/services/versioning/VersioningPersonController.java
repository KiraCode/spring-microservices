package com.restweb.services.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {

	@GetMapping("/v1/person")
	public PersonV1 getFirstVersionofPerson() {
		return new PersonV1("Bob", "CHarlie");
	}
	
	@GetMapping("/v2/person")
	public PersonV2 getSecondVersionofPerson() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
	
	@GetMapping(path = "/person", params = "version=1")
	public PersonV1 getFirstVersionofPersonParamRequest() {
		return new PersonV1("Bob", "Charlie");
	}
	
	@GetMapping(path = "/person", params = "version=2")
	public PersonV2 getSecondVersionofPersonParamRequest() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
	
	@GetMapping(path = "/person/header", headers = "X-API-VERSION=1")
	public PersonV1 getFirstVersionofPersonHeaderRequest() {
		return new PersonV1("Bob", "Charlie");
	}
	
	@GetMapping(path = "/person/header", headers = "X-API-VERSION=2")
	public PersonV2 getSecondVersionofPersonHeaderRequest() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
	
	@GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v1+json")
	public PersonV1 getFirstVersionofPersonAcceptHeader() {
		return new PersonV1("Bob", "Charlie");
	}
	
	@GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v2+json")
	public PersonV2 getSecondVersionofPersonAcceptHeader() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
}
