package org.practice;

public class EmployeeDetails extends Employee{
	public void empAge() {
		System.out.println("28");
	}
	public static void main(String[] args) {
		EmployeeDetails b = new EmployeeDetails();
		b.empAge();
		b.empId();
		b.empName();
	}

}
