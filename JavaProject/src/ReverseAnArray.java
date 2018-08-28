
public class ReverseAnArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 6, 4 };
		int si = a.length;
		for (int i = 0; i < si / 2; i++) {
			int first = a[i];
			int sec = a[si - 1 - i];
			first = first + sec;
			sec = first - sec;
			first = first - sec;
			a[i] = first;
			a[si - 1 - i] = sec;
		}

		for (int i = 0; i < si; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
