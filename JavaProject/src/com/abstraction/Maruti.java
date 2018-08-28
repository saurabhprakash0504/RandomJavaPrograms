package com.abstraction;

public abstract class Maruti extends Vehicle{

	@Override
	void drive() {
		System.out.println("Drive");
	}

	@Override
	abstract void left();
	
}
