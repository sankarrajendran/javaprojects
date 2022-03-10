package san.learn.javaprojects.comparable;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {
		Student s1 = new Student(2,"Sankar",18);
		Student s2 = new Student(5,"Ram",20);
		Student s3 = new Student(3,"Naveen",27);
		Student s4 = new Student(6,"Mathi",34);
		Student s5 = new Student(8,"Anu",28);
		/**
		 * If the Student is not Comparable object, then ClassCastException
		 */
//		Set<Student> s = new TreeSet<>();
		/**
		 * STudent object not required to be a Comparable Object.
		 */
		Set<Student> s = new HashSet<>();
		
		s.add(s1);s.add(s2);s.add(s3);s.add(s4);s.add(s5);
		
		System.out.println(s);
	}

}

class Student{
	private int rollNo;
	private String name;
	private int age;
	public Student(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}
	/**
	 * @return the rollNo
	 */
	public int getRollNo() {
		return rollNo;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
