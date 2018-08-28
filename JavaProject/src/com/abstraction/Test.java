package com.abstraction;

public class Test {

	public static void main(String[] args) {
		MarutiA a=new MarutiA();
		a.brakesType();
		a.drive();
		a.left();
		
		System.out.println(">>>>>>>>>>>>>>>>>>");
		
		String s="az";
		s.toLowerCase();
		int len=s.length()-1;
		double value=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			int j=(int)c;
			System.out.println("j ?>> "+97);
			double powe=Math.pow(26.0, len);
			value=value+powe*((j-97)+1);
			len=len-1;
		}
		System.out.println("cvalue >>> "+value);
	}
}
