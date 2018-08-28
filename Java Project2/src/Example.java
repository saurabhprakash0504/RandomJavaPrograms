
public class Example {

	public static void main(String[] args) {
		
		Example e=new Example();
		System.out.println("Integr >> "+e.check(1));;
		System.out.println("String >> "+e.check("saurabh"));;
			
		Employee1 e1=new Employee1("sauerabh", 9);
		Employee1 ou=e.check(e1);
		System.out.println("emplyee "+ou.age);
		System.out.println("naem "+ou.name);
		
	}

	<T> T check(T obg) {
		System.out.println("hello >> ");
		return obg;

	}
}
