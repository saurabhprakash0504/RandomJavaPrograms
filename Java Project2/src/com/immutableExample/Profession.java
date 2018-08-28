package com.immutableExample;

import com.immutable.Address;
import com.immutable.Student;

public final class Profession {
	final StringBuffer pincode;
	final String address;
	final Employee l;

	Profession( String a,StringBuffer p, Employee l) {
		this.pincode = p;
		this.address = a;
		int age = l.age;
		String name = l.name;
		this.l = new Employee(name, age);
	}

	public StringBuffer getPincode() {
		return pincode;
	}

	public String getAddress() {
		return address;
	}

	public Employee getL() {
		Employee e=this.l;
		int age = e.age;
		String name = e.name;
		return new Employee(name, age);
	}
	
	public static void main(String[] args) {
		Employee a=new Employee("Patna",8008);
		StringBuffer sb=new StringBuffer("prakash");
		Profession s=new Profession("Saurabh",sb,a);
		System.out.println("string buffer before >>> "+s.getL());
		System.out.println("before pincode >> "+s.getAddress());;

		sb.append(" mast admi");
		a.setAge(444);
		s.getAddress();
		
		System.out.println("string buffer after >>> "+s.getL());
		System.out.println("after pincode >> "+s.getAddress());;
		
	
	}
}
