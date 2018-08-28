import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.*;
public class ConsumerProducerEmaphore {
	static Queue<Integer> q=new LinkedList<>();
	public static void main(String[] args) {
		Semaphore producre = new Semaphore(1);
		Semaphore consumer = new Semaphore(0);
		
		new Producer(producre, consumer).start();
		new Consumer(producre, consumer).start();
	}

}

class Producer extends Thread {

	Semaphore p;
	Semaphore c;

	Producer(Semaphore p, Semaphore c) {
		this.p = p;
		this.c = c;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				p.acquire();
				System.out.println("producing "+i);
				ConsumerProducerEmaphore.q.add(i);
				c.release();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Consumer extends Thread {

	Semaphore p;
	Semaphore c;

	Consumer(Semaphore p, Semaphore c) {
		this.p = p;
		this.c = c;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				c.acquire();
				
				System.out.println("consuming "+ConsumerProducerEmaphore.q.peek());
				ConsumerProducerEmaphore.q.remove(i);
				p.release();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
