package com.example.universe;

import com.example.domain.Employee;

public class EmployeeTests {

	public static void main(String[] args) {
		// TODO create an instance of a class
		Employee emp = new Employee();
		//legal if the field is public
		//but not good OO practice
		emp.empId = 101;
		
		emp.setEmpId(101);
		emp.setName("John Smith");
		emp.setSsn("011-22-3467");
		emp.setSalary(120345.27);
		
		System.out.println("Employee Id " + emp.getEmpId());
		System.out.println("Employee Name : " + emp.getName());
		System.out.println("Employee SSN : " + emp.getSsn());
		System.out.println("Employee Salary : " + emp.getSalary());
	}

}
