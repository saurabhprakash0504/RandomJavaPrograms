import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LRUCacheImpl {
	static HashMap<Character, Integer> h = new HashMap<Character, Integer>();
	static Queue<Character> q = new LinkedList<>();

	public static void main(String[] args) {

		add('a', 1);
		add('b', 2);
		add('c', 3);
		print();
		remove('a');
		print();
		add('d', 4);
		print();
		add('c', 3);
		print();
	}

	private static void remove(char c) {
		q.remove(c);
		h.remove(c);
	}

	private static void print() {
		//System.out.println(q);
		Iterator<Character> i=q.iterator();
		while(i.hasNext()){
			System.out.print(i.next()+" ");
		}
		System.out.println();
	}

	private static void add(char c, Integer a) {
		if (h.containsKey(c)) {
			q.remove(c);
			q.offer(c);
		} else {
			if (q.size() > 3) {
				Character cs = q.poll();
				h.remove(cs);
			}
			q.offer(c);
			h.put(c, a);
		}
	}

}
