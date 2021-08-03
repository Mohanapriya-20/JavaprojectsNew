package com.training.abstraction1;

public abstract class Vehicle extends Accessories {
	int model, price;

	public Vehicle(int model, int price) {
		super();
		this.model = model;
		this.price = price;
	}

	
	@Override
	void internal() {
		System.out.println("Internal inside vehicle block");

	}

	@Override
	void external() {
		System.out.println("External inside vehicle block");

	}

	abstract void getMilage();

	void getDetails() {
		System.out.println("Model: " + model);
		System.out.println("Price: " + price);
	}

}
