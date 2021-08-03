package com.shristi.training;
import java.util.Scanner;
public class ThreeSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter 3 numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a<b && a<c)
		{
			System.out.println("A is smaller");
		}
		else if(b<c)
		{
			System.out.println("B is smaller");
		}
		else
		{
			System.out.println("c is smaller");
		}
		sc.close();
	}

}
