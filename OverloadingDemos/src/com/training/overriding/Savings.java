package com.training.overriding;

public class Savings extends Bank {
	public Savings(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		System.out.println("Saving Withdarw");
		balance = (balance - amount) * 10;

	}

	@Override
	void deposit(double amount) {
		System.out.println("Saving deposit");
		balance = (balance + amount) * 10;

	}

	public void calculateSaving() {
		// TODO Auto-generated method stub

	}

}