package com.searealIsation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Sender {

	public static void main(String[] args) throws IOException {
		Student s=new Student();
		FileOutputStream fos=new FileOutputStream("student.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s);
		System.out.println("done");
		
	}

}
