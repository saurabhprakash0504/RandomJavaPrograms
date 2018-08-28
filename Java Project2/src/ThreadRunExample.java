
public class ThreadRunExample {

	public static void main(String[] args) {
		Samplea a=new Samplea();
		a.start();
	}
	
}

class Samplea extends Thread{
	
	public void run() {
		System.out.println("Herllo >> "+Thread.currentThread().getName());
	}
}
