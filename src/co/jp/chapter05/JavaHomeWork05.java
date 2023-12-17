package co.jp.chapter05;

import java.util.Arrays;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//質問１
		/* int Sum = 0;
		 for (int i = 1; i <= 100; i++) {
			 if (i % 2 == 0) {
				 Sum = Sum + i;
			 }
		 }
		 System.out.println("1から100までの偶数の和: " + Sum);
		 */
		 //質問２
		 /*int x = 1;
		 for (int i = 1; i < 6; i++) {
			 x = x* i;
		 }
		 System.out.println("5の階乗: " + x);
		 */
		 //質問３
		 int[] array = {1, 2, 6, 7, 9, 6, 2, 1};
		 int min = array[0];
		 int max = array[0];
		 int sum = 0;
		 double average;
			for(int i=0; i<array.length; i++) {
				if(min > array[i]) {
					min = array[i];
				}else if (max < array[i]) {
					max = array[i];
				}
			}
			for (int arr:array) {
				sum = sum + arr;
			}
			average = (double) sum / array.length;
			System.out.println("最小値："+min);
			System.out.println("最大値："+max);
			System.out.println("和： " + sum);
			System.out.println("平均値： " + average);
			
		
		//質問４
		 boolean hasDuplicates = false;
		 for (int i = 0; i < array.length - 1; i++) {
			 for (int j = i + 1; j < array.length; j++) {
				 if (array[i] == array[j]) {
					 hasDuplicates = true;
					 break;
				 }
			 }
		 }
		 if (hasDuplicates) {
			 System.out.println("配列に重複する要素が存在します");
			 
		 } else {
			 System.out.println("配列に重複する要素はありません");
		 }
		 //質問５
		 int target = 7;
		 int index = -1;
		 for (int i = 0; i < array.length; i++) {
			 if (array[i] == target) {
				 index = i;
				 break;
			 }
		 }
		 if (index != -1) {
			 System.out.println("値「" + target + "」のインデックス： " + index);
			 
		 } else {
			 System.out.println("値「" + target + "」は配列内に存在しません");
		 }
		 
		 //質問６
		 int[][] matrixA = {
					{1, 7},
					{6, 4},
					{5, 9}
				};
		 int[][] matrixB = {
					{1, 4},
					{8, 5},
					{5, 2}
				};
		 int[][] productMatrix = multiplyMatrices(matrixA, matrixB);
		 System.out.println("積:");
			printMatrix(productMatrix);}
			private static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
				int rowsA = matrixA.length;
				int colsA = matrixA[0].length;
				int colsB = matrixB[0].length;
				int[][] result = new int[rowsA][colsB];

				for (int i = 0; i < rowsA; i++) {
					for (int j = 0; j < colsB; j++) {
						for (int k = 0; k < colsA; k++) {
							result[i][j] += matrixA[i][k] * matrixB[k][j];
						}
					}
				}

				return result;
			}
			private static void printMatrix(int[][] matrix) {
				for (int[] row : matrix) {
					for (int elem : row) {
						System.out.print(elem + " ");
					}
					System.out.println();
				}
				System.out.println();
				
				
				//質問７
				int []arr = {9,5,4,7,6,3,2};
				for(int i = 0;i<arr.length;i++) {
					for(int j = 0;j<arr.length;j++) {
						if(i!=j) {
							if(arr[i]<arr[j]) {
								int temp = arr[j];
								arr[j] = arr[i];
								arr[i] = temp;
							}
						}
					}
				}
				System.out.println(Arrays.toString(arr));
				
				
				//質問８

						int rows = 10;
						int [][]triangle = new int [rows][];
						for(int i=0;i<rows;i++) {
							triangle [i] = new int [i +1];
							triangle[i][0] = 1;
							triangle[i][i] = 1;
							
							for(int j=1;j<i;j++) {
								triangle[i][j]=triangle [i-1][j-1] + triangle [i-1][j]; 
							}
						}
						for(int i = 0; i<rows;i++) {
							for(int j=0; j<=i;j++) {
								System.out.print(triangle[i][j] + " ");
							}
							System.out.println();
						}
					}
				
	}

