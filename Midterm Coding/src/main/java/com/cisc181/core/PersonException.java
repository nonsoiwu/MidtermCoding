package com.cisc181.core;

public class PersonException extends Exception{

	Person Person;
	
	public PersonException(Person nosreP) {
		this.Person = nosreP;
	}
}
