package san.learn.javaprojects.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hashing {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		String s = "sankar";
		byte[] bI = s.getBytes();
		byte[] dM = md.digest(bI);
		System.out.println(dM);
		
		System.out.println(md.getProvider());
		System.out.println(Runtime.getRuntime().availableProcessors());
	}

}
