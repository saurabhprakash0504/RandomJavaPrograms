package com.designpatter;

import java.util.ArrayList;

public class SubjectImpl implements Subject {

	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private String productName;
	private String productType;
	String availability;

	public void setAvailability(String availability) {
		this.availability = availability;
		notifyObservers();
	}

	public SubjectImpl(String productName, String productType, String availability) {
		super();
		this.productName = productName;
		this.productType = productType;
		this.availability = availability;
	}

	public void notifyObservers() {
		System.out.println("Notifying to all the subscribers when product became available");
		for (Observer ob : observers) {
			ob.update(this.availability, this.productName, this.productType);
		}
	}

	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
}
