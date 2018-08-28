
public class LocalClassExample {

	void check() {
		class Sample{
			void age() {
				System.out.println("age ??? ");
			}
		}
		Sample s=new Sample();
		s.age();
	}
	
	public static void main(String[] args) {
		LocalClassExample l=new LocalClassExample();
		l.check();
	}
}
