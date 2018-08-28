import java.io.ObjectOutputStream;
import java.io.*;

class X implements Serializable {
	transient static String transientStaticVar = "transientStaticVar";
	transient final String transientFinalVar = "transientFinalVar";
	transient static final String transientStaticFinalVar = "transientStaticFinalVar";
	transient String transientVar = "transientVar";
}

public class Test1 {
	public static void main(String[] args) {
		try {
			ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("logInfo.out"));
			X a = new X();
			System.out.println("Before Serialization ...");
			System.out.println("transientStaticVar = " + X.transientStaticVar);
			System.out.println("transientFinalVar = " + a.transientFinalVar);
			System.out.println("transientStaticFinalVar = " + X.transientStaticFinalVar);
			System.out.println("transientVar = " + a.transientVar);
			o.writeObject(a);
			o.close();
			X.transientStaticVar = "newTransientStaticVar";
		} catch (Exception e) {
			// deal with exception
		}

		System.out.println("\n\n\n\n");
		
		try {

			ObjectInputStream in = new ObjectInputStream(new FileInputStream("logInfo.out"));
			X x = (X) in.readObject();
			System.out.println("After Serialization ...");
			System.out.println("transientStaticVar = " + X.transientStaticVar);
			System.out.println("transientFinalVar = " + x.transientFinalVar);
			System.out.println("transientStaticFinalVar = " + X.transientStaticFinalVar);
			System.out.println("transientVar = " + x.transientVar);
		} catch (Exception e) {
			// deal with exception
		}

	}

}