import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class HashMapS {

	public static void main(String[] args) {
		HashMap<Integer,String> h=new HashMap();
		h.put(1, "saurabh");
		h.put(3, "sas");
		h.put(11, "saurabh");
		h.put(32, "sas");
		Collection<String> s=h.values();
		System.out.println(s);
		//Iterator<Integer> i=s.iterator()
	}
	
}
