import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityBlockQueue {

	public static void main(String[] args) {
		Queue<Integer> b=new PriorityQueue<>();
		b.offer(1);
		b.offer(10);
		b.offer(4);
		b.offer(6);
		b.offer(1);
		b.offer(5);
		b.offer(9);
		b.offer(2);
	//	b.offer(null);
		
		
		
		Iterator<Integer> i=b.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+ " ");
		}
		System.out.println();
		for(int ii=1;ii<=8;ii++) {
			System.out.print(b.poll()+ " ");
		}
	}
	
}