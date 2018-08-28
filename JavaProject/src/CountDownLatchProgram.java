import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchProgram {

	public static void main(String[] args) throws InterruptedException {
		CountDownLatch c = new CountDownLatch(5);
		//Demos d = new Demos(c);

		ExecutorService e = Executors.newFixedThreadPool(3);
		for (int i = 1; i <= 5; i++)
			e.execute(new Demos(c,i));
		c.await();
		System.out.println("done with executing >>>");
	}

}

class Demos extends Thread {
	CountDownLatch c;
	int i;
	Demos(CountDownLatch c,int i) {
		this.c = c;
		this.i=i;
	}

	public void run() {
		System.out.println("i values >> "+i);
		c.countDown();
	}

}