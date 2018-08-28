import java.util.HashMap;
import java.util.Map;

public class OldAccountManagerTest {
	private Map<String,Integer> accountTotals = new HashMap<>();
	public int getBalance(String accountName){
		Integer total = accountTotals.get(accountName);
		if(total == null){
			total = Integer.valueOf(0);
		}
		return total.intValue();
	}
	
	public void setBalance(String accountName, int amount){
		accountTotals.put(accountName, amount);
	}
}
