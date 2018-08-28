import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorFramework {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ArrayList<Integer> a = new ArrayList<>(100);
		int i = 1;
		while (i <= 100) {
			a.add(i);
			i = i + 1;
		}

		HashMap<Integer, Future<String>> map = new HashMap<>();

		ExecutorService e = Executors.newFixedThreadPool(10);

		for (int ii = 1; ii <= 100; ii++) {

			map.put(ii, (e.submit(new Sample(ii))));

		}

		for (Map.Entry<Integer, Future<String>> l : map.entrySet()) {
			System.out.print(l.getKey() + " >> ");

			Future<String> o = l.getValue();
			System.out.print(o.get());

			System.out.println(" ");
		}

	}

}

class Sample implements Callable {
	int i;

	Sample(int i) {
		this.i = i;
	}

	public String call() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return Thread.currentThread().getName();
	}
}
