import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {

	public static void main(String[] args) {
		CyclicBarrier c = new CyclicBarrier(2);
		Queue<Integer> q = new LinkedList<Integer>();
		new Producer1(c, q).start();
		new Producer2(c, q).start();
		new Consumer1(c,q).start();

	}

}

class Producer1 extends Thread {
	Queue<Integer> q;
	CyclicBarrier c;

	Producer1(CyclicBarrier c, Queue<Integer> q) {
		this.c = c;
		this.q = q;
	}

	public void run() {
		int i = 1;
		while (i <= 10) {

			System.out.println("Producer1");
			q.offer(i);
			i = i + 1;
			/*try {
				c.await();
			} catch (InterruptedException | BrokenBarrierException e) {
				e.printStackTrace();
			}*/
			try {
				this.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			new Producer2(c, q).start();
		}
	}

}

class Producer2 extends Thread {
	Queue<Integer> q;
	CyclicBarrier c;

	Producer2(CyclicBarrier c, Queue<Integer> q) {
		this.c = c;
		this.q = q;
	}

	public void run() {
		int i = 11;
		while (i <= 20) {
			System.out.println("Producer2");
			q.offer(i);
			i = i + 1;
			/*try {
				c.await();
			} catch (InterruptedException | BrokenBarrierException e) {
				e.printStackTrace();
			}*/
			
			try {
				this.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			new Consumer1(c,q).start();
		}
	}

}

class Consumer1 extends Thread {
	Queue<Integer> q;
	CyclicBarrier c;
	Consumer1(CyclicBarrier c,Queue<Integer> q) {
		this.q = q;
		this.c=c;
	}

	public void run() {
		System.out.println("q >>>"+q);
		int i = 1;
		while (i <= 10) {

			int k = q.poll();
			int j = q.poll();

			System.out.println("values >> " + (k + j));
			i = i + 1;
			try {
				this.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			new Producer1(c,q).start();
		}
	}

}
