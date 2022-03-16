package com.example.domain;

public class Employee {
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((ssn == null) ? 0 : ssn.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		if (ssn == null) {
			if (other.ssn != null)
				return false;
		} else if (!ssn.equals(other.ssn))
			return false;
		return true;
	}

	public String toString() {
		return " Employee id: " + empId + "\n"+
				"Employee name: " + name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public String getDetails() {
		return "ID: " + empId+ " Name: " + name;
	}

	public  String getAllDetails() {
		return "ID: " + empId + " Name: " + name
				+ " SSN: " +ssn +" Salary: " +salary;
	}
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
