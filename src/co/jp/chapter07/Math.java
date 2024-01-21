package co.jp.chapter07;

public class Math {
	
	public static int max(int[]array) {
		int max = array[0];
			
		for(int i=1;i<array.length;i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
	
	public static int min(int[]array) {
		int min = array[0];
		
		for(int i=1;i<array.length;i++) {
			if (array[i]<min) {
				min = array[i];
			}
		}
		return min;
	}
		
	public static double ave(int[]array) {
		double ave = array[0];
		double sum = 0;
		for(int num : array) {
			sum += num; 
			ave = sum/array.length;
			}
		return ave;
	}
	
	
}

