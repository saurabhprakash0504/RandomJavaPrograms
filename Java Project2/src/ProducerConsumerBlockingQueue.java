import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerBlockingQueue {

	public static void main(String[] args) {
		BlockingQueue<Integer> q = new ArrayBlockingQueue<>(2);
		new Producers(q).start();
		new Consumers(q).start();
	}

}

class Producers extends Thread {
	BlockingQueue q;

	Producers(BlockingQueue q) {
		this.q = q;
	}

	public void run() {
		while (true) {
			try {
				System.out.println("producing >>>");
				q.put(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Consumers extends Thread {
	BlockingQueue q;

	Consumers(BlockingQueue q) {
		this.q = q;
	}

	public void run() {
		while (true) {
			try {
				System.out.println("values >> " + q.take());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}