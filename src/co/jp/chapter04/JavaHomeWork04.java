package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
      //第四次课课堂练习
//		int[] arr = {11,22,33,44,55,66,77};
//        for(int i =0; i<arr.length;i++){
//        	System.out.println(arr [i]);
//        	
//        } 
		
//		int[] raw_array = {21,2,32,34,45,6,22,7};
//		System.out.println(Arrays.toString(raw_array));
//		
//		 for(int i =0; i<raw_array.length;i++){
//	        	for(int j=0;j<raw_array.length;j++) {
//	        		if(i!=j) {
//	        			if(raw_array[i]<raw_array[j]) {
//	        				int temp = raw_array[j];
//	        				raw_array[j] = raw_array[i];
//	        				raw_array[i] = temp;
//	        			}
//	        			
//	        		}
//	        		
//	        	}
//	        	
//	        } 
//		 
//		 System.out.println(Arrays.toString(raw_array));
			
		//宿題
//		問題１︓int[] array = new int[4]; 各要素の値を記載してください。
		//回答：{0, 0, 0, 0}
	
//		問題２︓int[] array = new int[] {5, 6}; 各要素の値を記載してください。
		//回答：array[0] = 5;array[1] = 6;
		
//		問題３︓int[][] array = new int[2][3]; 各要素の値を記載してください。
		//回答array[0][0] = 0;
//	 	array[0][1] = 0;
//		array[0][2] = 0;
//		array[1][0] = 0;
//		array[1][1] = 0;
//		array[1][2] = 0;

		
//		問題４︓以下２重Foreachを理解してください
//		int[][] array2d = new int[4][2];
//		for (int[] out : array2d) {
//		for (int inner : out) {
//		 System.out.println(inner);
//		 }
//		}
	   //回答：このコードは、2次元配列 array2d を使って2つの拡張forループ（Enhanced for loopまたはforeach loop）を実行しています
		//最初のループでは外部の配列を、二番目のループでは内部の配列の各要素を処理しています。
		//ここでは、array2d は4つの要素を持つ1次元の配列で、それぞれの要素は2つの要素を持つ1次元の配列です。
		//最初のループでは外部の1次元配列にアクセスし、次のループではその内部の1次元配列の各要素にアクセスしています。
		//array2d 内の各要素を順番に取り出し、それぞれの要素内の値を表示します。

//
//		問題５︓int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最⼤値と最⼩桁値を
//		System.out.println()。
//		int[] array = new int[] {1, 3, 5, 7, 100, 0, 1};
//
//		// 最大値と最小値の初期化
//		int max = array[0];
//		int min = array[0];
//
//		// 配列を走査して最大値と最小値を更新
//		for (int i = 1; i < array.length; i++) {
//		    if (array[i] > max) {
//		        max = array[i];
//		    }
//
//		    if (array[i] < min) {
//		        min = array[i];
//		    }
//		}
//
//		// 結果の出力
//		System.out.println("最大値: " + max);
//		System.out.println("最小値: " + min);

		
		
//		問題６︓問題１の配列のSUMを求める。
//		int[] array = new int[4];
//
//		// 各要素を足し合わせて合計を求める
//		int sum = 0;
//		for (int i = 0; i < array.length; i++) {
//		    sum += array[i];
//		}
//
//		// 結果の出力
//		System.out.println("合計: " + sum);

//		問題７︓⾏列（２次元配列）の和と積を計算してください
		
		        // 行列Aの定義
		        int[][] matrixA = {
		            {1, 2, 3},
		            {4, 5, 6},
		            {7, 8, 9}
		        };

		        // 行列Bの定義
		        int[][] matrixB = {
		            {9, 8, 7},
		            {6, 5, 4},
		            {3, 2, 1}
		        };

		        // 和を計算
		        int[][] sumMatrix = addMatrices(matrixA, matrixB);

		        // 積を計算
		        int[][] productMatrix = multiplyMatrices(matrixA, matrixB);

		        // 結果の表示
		        System.out.println("和:");
		        printMatrix(sumMatrix);

		        System.out.println("積:");
		        printMatrix(productMatrix);
		    }

		    // ２つの行列の和を計算するメソッド
		    private static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
		        int rows = matrixA.length;
		        int cols = matrixA[0].length;
		        int[][] result = new int[rows][cols];

		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                result[i][j] = matrixA[i][j] + matrixB[i][j];
		            }
		        }

		        return result;
		    }

		    // ２つの行列の積を計算するメソッド
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

		    // 行列を表示するメソッド
		    private static void printMatrix(int[][] matrix) {
		        for (int[] row : matrix) {
		            for (int elem : row) {
		                System.out.print(elem + " ");
		            }
		            System.out.println();
		        }
		        System.out.println();
		    }
		

		
		
	}
