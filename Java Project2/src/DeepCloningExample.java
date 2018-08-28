
public class DeepCloningExample {

	public static void main(String[] args) {
		Course1 c=new Course1("maths", "physcics");
		Student1 s1=new Student1("sauarbh",2,c);
		Student1 s22=null;
		try {
			s22=(Student1)s1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println("course >> "+s1.c.subject1);
		
		s22.c.subject1="Hindi";
		
		System.out.println("course ooo >> "+s1.c.subject1);
	}
	
}


class Course1 implements Cloneable{
	
	String subject1;
	String subject2;
	
	Course1(String sub,String sub2){
		subject1=sub;
		subject2=sub2;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
}


class Student1 implements Cloneable{
	String name;
	int age;
	Course1 c;
	
	Student1(String n,int a,Course1 c){
		name=n;
		age=a;
		this.c=c;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		Student1 s=(Student1) super.clone();
		s.c=(Course1)c.clone();
		return s;
	}
}