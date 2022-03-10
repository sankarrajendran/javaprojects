package san.learn.javaprojects.oops.inheritance;

public class OOPSDemo {

	public static void main(String[] args) {
		C c = new C();
		c.callCollect();
	}

}
class A{
	public void collect() {
		System.out.println("A Collect");
	}
}
class B extends A{
	public void collect() {
		System.out.println("B Collect");
	}
}
class C extends B{
	public void callCollect() {
		collect();
	}
}