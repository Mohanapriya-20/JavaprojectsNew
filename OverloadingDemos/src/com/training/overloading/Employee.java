
package com.training.overloading;

public class Employee {
	String name, designation;

	public Employee(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}

	double basicAllowance, carAllowance, houseAllowance;

	public Employee(double basicAllowance) {

		double bonus = 0.20 * (basicAllowance);
		System.out.println("Bonus Amount for the Manager: " + bonus);
	}

	public Employee(double basicAllowance, double carAllowance) {
		double bonus = 0.10 * (basicAllowance + carAllowance);
		System.out.println("Bonus Amount for the programmer: " + bonus);
	}

	public Employee(double basicAllowance, double carAllowance, double houseAllowance) {
		double bonus = 0.8 * (basicAllowance + carAllowance + houseAllowance);
		System.out.println("Bonus Amount for the Director: " + bonus);

	}

	void getDetails() {
		System.out.println("Employee's Name: " + this.name);
		System.out.println("Employee's Designation: " + this.designation);
	}
}
