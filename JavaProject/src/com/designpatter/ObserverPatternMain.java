package com.designpatter;

public class ObserverPatternMain {
	public static void main(String[] args) {
		ObserverImpl arpitPerson = new ObserverImpl("Arpit");
		ObserverImpl johnPerson = new ObserverImpl("John");

		SubjectImpl samsungMobile = new SubjectImpl("Samsung", "Mobile", "Not available");

		samsungMobile.registerObserver(arpitPerson);
		samsungMobile.registerObserver(johnPerson);
		samsungMobile.setAvailability("Available");

		samsungMobile.removeObserver(arpitPerson);

		System.out.println("\n\n");

		samsungMobile.setAvailability("UnAvailable");

		
		
	}
}