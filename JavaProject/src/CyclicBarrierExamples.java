import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierExamples {


	public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
		CyclicBarrier c = new CyclicBarrier(5);
		//Demos d = new Demos(c);

		ExecutorService e = Executors.newFixedThreadPool(4);
		for (int i = 1; i <= 5; i++)
			e.execute(new Demoss(c,i));
		c.await();
		System.out.println("done with executing >>>");
	}

}

class Demoss extends Thread {
	CyclicBarrier c;
	int i;
	Demoss(CyclicBarrier c,int i) {
		this.c = c;
		this.i=i;
	}

	public void run() {
		System.out.println("i values >> "+i + "  >> "+Thread.currentThread().getName());
		try {
			c.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
	}

}