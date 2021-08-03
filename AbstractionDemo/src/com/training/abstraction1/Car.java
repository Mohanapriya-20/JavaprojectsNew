package com.training.abstraction1;

public class Car  extends Vehicle {
	public Car(String model,double price) {
		   super(model,price);
	   }

		
		void internal() {
			// TODO Auto-generated method stub
			System.out.println("Internal block from car");

		}

		
		void external() {
			// TODO Auto-generated method stub
			System.out.println("Internal block from car");

		}
		void getMilage() {
			System.out.println("Milage = 50km/hr");
		}
		
}
