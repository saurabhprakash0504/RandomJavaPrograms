package com.designpatter;

public class ObserverImpl implements Observer {

	String personName;

	public ObserverImpl(String personName) {
		this.personName = personName;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public void update(String availabiliy,String productName,String productType) {

		System.out.println("Hello " + personName + " "+ productName + " "+ productType + " "+ availabiliy + " on flipkart");
	}
}