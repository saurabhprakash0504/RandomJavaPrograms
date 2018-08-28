import java.util.Iterator;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		TreeSet<Employee> e=new TreeSet<>();
		e.add(new Employee("saurabh","sam"));
		e.add(new Employee("akash","aka"));
		e.add(new Employee("ram","ra"));
		e.add(new Employee("pavan","pa"));
		e.add(new Employee("himica","hi"));
		
		
		Iterator<Employee> i=e.iterator();
		while(i.hasNext()) {
			Employee e1=i.next();
			System.out.print(e1.name+" "+e1.last);
			System.out.println();
		}
	}
	
}
