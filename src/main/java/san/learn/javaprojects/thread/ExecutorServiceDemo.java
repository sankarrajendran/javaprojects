package san.learn.javaprojects.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {

	public static void main(String[] args) {
		ExecutorService exe = Executors.newFixedThreadPool(10);
		
		Runnable[] r = new Runnable[1000];
		
		for(int i = 0 ; i < r.length ; i++) {
			r[i] = () -> System.out.println(Thread.currentThread().getName() + " Started : Print the Value of : ");
		}
		
		for (Runnable runnable : r) {
			exe.execute(runnable);
		}
		
		exe.shutdown();
	}
	
}
