package san.learn.javaprojects.thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class VolatileDemo {

	public static void main(String[] args) {
		checkString();
	}

	public static String checkString() {
		String s = "aabc";
		Map<Character, Integer> m = new TreeMap<>();
		int i = 0;
		do {
			char c = s.charAt(i);
			if(!m.containsKey(c)) {
				m.put(c, 1);
			}else {
				int n = m.get(c);
				m.put(c ,++n);
			}
			i++;
		}while(i < s.length());
		
		List<Integer> l = new ArrayList<>();
		
		m.keySet().forEach(k -> {
			int v = m.get(k);
			if(!l.contains(v))l.add(v);
			
		});
		if(l.size() > 2) return "NO";
	
		int a = l.get(0);
		int b = l.get(1);
		if(a == b) return "YES";
		else if(a > b && --a == b)
			return "YES";
		else 
			if(--b == a) return "YES";
		
		return "NO";
	}
	
}

class A{
	int a;
	int b;
}
