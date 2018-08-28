package com.immutableExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sample {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(1);
		a.add(5);
		a.add(3);
		System.out.println("before "+a);
		
		List<Integer> b=Collections.unmodifiableList(a);
		a.add(7);
		a.add(8);
		
		System.out.println("after changing a ?? "+a);
		
		System.out.println("b before chanfind "+b);
		
		b.add(6);
		b.add(90);
		
		System.out.println("b after changinf >> "+b);
		
	}
	
}
