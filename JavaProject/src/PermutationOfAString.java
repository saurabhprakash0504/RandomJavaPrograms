
public class PermutationOfAString {

	public static void main(String[] args) {
		String a = "abc";
		permutation(" ",a);

	}

	public static void permutation(String prefix, String n) {
		int len = n.length();
		if (len == 0) {
			System.out.print(prefix);
		} else {
			for (int i = 0; i < len; i++) {
				 permutation(prefix + n.charAt(i), n.substring(0, i) + n.substring(i + 1, len));
			}
		}
	}

}
