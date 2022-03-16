package test;

import com.example.domain.Manager;

public class ManagerTest {

	public static void main(String[] args) {
		Manager mgr = new Manager(151, "Tom", "444-44-4444", 8000,"ADMIN");
		System.out.println("Manager: " + mgr.getAllDetails());
	}

}
