import java.util.ArrayList;

public class finalVariable {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(2);
		a.add(3);
		a.add(1);
		
		System.out.println(a);
		a.add(5);
		System.out.println(a);
		a=new ArrayList<>();
		
		a.add(4);
		
		System.out.println("after >>> "+a);
	}
	
}
