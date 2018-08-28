import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample extends ConcurrentHashMap {

	public ConcurrentHashMapExample(int i, float d, int j) {
		super(i, d, j);
		
		
	}

	public static void main(String[] args) {
	

		Object o=1;
		SoftReference s=new SoftReference(o);
		System.out.println(s.get());
		
		ConcurrentHashMapExample c = new ConcurrentHashMapExample(1,0.75f,1);
		new Thread() {
			public void run() {
				c.put(1, 4);
				c.put(3, 6);
			}
		}.start();
		;

		new Thread() {
			public void run() {
				c.put(4, 4);
				c.put(34, 46);
			}
		}.start();
		;

		new Thread() {
			public void run() {
				c.put(224, 4);
				c.put(324, 46);
			}
		}.start();
		;
	}

	@Override
	public Object put(Object key, Object value) {
		System.out.println("name put " + Thread.currentThread().getName());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return super.put(key, value);
	}

	@Override
	public Object get(Object key) {
		System.out.println("name get " + Thread.currentThread().getName());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return super.get(key);
	}

}
