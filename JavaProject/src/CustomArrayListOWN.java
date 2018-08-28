import java.util.Arrays;

public class CustomArrayListOWN {
	static int intialValue=5;
	static int lens=0;
	static int[]arr =new int[intialValue];
	public static void main(String[] args) {
		add(10);
		add(20);
		add(30);
		add(40);
		add(50);
		print();
		add(60);
		add(70);
		System.out.println("<<<<<<>>>");
		print();
		
		System.out.println(remove(2));;
		
		print();
		
	}
	
	static void add(int a) {
		int len=arr.length;
		if((lens)==intialValue) {
			double val=len+0.75*len;
			int round=(int)val;
			arr=Arrays.copyOf(arr, round);
		}
		arr[lens]=a;
		lens++;
		
	}
	
	static void print() {
		for(int i=0;i<lens;i++) {
			System.out.print("values "+arr[i] +" ");
		}
		System.out.println();
	}
	
/*	static boolean remove(int a) {
		int[] temp=new int[lens+1];
		int temps=Integer.MIN_VALUE;
		for(int i=0;i<lens;i++) {
			if(arr[i]==a) {
				temps=i;
			}
		}
		
		int j=0;
		for(int i=0;i<lens;i++) {
			if(i==temps)
				continue;
			else {
				temp[j]=arr[i];
				j++;
			}
		}
		arr=temp;
		if(temps==Integer.MIN_VALUE)
			return false;
		else {
			lens--;
			return true;
		}
	}*/
	
	public static Object remove(int index) {
        // if index is negative or greater than size of size, we throw
        // Exception.
     if (index < 0 || index >= lens) {
               throw new IndexOutOfBoundsException("Index: " + index + ", Size "
                            + index);
        }

        Object removedElement = arr[index];
        for (int i = index; i < lens- 1; i++) {
               arr[i] = arr[i + 1];
        }
        lens--; // reduce size of ArrayListCustom after removal of element.

        return removedElement;
 }
}
