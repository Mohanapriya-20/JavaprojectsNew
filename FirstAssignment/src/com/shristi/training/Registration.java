package com.shristi.training;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean check = false;
		String[] UserName = new String[] { "Moni", "Virat", "Sam" };
		System.out.println("Enter name to register");
		String name = sc.nextLine();
		sc.close();
		for (String n:UserName) {
			if (name.equals(n)) {
				check=true;
			} 
		}
		if(check!= true)
		{
			System.out.println("registered successfully");
		}
		else
			System.out.println("pls enter unique name");

	}
	

}
