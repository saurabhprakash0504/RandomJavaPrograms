import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class WeakReferecnceExample {
	public static void main(String[] args) {
		Student s = new Student("saurabh", 2);
		WeakReference<Student> w=new WeakReference<Student>(s);
		System.out.println("before "+ w.get());
		s=null;
		System.gc();
		System.out.println("after "+ w.get());
		/*
		ReferenceQueue<Student> q=new ReferenceQueue<>();
		PhantomReference<Student> ss=new PhantomReference<Student>(s, q);
		System.out.println("before 1 "+ss.get());
		System.out.println("poll " +q.poll());
		System.gc();
		
		System.out.println("after 1 "+ss.get());
		System.out.println("poll ?? " +q.poll());*/
	}
}
