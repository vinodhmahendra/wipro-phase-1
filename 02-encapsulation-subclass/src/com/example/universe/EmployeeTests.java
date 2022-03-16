package com.example.universe;

import com.example.domain.Employee;
import com.example.domain.Manager;

public class EmployeeTests {
	public static void main(String[] args) {
		Employee emp =
				new Employee(101,"John Smith","123_11_1212",120_000.00);
//		emp.salary = 140_000.00; error
		
		//create an instance of Manager
		Manager mgr = new Manager(102, "Barbara Jones", "107-99-9078", 109345.67, "Marketing");
		
		mgr.raiseSalary(10000.00);
		
		String dept = mgr.getDeptName();
		System.out.println("Dept Name : "  + dept);
	}

}
