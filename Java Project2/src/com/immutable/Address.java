package com.immutable;

public class Address {
	String state;
	Integer pincode;
	
	
	
	Address(String s,Integer p){
		state=s;
		pincode=p;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	
}
