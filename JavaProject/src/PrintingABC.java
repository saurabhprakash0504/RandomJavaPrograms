import java.util.concurrent.atomic.AtomicInteger;

public class PrintingABC {

	public static void main(String[] args) {
		AtomicInteger a=new AtomicInteger(0);
		new Producers(a,0,"A").start();
		new Producers(a,1,"B").start();
		new Producers(a,2,"C").start();
	}
	
}

class Producers extends Thread{
	
	AtomicInteger a;int b;String c;
	
	Producers(AtomicInteger a,int b,String c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public void run() {
		while(true) {
			synchronized (a) {
				int val=a.get();
				if(val%3==b) {
					System.out.println("Printing >> "+c +" by thread  >> " +b );
					val=a.getAndIncrement();
					a.notifyAll();
					
				}
				else {
					try {
						a.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		}
	}
}