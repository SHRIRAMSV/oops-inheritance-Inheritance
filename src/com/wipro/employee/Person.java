package com.wipro.employee;

public class Person {
	private String name;

	public Person() {

	}

	public Person(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

}
