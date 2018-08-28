package com.immutable;

final public class Student {

	 final String name;
	 final StringBuffer  sb;
	 final Address address;
	
	Student (String name,StringBuffer sb,Address address){
		this.name=name;
		//this.sb=new StringBuffer(sb);
		this.sb=new StringBuffer(sb);
		Address a=new Address(address.getState(),address.getPincode());
		/*a.setPincode(address.getPincode());
		a.setState(address.getState());*/
		this.address=a;
	}

	public String getName() {
		return name;
	}


	public StringBuffer getSb() {
	//	StringBuffer sb1=new StringBuffer(this.sb);
		return new StringBuffer(sb);
	}

	public Address getAddress() {
		Address add=new Address(this.address.getState(),this.address.getPincode());
	/*	add.setPincode(this.address.getPincode());
		add.setState(this.address.getState());*/
		return add;
	}
	
	
	
}
