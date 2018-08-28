package com.desearlization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.searealIsation.Student;

public class Reader {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis=new FileInputStream("student.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student s=(Student)ois.readObject();
		System.out.println("hello >> "+ s.id + " " +s.name +" "+s.k);
	}
	
}
