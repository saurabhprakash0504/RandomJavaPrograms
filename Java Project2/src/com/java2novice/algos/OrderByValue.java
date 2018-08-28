package com.java2novice.algos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class OrderByValue {
	
	final int i;
	
	OrderByValue(){
		i=10;
	}

	public static void main(String a[]) {
		OrderByValue o=new OrderByValue();
		System.out.println(o.i);
		Map<Integer, Integer> c = new HashMap<Integer, Integer>();
		c.put(1, 10);
		c.put(4, 40);
		c.put(3, 30);
		c.put(1, 89);
		c.put(5, 30);
		Set<Entry<Integer, Integer>> set = c.entrySet();
		List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(set);
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});
		for (Map.Entry<Integer, Integer> entry : list) {
			System.out.println(entry.getKey() + " ==== " + entry.getValue());
		}
	}
}