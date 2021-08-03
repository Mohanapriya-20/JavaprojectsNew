package com.training.overriding;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("------SELECT THE ACCOUNT TYPE C/S------");
		String a = sc.next();
		Bank bank;
		switch (a) {
		case "S":
			bank = new Savings(300);
			Savings ac = (Savings) bank;
			ac.calculateSaving();
            break;
		case "C":
			bank = new Current(500);
			break;
		default:
			bank = new Bank(1000);
			break;

		}

		System.out.println("Enter the Amount to be withdrawn");
		double wd = sc.nextDouble();
		bank.withdraw(wd);
		System.out.println("Balance " + bank.getBalance());
		System.out.println("Enter the Amount to be deposited");
		double dp = sc.nextDouble();
		bank.deposit(dp);
		System.out.println("Balance " + bank.getBalance());
		sc.close();

	}
}
