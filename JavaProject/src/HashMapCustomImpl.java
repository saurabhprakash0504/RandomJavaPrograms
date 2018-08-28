
/**
 * @author saupraka
 *
 * @param <K>
 * @param <V>
 */
public class HashMapCustomImpl<K, V> {

	Entry<K, V>[] table;
	int capacity = 4;

	class Entry<K, V> {
		K key;
		V value;
		Entry<K, V> next;

		Entry(K k, V V, Entry e) {
			key = k;
			value = V;
			next = e;
		}

	}

	public HashMapCustomImpl() {
		table = new Entry[4];
	}

	public static void main(String[] args) {
		HashMapCustomImpl<Integer, Integer> h = new HashMapCustomImpl<>();
		h.put(1, 4);
		h.put(2, 5);
		h.put(7, 8);
		h.put(0, 3);
		h.put(7, 10);
		h.put(3, 5);
		h.diplay();
		System.out.println("values>> " + h.get(7));
		h.remove(7);
		h.diplay();
		System.out.println("<<<<<>>>>>>>>");
		h.remove(3);
		h.diplay();
		System.out.println(h.remove(55));

	}

	void put(K key, V value) {
		int hash = hash(key);
		Entry<K, V> temp = new Entry<>(key, value, null);
		Entry<K, V> entryValue = table[hash];
		if (entryValue == null) {
			table[hash] = temp;
		} else {
			Entry<K, V> prev = null;
			Entry<K, V> curr = table[hash];
			while (curr != null) {
				if (curr.key.equals(key)) {
					if (prev == null) {
						temp.next = curr.next;
						table[hash] = temp;
						return;
					} else {
						Entry next = curr.next;
						prev.next = temp;
						temp.next = next;
						return;
					}
				}
				prev = curr;
				curr = curr.next;
			}
			prev.next = temp;
		}
	}

	void diplay() {
		for (int i = 0; i < 4; i++) {
			Entry<K, V> curr = table[i];
			while (curr != null) {
				System.out.print(curr.key + " ");
				System.out.print(curr.value);
				System.out.println();
				curr = curr.next;
			}
		}
	}

	int hash(K key) {
		return (key.hashCode() % capacity);
	}

	Object get(K key) {
		if (key == null)
			return null;
		else {
			int hash = hash(key);
			Entry e = table[hash];
			while (e != null) {
				if (e.key.equals(key))
					return e.value;
				e = e.next;
			}
		}
		return null;

	}

	boolean remove(K key) {
		if (key == null) {
			return false;
		} else {
			int hash = hash(key);
			Entry e = table[hash];
			Entry prev = null;
			Entry curr = table[hash];
			while (curr != null) {
				if (prev == null && curr.next == null) {
					table[hash] = null;
					return true;
				} else if (curr.key == key && prev!=null) {
					prev.next = curr.next;
					return true;
				}else if (curr.key == key && prev==null) {
					table[hash] = curr.next;
					return true;
				}
				prev = curr;
				curr = curr.next;
			}

		}

		return false;
	}
}