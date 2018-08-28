
public class Dummy2 {

	public static void main(String[] args) {
		Dummy2 d=new Dummy2();
		d.check();
		d.check("saurabh");
	}
	
	private String check() {
		System.out.println("check");
		return "hello";
	}
	
	void check(String s) {
		System.out.println("second check");
	}
	
}
