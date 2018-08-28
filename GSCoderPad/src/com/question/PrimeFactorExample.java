package com.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PrimeFactorExample {
	
	
	public static void main(String[] args) {
		String[][] input = { { "sobby", "85" }, { "charles", "100" }, { "arush", "37" }, { "tony", "24" },{ "charles", "99" } };
		Map<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();

		ArrayList<Integer> list;
		for (String[] str : input) {
			String name = str[0];
			int val = Integer.parseInt(str[1]);
			if (map.containsKey(name)) {
				list = map.get(name);
				list.add(val);
				map.put(name, list);
			} else {
				list = new ArrayList<Integer>(Arrays.asList(val));
				map.put(name, list);
			}
		}

		int bestAvg = 0;
		for (String name : map.keySet()) {
			list = map.get(name);
			int sum = 0;
			for (Integer val : list) {
				sum += val;
			}
			int avg = sum / list.size();

			if (avg > bestAvg)
				bestAvg = avg;
		}
		System.out.println("Best Grade is: " + bestAvg);
	}
}
