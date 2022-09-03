package org.practice;

public class Employee {
	public void empName() {
		System.out.println("Kavi");
	}
	public void empAge() {
		System.out.println("25");
	}
	public void empId() {
		System.out.println("8520");
	}
	public static void main(String[] args) {
		Employee r= new Employee();
		r.empName();
		r.empAge();
		r.empId();
	}

}
