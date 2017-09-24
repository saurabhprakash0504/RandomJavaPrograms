package com.sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListProgram {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(new Integer(1));
		list.add(new Integer(11));
		list.add(new Integer(111));
		list.add(new Integer(1111));
		list.add(new Integer(12));
		list.add(new Integer(123));
		
		Iterator<Integer> i=list.iterator();
		
		while(i.hasNext() ){
			System.out.println("valuees "+i.next());
			//Integer val=(Integer)i.next();
			
			/*if(val==new Integer (12))
				i.remove(val);*/
		}
		
	//	list.remove(new Integer(12));
	/*	
		System.out.println("dsfsfsd");
		
		Iterator i1=list.iterator();
		
		
		while(i1.hasNext() ){
			System.out.println("valueee "+i1.next());
			i1.remove();
		}
		
		
		System.out.println("values s s ");
		
		Iterator i11=list.iterator();
		while(i11.hasNext() ){
			System.out.println("valueees "+i11.next());
		}
	*/	
	}

}
