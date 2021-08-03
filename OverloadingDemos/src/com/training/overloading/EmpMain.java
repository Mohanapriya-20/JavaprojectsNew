package com.training.overloading;

import java.util.Scanner;

public class EmpMain {

	public static void main(String[] arg) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Employee's name");
		String name = sc.next();
		System.out.println("Enter the Employee's designation");
		String designation = sc.next();

		Employee emp;
		emp = new Employee(name, designation);
		emp.getDetails();

		switch (designation) {
		case "manager":
			emp = new Employee(1000);
			break;

		case "programmer":
			emp = new Employee(1000, 2000);
			break;

		case "director":
			emp = new Employee(1000, 2000, 1000);
			break;
		}

		sc.close();

	}
}
