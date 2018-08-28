import java.util.ArrayList;

public class ReverseAString {

	public static void main(String[] args) {
		String s="zero one one two three four five six seven eight nine ten ele twelve thiteen";
		String[] ss=s.split(" ");
		int ii=0;
		int j=1;
		//System.out.print (sb.reverse()+ " ");
		
		 ArrayList<Integer> a=new ArrayList<>();
		 a.add(0, 0);
		 
		int k =2;
		while(k<=ss.length) {
			k=ii+j;
			//sb=new StringBuffer(ss[k+1]);
			//System.out.print (sb.reverse()+ " ");
			//System.out.println(k);
			a.add(k);
			ii=j;
			j=k;
		}
		
		
		for(int i=0;i<ss.length-1;i++) {
			if(i==0) {
				StringBuffer sb=new StringBuffer(ss[i]);
				System.out.println  (sb.reverse()+ " ");
			}
			
			else if(a.contains(i) && i!=1 && i!=2) {
				StringBuffer sb=new StringBuffer(ss[i+1]);
				System.out.println  (sb.reverse()+ " ");
			}
			else
				System.out.println(ss[i+1]);
			
		}
	}
	
}
