package san.learn.javaprojects.comparable;

import java.util.Set;
import java.util.TreeSet;

public class ComparableDemoString {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "sankar");
		Employee e2 = new Employee(2, "siva");
		Employee e3 = new Employee(3, "anu");
		Employee e4 = new Employee(4, "soun");
		Employee e5 = new Employee(5, "raj");
		Employee e6 = new Employee(6, "sankar");
		Employee e7 = new Employee(7, "sankar");//If name properties used in compareTo method , then id value is not added though it is new one.
		
		Set<Employee> s = new TreeSet<Employee>();
		
		s.add(e1);s.add(e2);s.add(e3);s.add(e4);s.add(e5);s.add(e6);s.add(e7);
		
		System.out.println(s);
	}

}

class Employee implements Comparable<Employee>{
	private int eID;
	private String name;
	
	
	public Employee(int eID, String name) {
		super();
		this.eID = eID;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Employee [eID=" + eID + ", name=" + name + "]";
	}


	@Override
	public int compareTo(Employee o) {
		int nr = this.name.compareTo(o.name);
		/*if(eID == o.eID && nr == 0)
			return 0;
		else if(nr == 1 && eID >  o.eID)
			return 1;
		else
			return -1;*/
		return nr;
	}
	
	
}


