package san.learn.javaprojects.collections;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class HashMapDemo1 {

	public static void main(String[] args) {
//		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
//		Map<Integer, String> m = new TreeMap<Integer, String>();
		Map<Integer, String> m = new Hashtable<Integer, String>();
		
		Random r = new Random();
		for(int i =0 ; i < 5 ; i ++) {
			int a = r.nextInt();
			System.out.println(a);
			m.put(a, "d"+a);
		}
		System.out.println();
		m.keySet().forEach(System.out::println);
	}

}
