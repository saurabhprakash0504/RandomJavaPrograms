import java.util.ArrayList;
import java.util.List;

public class WildCardExample {

	public static void main(String[] args) {
		List<Double> a=new  ArrayList<>();
		a.add(1.0);
		a.add(4.0);
		a.add(4.4);
		method(a);
	}
	
	static void method(List<? extends Number> a) {
		for(Number s:a) {
			System.out.println(s);
		}
	}
	
}
