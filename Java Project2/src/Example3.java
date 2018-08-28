import java.util.Arrays;
import java.util.List;

public class Example3 {

	public static void main(String[] args) {
		List<Integer> a=Arrays.asList(1,2,3,4,5,7,5);
		System.out.println("sum >> "+check(a));
	}
	
	@SuppressWarnings("unchecked")
	static <T> T check(List<T> a) {
		Double sum=0.0;
		for(T b:a) {
			sum=sum+( (Integer) b).doubleValue();
		}
		return (T) sum;
	}
}
