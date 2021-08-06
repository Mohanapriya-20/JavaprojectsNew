package com.training.service;

import com.training.exception.LaptopNotFoundException;
import com.training.model.Laptop;


public interface LapService {
	Laptop[] getAll();

	Laptop getById(int id) throws LaptopNotFoundException;

	Laptop getBrand(String brand) throws LaptopNotFoundException;

}
