package san.learn.javaprojects.collections;

import java.util.Arrays;
import java.util.List;

public class SpliteratorDemo {

	public static void main(String[] args) {
		List<A> l = Arrays.asList(new A(),new A(),new A(),new A(),new A(),new A(),new A());
		l.spliterator().forEachRemaining(System.out::println);
	}

}

class A{
	@Override
	public String toString() {
		return A.class.getName() + " : "+Thread.currentThread().getName();
	}
}
