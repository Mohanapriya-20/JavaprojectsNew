package com.training.abstraction1;

public class Main {
	public static void main(String[] args) {
		Accessories ref = new Car("Rolls royce", 100000);
		Vehicle v = (Vehicle) ref;
		v.external();
		v.internal();
		v.getDetails();
		v.getMilage();
	}
}
