package com.wipro.employee;

public class Employee extends Person {
	private double annualSalary;
	private int year;
	private String insuranceNo;

	public Employee() {

	}

	public Employee(double annualSalary, int year, String insuranceNo) {
		super();
		this.annualSalary = annualSalary;
		this.year = year;
		this.insuranceNo = insuranceNo;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getInsuranceNo() {
		return insuranceNo;
	}

	public void setInsuranceNo(String insuranceNo) {
		this.insuranceNo = insuranceNo;
	}

	@Override
	public String toString() {
		return "Employee [annualSalary=" + annualSalary + ", year=" + year + ", insuranceNo=" + insuranceNo + "]";
	}

}
