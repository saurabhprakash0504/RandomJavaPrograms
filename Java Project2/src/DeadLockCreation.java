import java.util.ArrayList;
import java.util.Iterator;

public class DeadLockCreation {

	static String s1="UNIX";
	static String s2="JAVA";
	
	public static void main(String[] args) {
		new Producer(s1,s2).start();
		new Consumer(s1,s2).start();
	}

}

class Producer extends Thread {
	String s1;
	String s2;

	Producer(String s1,String s2) {
		this.s1 = s1;
		this.s2=s2;

	}

	public void run() {
		while (true) {
			synchronized (s1) {
				synchronized (s2) {
					System.out.println("Producer >>>"+s1+s2);
				}
			}
		}
	}

}

class Consumer extends Thread {
	String s1;
	String s2;

	Consumer(String s1,String s2) {
		this.s1 = s1;
		this.s2=s2;

	}

	public void run() {
		while (true) {
			synchronized (s2) {
				synchronized (s1) {
					System.out.println(" comusmer " +s2+s1);
				}
			}
		}
	}

}
