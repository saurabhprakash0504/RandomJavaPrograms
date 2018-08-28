import java.util.ArrayList;

public class Combination {

	public static void main(String[] args) {
		String s = "abcd";
		int length=s.length();
		ArrayList<String> arr = new ArrayList<String>();
		double num=Math.pow(2, s.length());
		for (int i = 1; i <= num-1; i++) {
			arr.add(decToBinary(i,length));
		}

		for (int i = 0; i < arr.size(); i++) {
			String string = arr.get(i);
			char[] c = string.toCharArray();
			for (int j = 0; j < s.length(); j++) {
				if (c[j] == '1') {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println(" ");
		}

	}

	static String decToBinary(int n,int len) {
		String s="";
		while(n!=0) {
			int mod=n%2;
			s=mod+s;
			n=n/2;
		}
		int ii=s.length();
		int diff=len-ii;
		for(int i=0;i<diff;i++) {
			s="0"+s;
		}
		return s;
		
		
	}

}
