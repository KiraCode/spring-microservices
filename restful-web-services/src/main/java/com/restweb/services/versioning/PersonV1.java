package com.restweb.services.versioning;

public class PersonV1 {

	private String firstName;
	private String lastname;

	public PersonV1(String firstName, String lastname) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "PersonV1 [firstName=" + firstName + ", lastname=" + lastname + "]";
	}

}
