package san.learn.javaprojects.arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int []a[] = {{1,5,3},{4,8,7},{8,9,1}};
		int nlen = 10;
		int[] nl = new int[nlen];
		for (int i : nl) {
			nl[i] = 0;
		}
		int hA = 0 ;
		for(int i = 0 ; i < a.length;i++) {
			int j = a[i][0]; int k = a[i][1]; int l = a[i][2];
			for(int m = (j - 1) ; m < k ; m++) {
				nl[m] += l ;
				if(hA < nl[m]) hA = nl[m];
			}
		}
		System.out.println(hA);
	}
}
