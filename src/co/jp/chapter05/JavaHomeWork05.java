package co.jp.chapter05;

import java.util.Arrays;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//新米８問
		
		//設問１︓1から100までの偶数の和を求める(for + if)。
		 int sum = 0;
		 for (int i = 1; i <= 100; i++) {
			 if (i % 2 == 0) {
				 sum += i;
			 }
		 }
		 System.out.println("1から100までの偶数の和: " + sum);
		 
		 //設問２︓5の階乗を求める(for)。
		 int number = 5;
		 int factorial = 1;
		 for (int i = 1; i <= number; ++i) {
			 factorial *= i;
		 }
		 System.out.println(number + "の階乗は: " + factorial);
		 
		 //質問３︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最大値、最小値、和、平均値を求める。
		 int[] array = {1, 2, 6, 7, 9, 6, 2, 1};
		
		 int maxValue = findMaxValue(array);
		 int minValue = findMinValue(array);
		 int sum１ = calculateSum(array);
		 double average = calculateAverage(array);
		 
		 System.out.println("最大値: " + maxValue);
		 System.out.println("最小値: " + minValue);
		 System.out.println("和: " + sum１);
		 System.out.println("平均値: " + average);
		// 質問４
	        findDuplicates(array);
	        
	    //  質問５
	        int index = findIndex(array, 7);
	        if (index != -1) {
	            System.out.println("値「７」のインデックス: " + index);
	        } else {
	            System.out.println("値「７」は配列に存在しません。");
	        }
	        
	        // 質問６︓任意⾏列（２次元配列）の積を求める。
		     int[][] matrixA = {
	 	            {1, 2},
	 	            {3, 4}
	 	        };

	 	        int[][] matrixB = {
	 	            {5, 6},
	 	            {7, 8}
	 	        };

	 	       
	 	       int[][] resultMatrix = multiplyMatrices(matrixA, matrixB);
	 	     
	 	       System.out.println("行列の積:");
		        printMatrix(resultMatrix);
	}
			//質問３
		 public static int findMaxValue(int[] array) {
			 int maxValue = array[0];
			 for (int i = 1; i < array.length; i++) {
				 if (array[i] > maxValue) {
					 maxValue = array[i];
			 }
		 }
			      return maxValue;
	 }
		
		 public static int findMinValue(int[] array) {
			 int minValue = array[0];
			 for (int i = 1; i < array.length; i++) {
				 if (array[i] < minValue) {
					 minValue = array[i];
			 }
		 }
			      return minValue;
	}
			      
	     public static int calculateSum(int[] array) {
	    	 int sum１ = 0;
	    	 for (int i = 0; i < array.length; i++) {
	    		 sum１ += array[i];
	    	 }
	    	      return sum１;
    }
	    
	     public static double calculateAverage(int[] array) {
	    	 int sum２ = calculateSum(array);
	    	 return (double) sum２ / array.length;
	}
	  
	     // 質問４︓質問３の配列に重複ある要素を探す（要素の表⽰次数集計必要なし）。
	     private static void findDuplicates(final int[] array) {
	    	 System.out.print("重複する要素: ");
	    	 for (int i = 0; i < array.length - 1; i++) {
	    		 for (int j = i + 1; j < array.length; j++) {
	    			 if (array[i] == array[j]) {
	    				 System.out.print(array[i] + " ");
	    				 break;
	    			 }
	    		 }
	    	 }
	     }
	     
	     //質問５︓質問３の配列に値「７」のインデックスを求む。
	     private static int findIndex(int[] array, int targetValue) {
	         for (int i = 0; i < array.length; i++) {
	             if (array[i] == targetValue) {
	                 return i;
	             }
	         }
	                 return -1;
	     }
	  
	     //質問６
            private static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
            int rowsA = matrixA.length;
            int colsA = matrixA[0].length;
            int rowsB = matrixB.length;
            int colsB = matrixB[0].length;
            
            int[][] resultMatrix = new int[rowsA][colsB];
            
            for (int i = 0; i < rowsA; i++) {
            	 for (int j = 0; j < colsB; j++) {
            		 for (int k = 0; k < rowsB; k++) {
            			 resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
            		 }
            	 }
 	        }
                 return resultMatrix;
         }
           private static void printMatrix(int[][] matrix) {
               for (int[] row : matrix) {
                   for (int element : row) {
                       System.out.print(element + " ");
                   }
                   System.out.println();
               }
          
           //質問７︓配列を昇順でソートする（java.util等メソッド利⽤禁⽌）。
               int[] raw_array = {45, 2, 21, 14, 13, 20, 77, 53};

               for (int i = 0; i < raw_array.length; i++) {
                   for (int j = i + 1; j < raw_array.length; j++) {
                       if (raw_array[i] > raw_array[j]) {
                           int temp = raw_array[i];
                           raw_array[i] = raw_array[j];
                           raw_array[j] = temp;
                       }
                   }
               }

               System.out.println(Arrays.toString(raw_array));
            //質問８︓LV10のパスカルの三⾓形を出⼒してください。
               int levels = 10;
               printPascalTriangle(levels);
            }
               public static void printPascalTriangle(int levels) {
            	   for (int i = 0; i < levels; i++) {
            		   for (int j = 0; j < levels - i; j++) {
            			   System.out.print(" ");
            		   }
            		   for (int j = 0; j <= i; j++) {
            			   System.out.print(binomialCoefficient(i, j) + " ");
            		   }
            		        System.out.println();
            	   }
               }

       	 
       	      public static int binomialCoefficient(int n, int k) {
       	        if (k == 0 || k == n) {
       	            return 1;
       	        } else {
       	            return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
       	        }
          }
       }
