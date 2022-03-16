package com.example.domain;

public class Manager extends Employee{

	private String deptName;

	public Manager(int empId,String name,String ssn,double salary,String deptName) {
		//invoke Employee(empId,name,ssn,salary) constructor
		super(empId,name,ssn,salary);
		this.deptName = deptName;
	}
	
	public Manager(int empId,String name,String ssn,double salary) {
		super(empId,name,ssn,salary);
	}
	
	public String getDeptName() {
		return deptName;
	}
}
