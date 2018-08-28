import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PutIfAbsentExample {

	public static void main(String[] args) {
		Map<Object, Integer> c = new TreeMap<>();
		c.put(1, 10);
		c.put(4, 40);
		c.put(3, 30);
		c.put(1, 89);
		c.put(5, 30);
		List<Integer> aa = new ArrayList<>();
		for (Map.Entry<Object, Integer> m : c.entrySet()) {
			System.out.print("key >> " + m.getKey());
			System.out.println(" value >> " + m.getValue());
			aa.add(m.getValue());
		}
		LinkedHashMap<Integer, Integer> finalMap = new LinkedHashMap<>();
		Collections.sort(aa);// sort(aa);

		for (Integer a : aa) {
			for (Map.Entry<Object, Integer> m : c.entrySet()) {
				if (m.getValue() == a) {
					finalMap.put((Integer) m.getKey(), a);

				}
			}
		}
		System.out.println();
		for (Map.Entry<Integer, Integer> m : finalMap.entrySet()) {
			System.out.print("key >> " + m.getKey());
			System.out.println(" value >> " + m.getValue());
		}
	}

}