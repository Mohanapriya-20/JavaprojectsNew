package com.training.client;

import com.training.exception.LaptopNotFoundException;
import com.training.service.LaptopServiceImpl;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LaptopServiceImpl lap = new LaptopServiceImpl();
		System.out.println("------------Laptop Details-----------");
		System.out.println("Enter Brand ID");
		int id = sc.nextInt();
		try {
			lap.getById(id);
			System.out.println("Enter Brand Name");
			try {
				String name = sc.next();
				System.out.println(lap.getBrand(name));

			} catch (LaptopNotFoundException e) {
				System.out.println(e.getMessage());
				System.out.println("Good Bye!!");
			}
		} catch (LaptopNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("Good Bye!!");
		}

	}

}
