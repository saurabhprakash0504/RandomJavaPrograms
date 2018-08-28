import java.util.TreeMap;

public class Student implements Comparable{
	
	String name;
	int age;
	
	Student(String n,int a)
	{
		name=n;
		age=a;
	}
	

	public static void main(String[] args) {
		TreeMap<Student,Integer> tr=new TreeMap<>();
		tr.put(new Student("abc",1), 3);
		tr.put(new Student("chb",6), 5);
		tr.put(new Student("bb",3), 1);
		//System.out.println("mao value >>>> "+tr.keySet().na);
		for(Student s:tr.keySet()) {
			System.out.println("valuess ??? "+s.name);
		}
	}



	@Override
	public int compareTo(Object o) {
		Student s=(Student)o;
		return this.name.compareTo(s.name);
	}

}
