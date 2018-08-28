import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LRUCacheImpl {

	static HashMap<Character, Integer> map = new HashMap<>();
	static Queue<Character> q = new LinkedList<>();

	static void put(Character c, Integer i) {
		if (map.containsKey(c)) {
			q.remove(c);
			q.offer(c);
		} else if (!map.containsKey(c)) {
			if (q.size() == 3) {
				map.remove(q.poll());
				map.put(c, i);
				q.offer(c);
			} else {
				map.put(c, i);
				q.offer(c);
			}
		}

	}

	static void display() {
		Iterator<Character> i=q.iterator();
		while(i.hasNext()) {
			System.err.println(i.next());
		}
	}
	
	public static void main(String[] args) {
		LRUCacheImpl.put('a', 1);
		LRUCacheImpl.put('b', 2);
		LRUCacheImpl.put('c', 3);
		LRUCacheImpl.display();
		System.out.println();
		LRUCacheImpl.put('d', 4);
		LRUCacheImpl.display();
		System.out.println();
		LRUCacheImpl.put('c', 3);
		LRUCacheImpl.display();
		
	}

}
