package com.example.domain;

public class Employee {

	// to encapsulate the data , make the fields private
	private int empId;
	private String name;
	private String ssn;
	private double salary;

	public Employee(int empId, String name, String ssn, double salary) {
		this.empId = empId;
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
	}
//	public Employee() {
//		
//	}

	public void changeName(String newName) {
		if (newName != null) {
			this.name = newName;
		}
	}

	public void raiseSalary(double increase) {
		this.salary += increase;
	}
}
