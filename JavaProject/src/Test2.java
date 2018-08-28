import java.io.*;

class X implements Serializable {
	transient static String transientStaticVar = "transientStaticVar";
	transient final String transientFinalVar = "transientFinalVar";
	transient static final String transientStaticFinalVar = "transientStaticFinalVar";
	transient String transientVar = "transientVar";
	 static String Static = "Static";
}

public class Test2 {
	public static void main(String[] args) {		

		try {

			ObjectInputStream in = new ObjectInputStream(new FileInputStream("logInfo.out"));
			X x = (X) in.readObject();
			System.out.println("After Serialization ...");
			System.out.println("transientStaticVar = " + X.transientStaticVar);
			System.out.println("transientFinalVar = " + x.transientFinalVar);
			System.out.println("transientStaticFinalVar = " + X.transientStaticFinalVar);
			System.out.println("transientVar = " + x.transientVar);
			System.out.println("transientVar = " + X.Static);
		} catch (Exception e) {
			// deal with exception
		}

	}

}