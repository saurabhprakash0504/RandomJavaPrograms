import java.util.ArrayList;
import java.util.Collections;

public class CarImpl implements Car{

	public static void main(String[] args) {
		CarImpl cc=new CarImpl();
		cc.colour("white");
		cc.print2();
		Car.print();
		ArrayList a=new ArrayList<>();
		a.add(1);
		a.add(5);
		a.add(4);
		a.add(3);
		Collections.swap(a, 0, 3);
		System.out.println("max >> "+Collections.max(a)
		);;
		//reverse(a);
		System.out.println(a);
	}

	@Override
	public void colour(String name) {
		System.out.println("colur >> " +name);
	}
	
}
