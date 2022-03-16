package test;

import com.example.domain.Employee;
import com.example.domain.Manager;

public class CastTest01 {

	public static void main(String[] args) {
		Employee e = new Manager(1, "Joan Kern", "012-23-4567", 110_450.54, "Marketing");// upcast

		if (e instanceof Manager) {
			Manager m = (Manager) e;
			m.setDeptName("HR");
			System.out.println(m.getDetails());
		}

	}

}
