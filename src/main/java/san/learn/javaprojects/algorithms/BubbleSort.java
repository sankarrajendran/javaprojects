package san.learn.javaprojects.algorithms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
		BubbleSort bs = new BubbleSort();
		bs.bubbleSort(a);
		Arrays.stream(a).forEach(System.out::println);
	}
	
	public void bubbleSort(int arr[]) {
		int n = arr.length;
		int tl = 0;
		for(int i = 0 ; i < n - 1 ; i++) {
			for(int j = 0; j < n - i - 1;j++) {
				if(arr[j] > arr[j + 1]) {
					int t = arr[j];arr[j] = arr[j + 1];arr[j + 1] = t;
				}
				tl++;
			}
		}
		System.out.println(tl);
	}
	
}
