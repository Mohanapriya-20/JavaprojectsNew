package com.training.abstraction;

public class Savings extends Bank {

	public Savings(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(double amount) {
		System.out.println("Amount after withdrawn from Savings");
		balance = balance-amount;

	}

	@Override
	void deposit(double amount) {
		System.out.println("Amount after deposit from Savings");

		balance =balance+amount;

	}

	public void calculateSaving() {
		System.out.println("From Saving block");
		
	}

}
