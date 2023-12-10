package co.jp.chapter04;

import java.util.Arrays;

public class JavaChapter04 {

	public static void main(String[] args) {
		
		
		int[] arr = new int[] {1,2,3,4,5,6,7};
		
		for(int i = 0; i<arr.length;i++) {
			System.out.println(arr [i]);
		}
//		for(int x : arr);{
//			System.out.println();
//		}
//			
		
		
		
		
		int [] raw_array = {8,12,4,34,53,64,223,2323};
		System.out.println(Arrays.toString(raw_array));
		
		for (int i=0; i<raw_array. length;i++) {
			for (int j=0; j<raw_array. length;j++) {
				if(i!=j) {
					if(raw_array[i]<raw_array[j]) {
						int temp = raw_array[j];
						raw_array[j] = raw_array[i];
						raw_array[i] = temp;
					}
				}
				
			}
		}
		System.out.println(Arrays.toString(raw_array));
		
		
	}
}
