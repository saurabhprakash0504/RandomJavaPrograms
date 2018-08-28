import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap();
		h.put(1, "saurabh");
		h.put(null, null);
		h.put(null, null);
		h.put(2, "saurabha");

		System.out.println("leght" + h.size());
		System.out.println(h.keySet());
		System.out.println(h.values());

		System.out.println("<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>");

		Hashtable<Integer, String> hh = new Hashtable();
		hh.put(1, "saurabh");
	//	hh.put(null, null);
	//	hh.put(null, null);
		hh.put(2, "saurabha");
		//hh.put(3, null);
		//hh.put(33, null);
		

		System.out.println("leght" + hh.size());
		System.out.println(hh.keySet());
		System.out.println(hh.values());
		
		System.out.println("<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>");

		Map<Integer, String> hhh = Collections.synchronizedMap(new HashMap<>());
		hhh.put(1, "saurabh");
	//	hh.put(null, null);
		hhh.put(null, null);
		hhh.put(2, null);
		hhh.put(null, "nulls");
		
		
		hhh.put(2, "saurabha");
		hhh.put(3, null);
		

		System.out.println("leght" + hhh.size());
		System.out.println(hhh.keySet());
		System.out.println(hhh.values());
		
		System.out.println("<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>");

		ConcurrentHashMap<Integer, String> hhhh = new ConcurrentHashMap<>();
		hhhh.put(1, "saurabh");
	//	hh.put(null, null);
	//	hhhh.put(null, "ram");
		hhhh.put(2, "saurabha");
	///	hhhh.put(21, null);
		

		System.out.println("leght" + hhhh.size());
		System.out.println(hhhh.keySet());
		System.out.println(hhhh.values());
		

	}

}
