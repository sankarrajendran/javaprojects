package san.learn.javaprojects.syntax;

public class AssertDemo {

	public static void main(String[] args) {
		int[] sticks = {3,9,2,15,3};
		 int t = -1;
	        int[] hT = new int[3];
	        for(int i = 0 ; i < sticks.length ; i++){
	            for(int j = 0 ; j < sticks.length ; j++){
	            	if(i == j)continue;
	                for(int k = 0 ; k < sticks.length ; k++){
	                    if(j == k || i == k)continue;
	                    int a = sticks[i], b = sticks[j], c = sticks[k]; 
	                    if(a + b > c && a + c > b && b + c > a && t < (a + b + c)){
	                        t = a + b + c;
	                        hT[0] = a ; hT[1] = b; hT[2] = c;
	                    }   
	                }    
	            }
	        }
	        
	     System.out.println(hT[0]+hT[1]+hT[2]);
	}

}
