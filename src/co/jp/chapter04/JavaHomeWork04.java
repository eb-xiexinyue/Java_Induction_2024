package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
     //問題１︓int[] array = new int[4]; 各要素の値を記載してください。
		/*array[0] = 0
          array[1] = 0
          array[2] = 0
          array[3] = 0  */
		
	//問題２︓int[] array = new int[] {5, 6}; 各要素の値を記載してください。
		/* array[0] = 5
           array[1] = 6  */
		
	//問題３︓int[][] array = new int[2][3]; 各要素の値を記載してください。
		
		/*  array[0][0] = 0
            array[0][1] = 0
            array[0][2] = 0
            array[1][0] = 0
            array[1][1] = 0
            array[1][2] = 0  */
		
	//問題４︓以下２重Foreachを理解してください。
		/* int[][] array2d = new int[4][2];
              for (int[] out : array2d) {
             for (int inner : out) {
                 System.out.println(inner);
              }
             }*/
		
	    /*このコードの主な目的は、拡張forループを使用して2次元配列を反復処理し、各要素の値を出力することです。
		外側のループはarray2dの各行（1次元配列）を反復処理し、内側のループは各行の各要素を反復処理します。
		各反復中にinnerは現在の要素の値を表し、System.out.println(inner);を使用してその値を出力します。
		array2dの要素はすべて0で初期化されているため、出力は0が複数列にわたって表示されます。*/
		
	//問題５︓int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最⼤値と最⼩桁値を
	//System.out.println()。
		// 最大値を求める
		/*int max = array[0];
		for (int i = 1; i < array.length; i++) {
		    if (array[i] > max) {
		        max = array[i];
		    }
		}

		// 最小値を求める
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
		    if (array[i] < min) {
		        min = array[i];
		    }
		}

		
		System.out.println("最大値: " + max);
		System.out.println("最小値: " + min);
		*/
		
		//問題６︓問題１の配列のSUMを求める。
		// 合計を求める
		/*int sum = 0;
		for (int i = 0; i < array.length; i++) {
		    sum += array[i];
		}

		// 結果を表示
		System.out.println("配列の合計: " + sum);
		*/
		
		//問題７︓⾏列（２次元配列）の和と積を計算してください。
		 //


  

    /*  public static void main(String[] args) {
      
        int[][] array = {
                {2, 3},
                {4, 5}
        };

       总和
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("Sum of array elements: " + sum);

        总积
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                product *= array[i][j];
            }
               }
        System.out.println("Product of array elements: " + product);
                  }
           }*/ 


		
		
		//WORK 6
		
		//設問１︓1から100までの偶数の和を求める(for + if)。
		/*public class Main {
		    public static void main(String[] args) {
		        int sum = 0;

		        for (int i = 2; i <= 100; i += 2) {
		            sum += i;
		        }

		        System.out.println("1から100までの偶数の和: " + sum);
		    }
		} */
		
		//設問２︓5の階乗を求める(for)。
		/*public class Main {
         public static void main(String[] args) {
        int n = 5;
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("5の階乗: " + factorial);
          }
        }*/
		
		//質問３︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。
		/*public class Main {
         public static void main(String[] args) {
        int[] array = {1, 2, 6, 7, 9, 6, 2, 1};

        // 最大値を求める
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        // 最小値を求める
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        // 和を求める
        int sum = 0;
        for (int a : array) {
            sum += a;
        }

        // 平均値を求める
        double average = (double) sum / array.length;

        // 結果を表示
        System.out.println("最大値: " + max);
        System.out.println("最小値: " + min);
        System.out.println("和: " + sum);
        System.out.println("平均値: " + average);
           }
         }*/
		//質問４︓質問３の配列に重複ある要素を探す（要素の表⽰次数集計必要なし）。
		/*public class Main {
          public static void main(String[] args) {
        int[] array = {1, 2, 6, 7, 9, 6, 2, 1};

        // 重複を検出するためのforループ
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("重複した要素: " + array[i]);
                }
            }
        }
    }
}*/
		//質問５︓質問３の配列に値「７」のインデックスを求む。
		/*public class Main {
         public static void main(String[] args) {
        int[] array = {1, 2, 6, 7, 9, 6, 2, 1};

        int targetValue = 7;
        int index = -1; 

        // 使用for循环查找值为7元素位置
        for (int i = 0; i < array.length; i++) {
            if (array[i] == targetValue) {
                index = i;
                break; 
            }
        }

        // 结果
        if (index != -1) {
            System.out.println("值“7”的索引: " + index);
        } else {
            System.out.println("值“7”在数组中未找到。");
          }
           }
         }*/
		
		//質問６︓任意⾏列（２次元配列）の積を求める。
		/*public class MatrixProduct {
    public static void main(String[] args) {
        // 手动给定两个二次数组
        int[][] matrixA = {
            {1, 2},
            {3, 4}
        };

        int[][] matrixB = {
            {5, 6},
            {7, 8}
        };

        // 声明一个矩阵积
        int[][] productMatrix = multiplyMatrices(matrixA, matrixB);

        System.out.println("矩阵积:");
        printMatrix(productMatrix);
    }

    // 计算矩阵积
    private static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;

        int[][] productMatrix = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    productMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return productMatrix;
    }

    // 打印积后矩阵
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}*/
		//質問７︓配列を昇順でソートする（java.util等メソッド利⽤禁⽌）。
		/*public class SimpleSort {
		    public static void main(String[] args) {
		        int[] array = {5, 2, 9, 1, 5, 6};

		        S_B(array);

		        // 排序后的结果打印
		        for (int num : array) {
		            System.out.print(num + " ");
		        }
		    }

		    
		    private static void S_B(int[] array) {
		        int n = array.length;
		        for (int i = 0; i < n - 1; i++) {
		            for (int j = 0; j < n - 1 - i; j++) {
		                if (array[j] > array[j + 1]) {
		                   
		                    int temp = array[j];
		                    array[j] = array[j + 1];
		                    array[j + 1] = temp;
		                }
		            }
		        }
		    }
		}*/
		質問８︓LV10のパスカルの三⾓形を出⼒してください。
		不会
 	
	
	}
}