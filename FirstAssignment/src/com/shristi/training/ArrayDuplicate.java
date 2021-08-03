package com.shristi.training;

public class ArrayDuplicate {
	public static void main(String[] args) {
		int[] a = new int[] { 10, 20, 30, 40, 50, 60, 10, 10 };
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if (count > 0) {
				System.out.println("Duplicate Array Count: " + count);
				break;
			} else {
				System.out.println("No Duplicates");
			}

		}
	}
}
