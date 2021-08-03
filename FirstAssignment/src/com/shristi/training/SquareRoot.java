package com.shristi.training;
import java.util.Scanner;
public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		int[] a = new int[n];
		double b[]=new double[n];
		int u=0;
		System.out.println("Enter the array elements");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for(int i:a)
		{
			b[u]=Math.sqrt(i);
		}
		for(double j:b)
		{
			System.out.println(j);
		}
		
		sc.close();

	}

}
