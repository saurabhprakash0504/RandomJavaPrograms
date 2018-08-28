package com.immutable;

public class Test {

	public static void main(String[] args) {
		Address a=new Address("Patna",8008);
		StringBuffer sb=new StringBuffer("prakash");
		Student s=new Student("Saurabh",sb,a);
		System.out.println("string buffer before >>> "+s.getSb());
		System.out.println("before pincode >> "+s.getAddress().getPincode());;

		sb.append(" mast admi");
		a.setPincode(444);
		s.getAddress().setPincode(7878);
		
		System.out.println("string buffer after >>> "+s.getSb());
		System.out.println("after pincode >> "+s.getAddress().getPincode());;
		
	
	}
	
}
