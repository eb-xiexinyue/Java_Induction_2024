package co.jp.chapter04;

import java.util.Arrays;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//問題１:int[] array = new int[4]; 各要素の値を記載してください。
		//回答　:[0, 0, 0, 0]
		int[] array1 = new int[4];
		System.out.println(Arrays.toString(array1));
		
		
		//問題２:int[] array = new int[] {5, 6}; 各要素の値を記載してください。
		//回答　:[5, 6]
		int[] array2 = new int[] {5, 6};
		System.out.println(Arrays.toString(array2));
		
		
		//問題３:int[][] array = new int[2][3]; 各要素の値を記載してください
		//回答　:
		int[][] array3 = new int[2][3];
		for(int[] arr:array3) {
			System.out.println(Arrays.toString(arr));
		}
		
		
		//問題４︓以下２重Foreachを理解してください。
		//1 int[][] array2d = new int[4][2];
		//2 for (int[] out : array2d) {
		//3    for (int inner : out) {
		//4	      System.out.println(inner);
		//5	   }
		//6 }
		//回答　:		
		int[][] array2d = new int[4][2];
		for (int[] out : array2d) {
		//	System.out.println(Arrays.toString(out));
			 for (int inner : out) {
			 System.out.println(inner);
			 }
		}
		
		
		//問題５:int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最⼤値と最⼩桁値をSystem.out.println()。
		//回答　:
		int[] array5 = new int[] {1, 3, 5, 7, 100, 0, 1}; 
		//System.out.println(Arrays.toString(array5));
		
		//最⼤値:
		int max = array5[0];
	
		for(int i=1;i<array5.length;i++) {
			if(array5[i]>max) {
				max = array5[i];
			}
		}
		System.out.println("最⼤値は"+max);
		
		//最⼩値:
		int min = array5[0];
		
		for(int j=1;j<array5.length;j++) {
			if(array5[j]<min) {
				min = array5[j];
			}
		}
		System.out.println("最小値は"+min);
		
		
		//問題６:問題１の配列のSUMを求める。
		//回答　:
		int sum = array1[0];
		for (int z=1;z<array1.length;z++) {
			
			sum = sum+array1[z];
		}
		System.out.println(sum);
		
//		int sum5 = array5[0];
//		for (int z=1;z<array5.length;z++) {
//			sum5 = sum5+array5[z];
//		}
//		System.out.println(sum5);
		
		
		//問題７:⾏列（２次元配列）の和と積を計算してください。
		//回答　:
		int[][] matrix = {
				{1, 2},
				{3, 4},
		};
		
		int sum7 = calculateSum(matrix);
		int multiply7 = calculateMultiply(matrix);
		System.out.println("⾏列（２次元配列）の和は"+sum7);
		System.out.println("⾏列（２次元配列）の積は"+multiply7);
		
	}


	public static int calculateMultiply(int[][] matrix) {
		int multiply = 1;
		
		for(int[] row : matrix) {
			for(int num : row) {
				multiply *= num;
			}
		}
		
		return multiply;
	}


	public static int calculateSum(int[][] matrix) {
		int sum = 0;
		
		for(int[] row : matrix) {
			for(int num : row) {
				sum += num;
			}
		}
		
		return sum;	
	}


}