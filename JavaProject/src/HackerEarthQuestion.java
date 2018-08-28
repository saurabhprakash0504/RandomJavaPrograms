import java.util.ArrayList;

public class HackerEarthQuestion {

	public static void main(String[] args) {
		String a = "Saurabh is a good he \"is ok love\" he is rahu \"is ok love is pyaar\" \"Himica is great\"";
		System.out.println("a >> " + a);

		String[] arr = a.split(" ");
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].contains("\""))
				al.add(i);
		}

		int p = 0;
		for (int j = 0; j < arr.length; j++) {
			if (!al.contains(j)) {
				System.out.println(arr[j]);
			} else {
				StringBuilder sb = new StringBuilder();
				for (int m = j; m <= al.get(p + 1); m++) {
					sb.append(arr[m]);
					sb.append(" ");
				}
				String as = sb.toString();
				// System.out.println("as ??? "+as);
				String ss = as.substring(1, as.length() - 2);
				System.out.println(ss);
				j = al.get(p + 1);
				p = p + 2;
			}
		}
	}

}
