package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*int[] array = new int[4];
		for(int x:array) {
			System.out.println(x);	
		}
		//問題１　　0,0,0,0
		*/
		
		
		/*int[] array = new int[] {5, 6};
		System.out.println(array.length);
		for(int i =0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		System.out.println(Arrays.toString(array));	
		//問題２　　5,6
		*/
		
		
		/*int[][] array = new int[2][3]; 
		System.out.println(array.length);
		for (int i = 0; i < array.length; i++) {
		    for (int j = 0; j < array[i].length; j++) {
		        System.out.print(array[i][j] + " ");
		    }
		    System.out.println();
		}
		//問題３   0 0 0 
		          0 0 0 
		 */
		
		
		/*int [][]array2d = new int [4][2];
		for (int []out : array2d) {
			for (int inner : out) {
				System.out.println(inner);
			}
		}
		//問題４　array2dは４行２列の次元配列を指定します。
			     array2dの各行を印刷する
			     印刷された各行の各要素を印刷する
			     これを繰り返す
			     プットアウトするのは各行の各要素である。
			     つまり、４行２列の次元配列の八つの要素を一つづつプットアウトする
		*/
		
		
		/*int[]array = new int [] {1,3,5,7,100,0,1};
		int min = array[0];
		int max = array[0];
		for(int i=0; i<array.length; i++) {
			if(min > array[i]) {
				min = array[i];
			}else if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("最小値："+min);
		System.out.println("最大値："+max);
		//問題５　上に示している
		 */
		
		/*int[] array = new int[4];
		int sum = 0;
		for(int x : array){
			sum = sum + x;
		}
		System.out.println(sum);
		//問題６　　上に示している
		 */
		
		
		   // 行列Aの定義
		int[][] matrixA = {
			{1, 7},
			{6, 4},
			{5, 9}
		};
		
		// 行列Bの定義
		int[][] matrixB = {
			{1, 4},
			{8, 5},
			{5, 2}
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
