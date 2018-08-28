package com.composition;

public class StringInternExample {

	public static void main(String[] args) {
		String s1="abc";
		String s=new String("abc");
		String k=s.intern();
		System.out.println(s==k);
	}
	
	
}
