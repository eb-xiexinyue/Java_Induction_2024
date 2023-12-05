package co.jp.chapter04;

import java.util.Arrays;

public class JavaChapter04 {

	public static void main(String[] args) {
		
		int[] arr= {121,1231,454,4564,46545,32123,8948};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i!=j) {
					if(arr[i]<arr[j]) {
						int temp=arr[j];
						arr[j]=arr[i];
						arr[i]=temp;
					}
						
				}
			}
System.out.println(Arrays.toString(arr));
		}
	}

}
