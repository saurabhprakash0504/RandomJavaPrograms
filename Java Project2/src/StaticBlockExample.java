
public class StaticBlockExample {
	{
		System.out.println("block");
	}
	
	static {
		System.out.println("static block");
	}
	
	public StaticBlockExample() {
		System.out.println("inside constructoe >>> ");
	}
	
	public static void main(String[] args) {
		StaticBlockExample a=new StaticBlockExample();
		System.out.println("after init");
	}
}
