
public class ExcelSheetQuestionPuzzle {

	public static void main(String[] args) {
		String a1 = "AAC";
		StringBuffer as=new StringBuffer(a1);
		String a=as.reverse().toString();
		double sum = 0;
		for (int i = a.length() - 1; i >= 0; i--) {
			char c = a.charAt(i);
			int val = (int) c-64;
			Double d;
			if (i >= 1) {
				d = Math.pow(26,i);
			}
			else
				d = 1.0;
			sum = sum + (d * val );
		}
		System.out.println("sum value >>> " + sum);
	}

}
