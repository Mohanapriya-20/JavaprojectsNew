package com.shristi.training;
import java.util.Scanner;
public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] UserName = new String[] { "Moni", "Virat", "Sam" };
		System.out.println("Enter username to login");
		String name = sc.nextLine();
		for (String n:UserName) {
			if(n.equals(name))
			{
				System.out.println("You are logged in successfully");
				break;
			}
			else
			{
				System.out.println("Invalid username");
			}
		}
		sc.close();}

}
