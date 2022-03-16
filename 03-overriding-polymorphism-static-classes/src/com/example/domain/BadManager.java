package com.example.domain;

public class BadManager extends Employee {

	/**
	 * 
	 * Cannot reduce the visibility 
	 * of the inherited method from Employee
	 * 
	 * @return
	 */
	@Override
	public String getDetails() {
		return super.getDetails() + " Dept: " + deptName;
	}

	@Override
	public String getAllDetails() {
		return super.getAllDetails() + " Dept: " + deptName;
	}

	private String deptName;

	public BadManager(int empId, String name, String ssn, double salary, String deptName) {
		// invoke Employee(empId,name,ssn,salary) constructor
		super(empId, name, ssn, salary);
		this.deptName = deptName;
	}

	public BadManager(int empId, String name, String ssn, double salary) {
		super(empId, name, ssn, salary);
	}

	public String getDeptName() {
		return deptName;
	}
}
