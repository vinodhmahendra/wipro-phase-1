package test;

import com.example.domain.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee(121, "Ron", "111-11-1111", 5000);
		System.out.println("Employee 1: " + emp1.getDetails());
		
//		Employee emp2 = new Employee(122, "Ken", "222-22-2222", 6000);
		Employee emp2 = new Employee(121, "Ron", "111-11-1111", 5000);
		System.out.println("Employee 1: " + emp2.getDetails());
		
		System.out.println(emp1);
		
		
		if ( emp1.equals(emp2) ) {
			System.out.println("employee objects are equal");
		}else {
			System.out.println("employee objects are not equal!");
		}
	}

}
