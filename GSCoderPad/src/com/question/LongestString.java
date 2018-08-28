package com.question;

import java.util.*;

public class LongestString {

	public static void main(String[] args) {
		int[] a = { 1, 34, 3, 98, 9, 76, 45, 4 };
		System.out.println(getBiggestNumber(a));
	}

	private static String getBiggestNumber(int[] input) {
		ArrayList<String> list = new ArrayList<String>();
		String number = "";
		for (int num : input) {
			list.add(String.valueOf(num));
		}
		Collections.sort(list, new NumberComparator());

		for (String str : list) {
			number += str;
		}
		return number;
	}

}

class NumberComparator implements Comparator<String> {
	public int compare(String i1, String i2) {
		String orig = i1 + "" + i2;
		String reverse = i2 + "" + i1;
		return orig.compareTo(reverse);
	}
}
