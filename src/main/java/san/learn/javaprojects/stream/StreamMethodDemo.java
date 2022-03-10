package san.learn.javaprojects.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamMethodDemo {

	public static void main(String[] args) {
		List<Integer> lA = Arrays.asList(1,2,3,4,5,6);
		printEvenNum(lA);
	}
	
	public static void printEvenNum(List<Integer> l) {
		l.stream().filter(StreamMethodDemo::evenNum).forEach(System.out::println);
	}

	public static boolean evenNum(int in) {
		return in % 2 ==0;
	}
	
	public void process() {
	
		Thread t1 = new Thread();
		
		
	}
	
	public void threadProcess() {
		System.out.println(Thread.currentThread().getName()+" Processed.s");
	}
	
}

