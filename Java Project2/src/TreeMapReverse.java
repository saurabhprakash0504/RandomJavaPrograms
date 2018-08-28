import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapReverse {

	public static void main(String[] args) {
		TreeMap<Integer,String> h=new TreeMap<>(Collections.reverseOrder());
		h.put(5, "saurabh");
		h.put(3, "My");
		h.put(4, "name is ");
		
		
		for(Map.Entry<Integer,String> m : h.entrySet()) {
			System.out.println(m.getKey() +" >> "+m.getValue());
		}
		
	}
	
}
