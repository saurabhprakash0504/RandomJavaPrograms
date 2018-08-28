import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

	ConcurrentHashMap<Integer, String> h = new ConcurrentHashMap<>();

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> h = new ConcurrentHashMap<>();
		h.put(5, "Saurabh");
		System.out.println("starting");
		new ThreadRead(h).start();
		new ThreadWrite(h).start();
	//	new ThreadRead2(h).start();

	}

}

class ThreadRead extends Thread {
	ConcurrentHashMap<Integer, String> h;

	ThreadRead(ConcurrentHashMap<Integer, String> h) {
		this.h = h;
	}

	public void run() {
		/*
		 * try { Thread.sleep(100); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		int i=1;
		while (i<60) {
			System.out.println("reading");
			System.out.println("value of the name is >>> " + h.get(5));
			i=i+1;
		}
	}
}

class ThreadWrite extends Thread {
	ConcurrentHashMap<Integer, String> h;

	ThreadWrite(ConcurrentHashMap<Integer, String> h) {
		this.h = h;

	}

	public void run() {
		System.out.println("writing");
		h.put(5, "Ram");
	}

}

class ThreadRead2 extends Thread {
	ConcurrentHashMap<Integer, String> h;

	ThreadRead2(ConcurrentHashMap<Integer, String> h) {
		this.h = h;
	}

	public void run() {
		System.out.println("reading2");
		System.out.println("value of the name is >>> " + h.get(5));
	}

}