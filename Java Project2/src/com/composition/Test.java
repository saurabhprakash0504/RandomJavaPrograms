package com.composition;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Books b=new Books("Maths", "RS AGARWAL");
		Books b2=new Books("Phuscics","NCERT");
		ArrayList<Books> a=new ArrayList<>();
		a.add(b);
		a.add(b2);
		Library l=new Library(a);
		List<String>ll=l.getAuthorsName();
		System.out.println(ll);
	}
	
}
