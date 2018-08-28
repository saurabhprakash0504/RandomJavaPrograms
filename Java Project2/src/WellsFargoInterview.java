
public class WellsFargoInterview {

	public static void main(String[] args) {
		int[] a= {2 , 3, 4, 5, 6};
		int[] b=new int[a.length];
		for(int i=0;i<a.length;i++) {
			if(i==0) {
				b[i]=a[0]*a[i+1];
			}
			else if(i==a.length-1) {
				b[i]=a[a.length-1]*a[a.length-2];
			}
			else {
				b[i]=a[i-1]*a[i+1];
			}
		}
		
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}
	
}
