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
		return new PersonV2(new Name("Bob", "CHarlie"));
	}
	
	@GetMapping(path = "person", params = "version=1")
	public PersonV1 getFirstVersionofPersonParamRequest() {
		return new PersonV1("Bob", "Charlie");
	}
	
	@GetMapping(path = "/person", params = "version=2")
	public PersonV2 getSecondVersionofPersonParamRequest() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
}
