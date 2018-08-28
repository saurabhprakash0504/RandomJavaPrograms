import java.util.HashSet;

public class FirstRepeating {

	public static void main(String[] args) {
		int[] a = { 2, 4, 6, 4, 7, 6, 8, 9 };
		HashSet<Integer> h = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			if (false == h.add(a[i])) {
				System.out.println("values >> " + a[i]);
				break;
			}
		}
	}

}
