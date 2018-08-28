package com.composition;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library {

	final List<Books> listOfBooks;
	
	public Library(List<Books> listOfBooks) {
		this.listOfBooks=listOfBooks;
	}
	
	List<String> getAuthorsName(){
		List<String> name=new ArrayList<>();
		Iterator<Books> i=listOfBooks.iterator();
		while(i.hasNext()) {
			Books b=i.next();
			name.add(b.authorName);
					
		}
		return name;
	}
}
