package com.training.overriding;

public class Bank {
	double balance;

	public Bank(double balance) {

		this.balance = balance;
	}

	void withdraw(double wd) {

		balance -= wd;
	}

	void deposit(double dp) {

		balance += dp;
	}

	double getBalance() {
		return balance;
	}

}
