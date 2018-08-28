import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Pen {
	private int id;
	private String color;

	public Pen(int id, String color) {
		this.id = id;
		this.color = color;
	}

	public static void main(String[] args) {
		Pen p1 = new Pen(1, "Red");
		Pen p2 = new Pen(2, "Blue");
		Pen p3 = new Pen(3, "Green");
		Pen p4 = new Pen(4, "Red");
		Pen p5 = new Pen(5, "Red");
		Pen p6 = new Pen(6, "Blue");
		Pen p7 = new Pen(7, "Red");
		Pen p8 = new Pen(8, "Red");
		Pen p9 = new Pen(9, "Red");
		Pen p10 = new Pen(10, "Green");
		Pen p11 = new Pen(11, "Green");

		HashSet<Pen> hs = new HashSet<Pen>();
		hs.add(p1);
		hs.add(p2);
		hs.add(p3);
		hs.add(p4);
		hs.add(p5);
		hs.add(p6);
		hs.add(p7);
		hs.add(p8);
		hs.add(p9);
		hs.add(p10);
		hs.add(p11);

		System.out.println(hs.size());
		
		HashMap<String,Integer> h=new HashMap<>();	
		Iterator<Pen> i=hs.iterator();
		while(i.hasNext()) {
			Pen o=i.next();
			String coulr=o.color;
			if(h.containsKey(coulr))
				h.put(coulr, h.get(coulr)+1);
			else
				h.put(coulr, 1);
		}
		System.out.println("values >>> "+h);
	}
}