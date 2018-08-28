
public class TestExceptionClass {

	public static void main(String[] args) {
		/*try {
			int a=10/0;
		}catch(SaurabhRntTimeException e) {
			e.printStackTrace();
			throw e;
		}*/
		
		try {
			check();
		} catch (SaurabhRntTimeException e) {
			e.printStackTrace();
		}
	}
	
	static void check() throws SaurabhRntTimeException{
		int a=10/2;
		if(a==5) {
			throw new SaurabhRntTimeException();
		}
	}
	
	
}
