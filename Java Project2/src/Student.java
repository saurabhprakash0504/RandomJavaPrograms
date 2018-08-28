
public class Student implements Comparable<Student> {
	String name;
	int age;

	Student(String n, int a) {
		name = n;
		age = a;
	}

	@Override
	public int compareTo(Student o) {
		return o.name.compareTo(this.name);
	}
}
