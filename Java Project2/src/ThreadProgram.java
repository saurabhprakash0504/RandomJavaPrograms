import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadProgram {

	public static void main(String[] args) {
		for (int i = 0; i <= 16; i++) {
			ExecutorService e = Executors.newFixedThreadPool(16);
			e.execute(new Threadsss());
		}
	}

}

class Threadsss extends Thread {

	public void run() {
		while (true) {
			System.out.println("Thread Nmae > " + Thread.currentThread().getName());
			try {
				PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
				System.setOut(out);
			} catch (IOException e) {
				e.printStackTrace();
			}

			System.out.println("End ??? " + Thread.currentThread().getName());

		}
	}
}