package com.wipro.employee;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the person");
		String name = sc.next();
		System.out.println("Enter the annual salary of the Employee");
		double annualSalary = sc.nextDouble();
		System.out.println("Enter the year the employee started to work");
		int year = sc.nextInt();
		System.out.println("Enter the national insurance number");
		String insuranceNo = sc.next();
		Person person = new Person(name);
		Employee employee = new Employee(annualSalary, year, insuranceNo);
		System.out.println(person);
		System.out.println(employee);
	}

}
