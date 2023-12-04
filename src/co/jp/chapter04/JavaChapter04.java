package co.jp.chapter04;

import java.util.Arrays;

public class JavaChapter04 {

	public static void main(String[] args) {
//
//		int [] arr = {432,543,11,441,44,114,77};
//		for(int i=0;i<arr.length;i++) {
//		
//		System.out.println(arr[i]);
//		}
//		
		int[] temp_array = {56,89,99,34,76,23,11,8};
		
		System.out.println(Arrays.toString(temp_array));
		
		for (int i=0;i<temp_array.length;i++) {
			for(int j=0;j<temp_array.length;j++) {
				if(i!=j) {
					if(temp_array[i]<temp_array[j]) {
//						System.out.println(Arrays.toString(temp_array));
						int temp = temp_array[j];
						temp_array[j]=temp_array[i];
						temp_array[i]=temp;
					}
				}
			}
		}
		
		
		System.out.println(Arrays.toString(temp_array));
		
	}
}
	
		
