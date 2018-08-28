
public class SampleTest implements Runnable {

	public static void main(String[] args) {
		
		SampleTest t=new SampleTest();
		Thread t1=new Thread(t);
		t1.setUncaughtExceptionHandler(new Sample());
		t1.start();
	}
	
	public void run() {
		System.out.println("before ??? ");
		int[] a=new int[1];
		System.out.println(a[2]);
		System.out.println("before 1??? ");
		System.out.println("before 2??? ");
		System.out.println("before 3??? ");
	}
}
