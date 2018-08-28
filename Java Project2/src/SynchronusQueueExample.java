import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class SynchronusQueueExample {

	public static void main(String[] args) {
		SynchronousQueue q=new SynchronousQueue();
		new Producerssss(q).start();
		new Consumerssss(q).start();
	}
	
}

class Producerssss extends Thread{
	SynchronousQueue q;
	Producerssss(SynchronousQueue q){
		this.q=q;
	}
	
	public void run() {
		while(true) {
			try {
				q.put(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}



class Consumerssss extends Thread{
	SynchronousQueue q;
	Consumerssss(SynchronousQueue q){
		this.q=q;
	}
	
	public void run() {
		while(true) {
			try {
				System.out.println("taking >> "+q.take());;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}