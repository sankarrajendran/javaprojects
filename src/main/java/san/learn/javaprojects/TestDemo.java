package san.learn.javaprojects;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class TestDemo {

	public static void main(String[] args) {
		B b = new B();
		System.out.println(!(b instanceof C) && b instanceof B);
		
		TreeSet<Integer> ts = new TreeSet<>();
		
		ts.add(3);
		ts.add(2);
		ts.add(6);
		
		Iterator<Integer> t =  ts.iterator();
		
		List<Integer> l = new LinkedList<>();
		
		l.add(2);
		l.add(5);
		l.add(4);
		l.add(6);
		l.add(8);
		System.out.println(segment(3, l));
		
	}

	public static int segment(int x, List<Integer> space) {
	    // Write your code here
	        TreeSet<Integer> ms = new TreeSet<>();
	        for(int i = 0 ; i < space.size();i++){
	            if(i + x <= space.size()){
	            	int m = 0;
	                for(int j = i ; j < (x + i ) ; j++){
	                   if(j == i) {
	                	   m = space.get(j);
	                   }else {
	                	   if(m > space.get(j)) m = space.get(j);
	                   }
	                }
	                ms.add(m);
	            }
	        }
	        return ms.last();
	    }
	
}


class A{int a;static int c;}
class B extends A{int b;}
class C extends B{}