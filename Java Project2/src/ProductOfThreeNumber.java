
public class ProductOfThreeNumber {

	public static void main(String[] args) {
		int[] a= {-1,-9,8,2,5,4,-8};
		int first=a[0];
		int second=a[0];
		int third=a[0];
		if(a.length<3) {
			System.out.println("Invalid input");
		}
		else {
			for(int i=1;i<a.length;i++) {
				if(a[i]>third && a[i]<second) {
					third=a[i];
				}
				else if(a[i]>second && a[i]<first && a[i]>third) {
					third=second;
					second=a[i];
				}
				else if(a[i]>first) {
					third=second;
					second=first;
					first=a[i];
				}
			}
		}
		System.out.println("values >>> "+(first*second*third));
	}
	
}
