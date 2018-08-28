import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ExpiryMap<K,V> extends ConcurrentHashMap<K,V>{

	HashMap<K,Long> timeMap=new HashMap<>();
	long cleanTime=1000;
	
	public V put(K key,V value) {
		timeMap.put(key, new Date().getTime());
		V v=super.put(key, value);
		return v;
	}
	
	ExpiryMap(){
		initialize();
	}

	private void initialize() {
		
	}
	
	class CleanUpThread extends Thread{
		
		public void run() {
		
		
			
			while(true) {
				
				long current=new Date().getTime();
				for(Map.Entry<K,Long> i: timeMap.entrySet()) {
					Long time=i.getValue();
					if(current>(time+cleanTime)) {
						remove(i.getKey());
						timeMap.remove(i.getKey());
					}
				}
			}
		}
		
	}
	
}
