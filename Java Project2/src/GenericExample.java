
public class GenericExample {
	public static <T> void main(String[] args) {
		cgeck("saurabh",1);
	}
	
	static <T> void cgeck(T f ,T k) {
		System.out.println(f);
		System.out.println(k);
		if(f==k)
		System.out.println(true);
		else
			System.out.println(false);
	}

}
