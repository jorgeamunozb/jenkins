package jenkins.testdatabuilder;

import jenkins.domain.Person;

public class PersonTestDataBuilder {

	private String name;
	private String lastName;
	
	public PersonTestDataBuilder() {
		this.name = "Ceiba";
		this.lastName = "Software";
	}
	
	public PersonTestDataBuilder withName(String name) {
		this.name = name;
		return this;
	}
	
	public PersonTestDataBuilder withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	
	public Person build() {
		return new Person(this.name, this.lastName);
	}
	
}
