
public class StoppingThread {

	public static void main(String[] args) throws InterruptedException {
		SampleThread s=new SampleThread();
		s.start();
		Thread.sleep(100);
		s.dead();
		
	}

}

class SampleThread extends Thread {

	volatile boolean bstop = false;

	public void run() {
		while (!bstop)
			System.out.println("Running Thread ");
		
			System.out.println("Stopping thread");
	}

	public void dead() {
		bstop = true;
	}

}
