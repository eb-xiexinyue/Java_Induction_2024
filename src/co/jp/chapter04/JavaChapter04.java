package co.jp.chapter04;

import java.util.Arrays;

public class JavaChapter04 {

	public static void main(String[] args) {
		
		
		//长度为10的数组
//		int[] array = new int[10];
//		
//		char[] char_array = new char[10];
//		
//		double[] double_array = new double[10];
//		
//		boolean[] boolean_array = new boolean[10];
//		
//		//长度为10的数组,赋予初期值
//		int[] array1 = new int[]{1,2,3,4,5,6,7,8,9,10};
//		
//		System.out.println(Arrays.toString(array));
//		
//		System.out.println(Arrays.toString(char_array));
//		
//		System.out.println(Arrays.toString(double_array));
//		
//		System.out.println(Arrays.toString(boolean_array));
//		
//		System.out.println(Arrays.toString(array1));
//		
//		System.out.println("-----------------------------------");
//		
//		//类的数组
//		
//		String[] str_array = {"a  dasd","abc","abcd","hello","java"};
//		
//		Object[] obj_array = new Object[10];
//		
//		System.out.println(Arrays.toString(str_array));
//		
//		System.out.println(Arrays.toString(obj_array));
//		
////		System.out.println(str_array[0]);
////		
////		System.out.println(str_array[1]);
////		
////		System.out.println(str_array[2]);
//		
//		//ArrayIndexOutOfBoundsException异常
//		//System.out.println(str_array[-1]);
//		
//		System.out.println("str_array の長さは　"+str_array.length);
//		
//		for(int i=0;i<str_array.length;i++) {
//			System.out.println(str_array[i]);
//		}
//		
////		String s = "abcd";
////		
////		System.out.println(s.length());
//		
//		int[]arr = {432,543,11,441,44,114,77};
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//			
//			//arr[7]
//		}
//		
//		System.out.println("for each :");
//		for(int item:arr) {
//			System.out.println(item);
//		}
//		
//		System.out.println("-----------------------");
//		
//		String[] str_array2 = {"a","bc","de","fgh"};
//		
//		System.out.println(Arrays.toString(str_array2));
//		
//		str_array2[2] = "new";
//		
//		System.out.println(Arrays.toString(str_array2));
//		
//		String[] temp_array = new String[5];
//		
//		System.out.println(Arrays.toString(temp_array));
//		
//		for(int i=0;i<str_array2.length;i++) {
//			temp_array[i] = str_array2[i];
//		}
//		
//		System.out.println(Arrays.toString(temp_array));
//		
//		temp_array[4] = "added item";
//		
//		System.out.println(Arrays.toString(temp_array));
//		
////		System.out.println("str_array2: "+Arrays.toString(str_array2));
////		
//		str_array2 = temp_array;
////		
////		System.out.println("str_array2: "+Arrays.toString(str_array2));
//		
//		String[] temp_array2 = new String[3];
//		
//		for(int i=0;i<str_array2.length-1;i++) {
//			//temp_array2[3]
//			temp_array2[i] = str_array2[i+1];
//		}
//		
//		System.out.println("temp_array2: "+Arrays.toString(temp_array2));
		
		//str_array2 = temp_array2;
		
		
		int[] raw_array = {45,2,21,14,13,20,77,53};
		
		System.out.println(Arrays.toString(raw_array));
		
		//Arrays.sort(raw_array);
		
		//System.out.println(Arrays.toString(raw_array));	
		for(int i=0;i<raw_array.length;i++) {
			for(int j=0;j<raw_array.length;j++) {
				if(i!=j) {
					if(raw_array[i]<raw_array[j]) {
						//System.out.println(Arrays.toString(raw_array));
						//System.out.println("Swap raw_array["+i+"] and raw_array["+j+"]");
						int temp = raw_array[j];
						raw_array[j] = raw_array[i];
						raw_array[i] = temp;
					}
				}
			}
		}	
		
		System.out.println(Arrays.toString(raw_array));
		
		int[][] multi_array = {
				{2},
				{2,3},
				{2,3,5},
				{2,3,5,6}
		};
		
		System.out.println(Arrays.toString(multi_array));
		
		for(int[] arr:multi_array) {
			System.out.println(Arrays.toString(arr));
		}
		
		for(int i=0;i<multi_array.length;i++) {
			for(int j=0;j<multi_array[i].length;j++) {
				System.out.print(multi_array[i][j]);
			}
			System.out.println();
		}
	}

}
