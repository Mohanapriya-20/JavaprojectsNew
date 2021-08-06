package com.training.service;

import com.training.exception.LaptopNotFoundException;
import com.training.model.Laptop;

public class LaptopServiceImpl implements LapService {

	@Override
	public Laptop[] getAll() {
		// TODO Auto-generated method stub
		return allLaptops();
	}

	@Override
	public Laptop getById(int id) throws LaptopNotFoundException {
		boolean flag = false;
		Laptop lap = null;
		for (Laptop laptop : allLaptops()) {
			if (laptop.getBrandid() == (id)) {
				flag = true;
				lap = laptop;
			}
		}
		if (flag == false) {
			throw new LaptopNotFoundException("Invalid Brand Id");
		}
		return lap;
	}

	@Override
	public Laptop getBrand(String brand) throws LaptopNotFoundException {
		boolean flag = false;
		Laptop lapname = null;
		for (Laptop laptop : allLaptops()) {
			if (laptop.getBrandname().equals(brand)) {
				flag = true;
				lapname = laptop;
			}
		}
		if (flag == false) {
			throw new LaptopNotFoundException("Invalid Brand Name");
		}
		return lapname;
	}

	private Laptop[] allLaptops() {
		Laptop[] laptops = new Laptop[6];
		laptops[0] = new Laptop("Hp", 1, 12000, 3);
		laptops[1] = new Laptop("Dell", 2, 15000, 5);
		laptops[2] = new Laptop("Lenavo", 3, 10000, 4);
		laptops[3] = new Laptop("Asus", 4, 18000, 5);
		laptops[4] = new Laptop("Micromax", 5, 20000, 4);
		laptops[5] = new Laptop("MacBook Pro 13", 6, 25000, 5);
		return laptops;

	}

}
