
public class B extends A{
	
	void display() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		A a=(A)new B();
		a.display();
	}
}
