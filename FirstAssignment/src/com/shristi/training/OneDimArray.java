package com.shristi.training;

import java.util.Scanner;

public class OneDimArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		float avg = 0.0f;
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the array elements");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int m : a) {
			sum += m;
		}
		sc.close();
		System.out.println("Sum" + sum);
		avg = sum / n;
		System.out.println("Average is" + avg);
	}
	
}
