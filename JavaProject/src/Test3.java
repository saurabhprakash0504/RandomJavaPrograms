import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test3 {
public static void main(String[] args) {
	try {
		ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("logInfo.out"));
		X a = new X();
		/*a.transientStaticVar="saurabh";
		a.transientVar="transientVar";
		
		System.out.println("Before Serialization ...");
		System.out.println("transientStaticVar = " + X.transientStaticVar);
		System.out.println("transientFinalVar = " + a.transientFinalVar);
		System.out.println("transientStaticFinalVar = " + X.transientStaticFinalVar);
		System.out.println("transientVar = " + a.transientVar);
		System.out.println("transientVar = " + X.Static);*/
		o.writeObject(a);
		o.close();
		//
		//X.transientStaticVar = "newTransientStaticVar";
	} catch (Exception e) {
		// deal with exception
	}
}
}
