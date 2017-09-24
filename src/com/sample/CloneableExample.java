package com.sample;

class Subject{
	String subject1;
	String subject2;
	
	Subject(String s1,String s2){
		subject1=s1;
		subject2=s2;
	}
}


class Student implements Cloneable{
	String name ;
	Subject subject;
	
	Student(String n, Subject s){
		name =n;
		subject=s;
	}
	
	public void clones(){
		
	}
}


public class CloneableExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
