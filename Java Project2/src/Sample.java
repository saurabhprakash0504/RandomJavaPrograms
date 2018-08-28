import java.lang.Thread.UncaughtExceptionHandler;

public class Sample implements UncaughtExceptionHandler{

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		/*System.out.println("Currnet Thread Name "+ t.currentThread().getName());
		System.out.println("wao");
		System.out.printf("hell", "mast");*/
		
		  System.out.printf("An exception has been captured\n");
	      System.out.printf("Thread: %s\n", t.getId());
	      System.out.printf("Exception: %s: %s\n", e.getClass().getName(), e.getMessage());
	      System.out.printf("Stack Trace: \n");
	      e.printStackTrace(System.out);
	      System.out.printf("Thread status: %s\n", t.getState());
	      new Thread(new SampleTest()).start();
	}

}
