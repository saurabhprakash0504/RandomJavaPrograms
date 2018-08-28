import java.util.HashMap;

public class Emp {

	int id;
	String name;
	
	Emp(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
/*		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;*/
		return false;
	}

	public static void main(String[] args) {
		HashMap<Emp,Integer> i=new HashMap<>();
		i.put(new Emp(1,"saurabh"), 1);
		i.put(new Emp(1,"saurabh"), 5);
		i.put(new Emp(2,"rma"), 512);
		
		System.out.println("size >>> "+i.size());
		
		System.out.println("value >>> "+i.get(new Emp(1,"saurabh")));
		
		
	}
}
