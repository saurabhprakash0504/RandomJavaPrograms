
public class SquareRoot {

	public static void main(String[] args) {/*
		int a = 8;
		boolean flag = false;
		if (a > 0) {
			int last = a / 2;
			for (int i = last; i >= 0; i--) {
				if (i * i == a) {
					System.out.println("square root " + i);
					flag = true;
					break;
				}
			}
			if (flag == false)
				System.out.println("No square root ");
		}
	*/
	check(10,10);	
	}

	static void check(int m,int a) {
		if(a<=0) {
			System.out.println("NO values ");
			return ;
		}
		
		else {
			int mid=a/2;
			if((a*a)==m) {
				System.out.println("square >> "+a);;
				//break;
			}
			else if(mid * mid <m)
				check(m,mid+1);
			else
				check(m,mid-1);
		}
	//return mid;
	}

}
