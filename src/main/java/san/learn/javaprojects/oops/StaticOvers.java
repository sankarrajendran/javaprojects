package san.learn.javaprojects.oops;

public class StaticOvers {

	public static void main(String[] args) {
		A.show(2.3f);
	}
	
	public static void main(String args) {
		A.show(2.3f);
	}
	/** Method Overloading is not acceptable for different return type
	public int reInt() {
		return 0;
	}
	
	public String reInt() {
		return "sankar";
	}*/
}


class A{
	public static void show(Number n) {
		System.out.println("In A Number");
	}
	
	public static void show(Integer n) {
		System.out.println("In A Integer");
	}
}

class B extends A{
	public static void show(Integer i) {
		System.out.println("In B");
	}
}