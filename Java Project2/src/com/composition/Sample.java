package com.composition;

public class Sample {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		for (int l = 0; l < a.length; l++) {
			extracted(a, l);
			System.out.println();
		}

	}

	private static void extracted(int[] a, int l) {
		for (int j = 0; j < a.length - l; j++) {
			int index = j;
			while (index <= j + l) {
				System.out.print(a[index] + " ");
				index++;

			}
			System.out.print(",");
		}
	}
}