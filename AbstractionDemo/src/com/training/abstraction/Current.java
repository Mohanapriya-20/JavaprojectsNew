package com.training.abstraction;

public class Current extends Bank {

	public Current(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(double amount) {
		System.out.println("Amount after withdrawn from Current");
		// TODO Auto-generated method stub
		balance = (balance - amount) * 10;

	}

	@Override
	void deposit(double amount) {
		System.out.println("Amount after deposit from current");
		balance = (balance - amount) * 10;

	}
}