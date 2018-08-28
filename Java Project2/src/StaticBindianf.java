import java.util.Collection;
import java.util.HashSet;

public class StaticBindianf extends StaticBindingTest{
	
	  //another overloaded method which takes HashSet argument which is sub class
    public Collection sort(HashSet hs) {
        System.out.println("Inside HashSet sort method");
        return hs;
    }

}
