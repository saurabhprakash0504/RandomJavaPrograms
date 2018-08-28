
@FunctionalInterface
public interface Car {

	void colour(String name);
	
	static void print() {
		System.out.println("printing");
	}
	
	default void print2() {
		System.out.println("default print2 ??");
	}
	
//	void colour2();
	
}
