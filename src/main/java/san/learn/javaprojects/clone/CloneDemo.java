package san.learn.javaprojects.clone;

import javax.swing.plaf.metal.MetalIconFactory.PaletteCloseIcon;

public class CloneDemo {

	
	public static void main(String[] args) {
		Student s  = new Student();
		
		s.setEnroll(3);
		
		
		
	}
}
 

class Student{
	int enroll;

	public int getEnroll() {
		return enroll;
	}

	public void setEnroll(int enroll) {
		this.enroll = enroll;
	}

	@Override
	public String toString() {
		return "Student [enroll=" + enroll + "]";
	}
	
	
}