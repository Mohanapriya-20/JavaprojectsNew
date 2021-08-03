package com.training.abstraction1;

public abstract class Vehicle extends Accessories {
	String model;
	double price;

	public Vehicle(String model, double price) {
		// TODO Auto-generated constructor stub
		super();
		this.model = model;
		this.price = price;
	}


	abstract void getMilage();

	void getDetails() {
		System.out.println("Model: " + model);
		System.out.println("Price: " + price);
	}

}
