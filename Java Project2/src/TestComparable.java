import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestComparable {

	public static void main(String[] args) {
		HashMap<Student, Integer> h=new HashMap<Student,Integer>();
		//ArrayList<Student> h=new ArrayList<>();
		h.put(new Student("asaurabh",10), 90);
		h.put(new Student("ram",20), 30);
		h.put(new Student("papa",15), 20);
		Set<Student> s=new HashSet<>(h.keySet());
		List hh=new ArrayList<>(s);
		
		Collections.sort(hh);
		
		System.out.println("after sorting >>> ");
		
		Iterator<Student> i=hh.iterator();
		while(i.hasNext()) {
			Student aa=i.next();
			
			System.out.print("name  "+aa.name);
			System.out.print(" >> age " +aa.age);
			System.out.println (" >> value "+h.get(aa));
		}
		
		Collections.sort(hh,new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if(o1.age==o2.age)
				return 0;
				else if(o1.age>o2.age)
					return -1;
				else
					return 1;
			}
		});
		
		System.out.println("\n after age comparing \n");
		
		ArrayList<String> a=new ArrayList<>();
		a.add("saurabh");
		a.add("ram");
		a.add("guitar");
		
		
		Iterator<Student> ii=hh.iterator();
		while(ii.hasNext()) {
			
			
			
			Student aa=ii.next();
			
			System.out.print("name  "+aa.name);
			System.out.print(" >> age " +aa.age);
			System.out.println (" >> value "+h.get(aa));
		}
		
	}
	
}
