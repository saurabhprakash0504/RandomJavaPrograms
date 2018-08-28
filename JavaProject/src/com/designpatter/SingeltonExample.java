package com.designpatter;

public class SingeltonExample {

	private static final SingeltonExample instance=new SingeltonExample();
	private SingeltonExample (){
	}
	
	static SingeltonExample  check() {
		/*if(instance==null)
			instance= new SingeltonExample ();
		*/
		return instance;
	}
	
	public static void main(String[] args) {
		SingeltonExample s=SingeltonExample.check();
		SingeltonExample s2=SingeltonExample.check();
		if(s==s2) {
			System.out.println("single object");
		}
		else
			System.out.println("not single object");
	}
}
