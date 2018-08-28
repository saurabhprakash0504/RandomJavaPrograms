
public class ThreadLocalExample extends Thread{

	public static void main(String[] args) {
		ThreadLocalExample a=new ThreadLocalExample();
		ThreadLocalExample b=new ThreadLocalExample();
		a.start();
		b.start();
	}
	
	public void run() {
		ThreadLocal<Integer> t=new ThreadLocal<>();
		t.set(10);
		for(int i=0;i<t.get();i++) {
			System.out.println("value "+ i + " "+Thread.currentThread().getName());
		}
				
	}
}
