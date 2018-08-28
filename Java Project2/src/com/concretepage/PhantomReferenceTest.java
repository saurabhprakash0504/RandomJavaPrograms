package com.concretepage;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferenceTest {
	public static void main(String... args) {
		ReferenceQueue rq = new ReferenceQueue();
		A a = new A();
		a.s = "hello";
		Reference r = new PhantomReference(a, rq);
		a = null;
		System.gc();
		System.out.println("peek >> "+rq.poll().hashCode());
		Reference ref = (Reference) rq.poll();
		while (ref != null) {
			System.out.println(ref.get());
		}
	}
}

class A {
	String s;
}