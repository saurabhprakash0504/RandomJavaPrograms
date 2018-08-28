import java.util.HashSet;

public class Dummy {

	public static void main(String[] args) {
		Dummy d=new Dummy();
		d.print(null);
		
		HashSet<Object> h=new HashSet<>();
		h.add(new Integer(1));
		h.add(new Short((short) 1));
		h.add(new Long(1));
		h.add(new String("1"));
		
		System.out.println(h.size());
		System.out.println("value >> "+h);
	}
	
	void print(String s) {
		System.out.println("String ??? "+s);
	}
	
	void print(Object o) {
		System.out.println("Object >>> "+o);
	}
	
	
}
