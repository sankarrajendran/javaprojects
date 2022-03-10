package san.learn.javaprojects.coding;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class DuplicateCharInString {

	public static void main(String[] args) {
		String s = "ssankasr";
		Map<Character, Integer> m = new TreeMap<Character, Integer>();
		for(int i =0; i < s.length();i++) {
//			System.out.println(s.charAt(i));
			char c  = s.charAt(i);
			if(m.containsKey(c)) {
				int n = m.get(s.charAt(i));
				m.put(c,++n);
			}else {
				m.put(c, 1);
			}
		}
		
		m.keySet().forEach(e ->System.out.println(e + " : "+ m.get(e)));
	}

}
