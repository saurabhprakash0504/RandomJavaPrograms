
public class CountingVowel {

	public static void main(String[] args) {
		count(0, "ancre");
		;
	}

	private static void count(int counter, String string) {
		if (string.length() == 0)
			System.out.println("counter >>> " + counter);
		else {
			int last = string.length();
			char c = string.charAt(last - 1);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				counter = counter + 1;
			}
			string = string.substring(0, string.length() - 1);
			count(counter, string);
		}
	}
}
