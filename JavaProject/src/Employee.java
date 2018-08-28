import java.util.Date;

public class Employee implements Comparable<Employee>{

	String name;
	String last;
	
	public Employee(String n,String d) {
		name=n;
		last=d;
	}
	
	@Override
	public int compareTo(Employee o) {
		return this.last.compareTo(o.last);
	}
	
}
