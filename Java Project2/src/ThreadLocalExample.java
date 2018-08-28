
public class ThreadLocalExample {

	public static void main(String[] args) {
		Demo1 d=new Demo1();
		Demo1 d2=new Demo1();
		d.start();
		d2.start();
	}
	
}

class Demo1 extends Thread{
	
	public void run() {
		ThreadLocal<Double> i=new ThreadLocal<>();
		i.set(5.0);
		for(int k=1;k<=10;k++) {
			System.out.println(Thread.currentThread().getName()+ " >>  "+i.get());
			double kk=i.get();
			i.set(kk+1);;
		}
		
	}
	
}