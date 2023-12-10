package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		設問１︓1から100までの偶数の和を求める(for + if)。
		
		        // 偶数の和を保持する変数
//		        int evenSum = 0;
//
//		        // 1から100までの数を検査
//		        for (int i = 1; i <= 100; i++) {
//		            // 偶数の場合に合計に加える
//		            if (i % 2 == 0) {
//		                evenSum += i;
//		            }
//		        }
//
//		        // 結果の表示
//		        System.out.println("1から100までの偶数の和: " + evenSum);
//		    }
		
		
//		設問２︓5の階乗を求める(for)。
	 // 5の階乗を保持する変数
//    int factorial = 1;
//
//    // 1から5までの整数を掛け合わせる
//    for (int i = 1; i <= 5; i++) {
//        factorial *= i;
//    }
//
//    // 結果の表示
//    System.out.println("5の階乗: " + factorial);
	
//		質問３︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。
		int[] array = {1, 2, 6, 7, 9, 6, 2, 1};
//
//        // 最大値と最小値の初期化
//        int max = array[0];
//        int min = array[0];
//
//        // 和と平均値の初期化
//        int sum = 0;
//        double average;
//
//        // 配列を走査して最大値、最小値、和を求める
//        for (int num : array) {
//            // 最大値の更新
//            if (num > max) {
//                max = num;
//            }
//
//            // 最小値の更新
//            if (num < min) {
//                min = num;
//            }
//
//            // 和の更新
//            sum += num;
//        }
//
//        // 平均値の計算
//        average = (double) sum / array.length;
//
//        // 結果の表示
//        System.out.println("最大値: " + max);
//        System.out.println("最小値: " + min);
//        System.out.println("和: " + sum);
//        System.out.println("平均値: " + average);
    
//		質問４︓質問３の配列に重複ある要素を探す（要素の表⽰次数集計必要なし）。
		 // 重複を検出するフラグ
        boolean hasDuplicates = false;

        // 配列を走査して重複を検出
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    hasDuplicates = true;
                    break;
                }
            }
            if (hasDuplicates) {
                break;
            }
        }

        // 結果の表示
        if (hasDuplicates) {
            System.out.println("配列に重複する要素が存在します。");
        } else {
            System.out.println("配列に重複する要素はありません。");
        }
		
//		質問５︓質問３の配列に値「７」のインデックスを求む。
     // 目的の値
        int targetValue = 7;

        // インデックスを格納する変数
        int index = -1;

        // 配列を走査して目的の値のインデックスを求める
        for (int i = 0; i < array.length; i++) {
            if (array[i] == targetValue) {
                index = i;
                break; // 目的の値が見つかったらループを終了
            }
        }

        // 結果の表示
        if (index != -1) {
            System.out.println("値「" + targetValue + "」のインデックス: " + index);
        } else {
            System.out.println("値「" + targetValue + "」は配列内に存在しません。");
        }
//		質問６︓任意⾏列（２次元配列）の積を求める。
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

        // 積を計算
        int[][] productMatrix = multiplyMatrices(matrixA, matrixB);

        // 結果の表示
        System.out.println("行列A:");
        printMatrix(matrixA);

        System.out.println("行列B:");
        printMatrix(matrixB);

        System.out.println("積:");
        printMatrix(productMatrix);
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
        
        
//		質問７︓配列を昇順でソートする（java.util等メソッド利⽤禁⽌）。
        int[] array = {5, 2, 9, 1, 5, 6};

        // バブルソートで昇順にソート
        sortArray(array);

        // ソート後の結果を表示
        System.out.println("昇順ソート後の配列:");
        printArray(array);
    }

    // バブルソートで昇順にソートするメソッド
    private static void sortArray(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 隣接する要素を比較して交換
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // 配列を表示するメソッド
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        
//		質問８︓LV10のパスカルの三⾓形を出⼒してください
        int numRows = 10; // 行数

        // パスカルの三角形を生成して表示
        generateAndPrintPascalTriangle(numRows);
    }

    // パスカルの三角形を生成して表示するメソッド
    private static void generateAndPrintPascalTriangle(int numRows) {
        for (int i = 0; i < numRows; i++) {
            // スペースを追加して三角形を整列
            for (int j = 0; j < numRows - i; j++) {
                System.out.print("  ");
            }

            // 二項係数を計算して表示
            for (int j = 0; j <= i; j++) {
                System.out.print(binomialCoefficient(i, j) + "   ");
            }

            System.out.println();
        }
    }

    // 二項係数を計算するメソッド
    private static int binomialCoefficient(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    // 階乗を計算するメソッド
    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
		
		
	}
	
}
