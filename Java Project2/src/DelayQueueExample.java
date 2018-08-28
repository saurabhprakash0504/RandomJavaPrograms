import java.util.ArrayList;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;

public class DelayQueueExample {

    public static void main(String[] args) throws InterruptedException {
    	ArrayList<Integer> a=new ArrayList<>();
        DelayQueue queue = new DelayQueue();

        Delayed element1 = new DelayedElement();

        //queue.put(element1);
        
        a.add(5);
        

        Delayed element2 = queue.take();
    }
}