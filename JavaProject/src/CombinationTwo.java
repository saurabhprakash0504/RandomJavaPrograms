
public class CombinationTwo {

	public static void main(String[] args) {
		String str = "abc";
		double len= Math.pow(2, str.length());
		for (int i = 1; i <len; i++) {
			int j = 1;
			int index = 0;
			while (j < len) {
				if ((j & i) == j) {
					System.out.print(str.charAt(index));
				}
				j = j << 1;
				index++;
			}
			System.out.println();
		}
	}

}
