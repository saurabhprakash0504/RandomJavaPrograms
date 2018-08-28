package com.composition;

public class ThreadLocalExample {

	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		t1.start();
		Thread1 t2=new Thread1();
		t2.start();
	}
	
	
}

class Thread1 extends Thread{
	ThreadLocal threadLocal=new ThreadLocal() {
		protected String initialValue() {
			return "Saurabh value";
		}
};
	public void run() {
		

		System.out.println("value before getting >>> "+threadLocal.get());
		
		threadLocal.set(Math.random());
		
		System.out.println("value gating "+Thread.currentThread().getName() +"<<>>"+threadLocal.get());
	}
	
}
