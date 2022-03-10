package san.learn.javaprojects.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ComparableDemo {
	
	static Set<Age> s;
	static List<Age> l;
	
	static {
		s = new HashSet<>();//If Age class is not implemented the Comparable interface , we will get ClassCastException while add the element.
		
		s.add(new Age(3));
		s.add(new Age(1));
		s.add(new Age(4));
		s.add(new Age(7));
		s.add(new Age(5));
		s.add(new Age(8));
		s.add(new Age(3));
		
		l = new ArrayList<>();
		
		l.add(new Age(3));
		l.add(new Age(1));
		l.add(new Age(4));
		l.add(new Age(7));
		l.add(new Age(5));
		l.add(new Age(8));
		l.add(new Age(3));
	}
	

	public static void main(String[] args) {
		ageInSet();
	}

	public static void ageInSet() {
		s.forEach(System.out::println);
		System.out.println("******************");
//		l.forEach(System.out::println);
//		System.out.println("*********Calling collection Sorting*********");
//		Collections.sort(l);
//		l.forEach(System.out::println);
		
		
	}
	
}

class Age implements Comparable<Age>{

	private int age;
	
	public Age(int age) {
		this.age = age;
	}
	
	@Override
	public int compareTo(Age o) {
		Age a = (Age)o;
		if(this.age == a.age)
			return 0;
		//If return positive value for greater than condition,  ascending order
		/*else if(this.age > a.age)
			return 1;*/
		// If return positive value for less than,  descending order
		else if(this.age > a.age)
			return 1;
		else
			return -1;
	}

	@Override
	public int hashCode() {
		return 3 * age
	}
	
	 @Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		 Age a = (Age)obj;
		 if(a.age == this.age)
			 return true;
		 return false;
	}
	
	@Override
	public String toString() {
		return "Age [age=" + age + "]";
	}

}