
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class HashMapSyncExample {
    public static void main(String args[]) {
         HashMap<Integer, String> hmap= new HashMap<Integer, String>();
         hmap.put(2, "Anil");
         hmap.put(44, "Ajit");
         hmap.put(1, "Brad");
         hmap.put(4, "Sachin");
         hmap.put(88, "XYZ");

      Map<Integer,String> map= Collections.synchronizedMap(hmap); // fail safe
     /* //    Map map= new HashMap(); // fail safe
         Set set = hmap.entrySet();
    //     synchronized(hmap){
             Iterator i = set.iterator();
             // Display elements
             while(i.hasNext()) {
                Map.Entry<Integer,String> me = (Map.Entry)i.next();
                if(me.getKey()==1)
                	hmap.put(1, "ram");
                System.out.print(me.getKey() + ": ");
                System.out.println(me.getValue());
             }*/
         
         for(Map.Entry<Integer,String> m:map.entrySet()) {
        	 	if(m.getKey()==1)
        	 		hmap.put(1, "sama");
        	 	System.out.println(m.getKey());
        	 	System.out.println(m.getValue());
         }
         
         
         }
    }
//}