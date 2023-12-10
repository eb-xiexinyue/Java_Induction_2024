package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}
}
//④配列
//問題1　
//int[] array = new int[4];
//array[0] = 10;
//array[1] = 20;
//array[2] = 30;
//array[3] = 40;

//問題2
//array[0] = 5;
//array[1] = 6;

//問題3
//int[][] array = new int[2][3];
//array[0][0] = 1;
//array[0][1] = 2;
//array[0][2] = 3;
//array[1][] = 4;
//array[1][1] = 5;
//array[1][2] = 6;
//1 2 3
//4 5 6 

//問題4
//1   int [] [] array2d = new int [4] [2] ;
//2次元の’int’型配列’array2d’を4行2列で初期化する
//2   for (int[] out : array2d)
//外側の拡張forループではarray2dの各行を表す1次元の配列outを取得している
//3   for (int inner : out)
//内側の拡張forループでは、外側のループで取得した各行outの要素を一つずつ取得している
//4   System.out.println(inner);
//内側のループで取得した各要素inner を標準出力に出力する
//したがって、このコードはarray2dの各要素を順に取り出して標準出力にするもので、行ごとに要素を表示する。
//この場合、arrat2dの要素は4行2列の行列であり、各要素は0で初期化されているため、実行すると0が順に表示される。

//問題5
//int[] array = new int[] {1, 3, 5, 7, 100, 0, 1};

//int max = array[0];
//int min = array[0];

//for (int i = 1; i < array.length; i++) {
// if (array[i] > max) {
//     max = array[i];
// }
// if (array[i] < min) {
//     min = array[i];
// }
//}
//System.out.println("最大値: " + max);
//System.out.println("最小値: " + min);
//結果として、最大値100　最小値0となる

//問題6
//int[] array = new int[4];
//（例として1, 2, 3, 4を代入）
//array[0] = 1;
//array[1] = 2;
//array[2] = 3;
//array[3] = 4;

//int sum = 0;


//for (int i = 0; i < array.length; i++) {
// sum += array[i];
//}
//System.out.println("配列の合計: " + sum);

//問題7
//行列の和
//public class MatrixOperations {
//    public static void main(String[] args) {
//        int[][] matrixA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int[][] matrixB = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

//        int[][] sumMatrix = addMatrices(matrixA, matrixB);

//        System.out.println("行列の和:");
//        printMatrix(sumMatrix);
//    }

//  public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
//      int rows = matrixA.length;
//      int cols = matrixA[0].length;
//      int[][] result = new int[rows][cols];

//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                result[i][j] = matrixA[i][j] + matrixB[i][j];
//            }
//        }

//        return result;
//    }

    // 行列を表示するメソッド
//    public static void printMatrix(int[][] matrix) {
//        for (int[] row : matrix) {
//            for (int elem : row) {
//                System.out.print(elem + " ");
//           }
//            System.out.println();
//        }
//    }
//}

//行列の積
//public class MatrixOperations {
//    public static void main(String[] args) {
//        int[][] matrixA = {{1, 2, 3}, {4, 5, 6}};
//        int[][] matrixB = {{7, 8}, {9, 10}, {11, 12}};

//        int[][] productMatrix = multiplyMatrices(matrixA, matrixB);

        // 結果を表示
//        System.out.println("行列の積:");
//        printMatrix(productMatrix);
//    }

// 行列の積を計算するメソッド
//    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
//        int rowsA = matrixA.length;
//        int colsA = matrixA[0].length;
//        int colsB = matrixB[0].length;

//        int[][] result = new int[rowsA][colsB];

//        for (int i = 0; i < rowsA; i++) {
//            for (int j = 0; j < colsB; j++) {
//                for (int k = 0; k < colsA; k++) {
//                    result[i][j] += matrixA[i][k] * matrixB[k][j];
//                }
//            }
//        }

//        return result;
//    }

// 行列を表示するメソッド
//    public static void printMatrix(int[][] matrix) {
//        for (int[] row : matrix) {
//            for (int elem : row) {
//            System.out.print(elem + " ");
//        }
//            System.out.println();
//       }
//    }
//}
    
// ⑤新米8問
//設問1 
 //public class EvenSum {
 //public static void main(String[] args) {
     
//     int evenSum = 0;

//     for (int i = 1; i <= 100; i++) {
         
//         if (i % 2 == 0) {
            
//          evenSum += i;
//         }
//     }


//     System.out.println("1から100までの偶数の和: " + evenSum);
// }
//}
//設問2
//public class Factorial {
//    public static void main(String[] args) {
        
//        int n = 5;

//        int factorial = 1;

//        for (int i = 1; i <= n; i++) {
//            factorial *= i;/
//        }

//        System.out.println(n + "の階乗: " + factorial);
//    }
//}
//質問3
//public class ArrayStats {
//    public static void main(String[] args) {
        
//        int[] array = {1, 2, 6, 7, 9, 6, 2, 1};

//        int max = array[0];
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] > max) {
//                max = array[i];
//            }
//        }

//        int min = array[0];
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] < min) {
//                min = array[i];
//            }
//        }

//        int sum = 0;
//        for (int value : array) {
//            sum += value;
//        }

//        double average = (double) sum / array.length;

//        System.out.println("最大値: " + max);
//        System.out.println("最小値: " + min);
//       System.out.println("和: " + sum);
//        System.out.println("平均値: " + average);
//    }
//}
//質問4
import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 6, 7, 9, 6, 2, 1};

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int element : array) {
            if (!set.add(element)) {
      
                duplicates.add(element);
            }
        }

        System.out.println("重複する要素: " + duplicates);
    }
}
//質問5
public class FindIndex {
    public static void main(String[] args) {
        
        int[] array = {1, 2, 6, 7, 9, 6, 2, 1};
        
        int targetValue = 7;

        int index = -1;

       for (int i = 0; i < array.length; i++) {
            if (array[i] == targetValue) {
                index = i;
                break;  // 値が見つかったらループを終了
            }
        }

        
        if (index != -1) {
            System.out.println("値 " + targetValue + " のインデックス: " + index);
        } else {
            System.out.println("値 " + targetValue + " は配列内に見つかりませんでした。");
        }
    }
}
//質問6
public class MatrixMultiplication {
    public static void main(String[] args) {
 
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matrixB = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        int[][] resultMatrix = multiplyMatrices(matrixA, matrixB);

        System.out.println("行列A:");
        printMatrix(matrixA);

        System.out.println("\n行列B:");
        printMatrix(matrixB);

        System.out.println("\n行列AとBの積:");
        printMatrix(resultMatrix);
    }

    private static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int rowsB = B.length;
        int colsB = B[0].length;

        if (colsA != rowsB) {
            throw new IllegalArgumentException("行列Aの列数と行列Bの行数が一致しません。");
        }

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
//質問7
public class BubbleSort {
    public static void main(String[] args) {

        int[] array = {64, 34, 25, 12, 22, 11, 90};

        sortArray(array);
  
        System.out.println("昇順にソートされた配列:");
        printArray(array);
    }

 
    private static void sortArray(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                // 隣り合う要素を比較して順序が逆であれば交換
                if (arr[j] > arr[j+1]) {
                    // スワップ
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
//質問8
public class PascalTriangle {
    public static void main(String[] args) {
        int levels = 10; 
   
        printPascalTriangle(levels);
    }

   
    private static void printPascalTriangle(int levels) {
       
        int[][] triangle = new int[levels][levels * 2];

        for (int i = 0; i < levels; i++) {
            triangle[i][levels - i] = 1;
            for (int j = 1; j <= i; j++) {
                triangle[i][levels - i + j * 2] = triangle[i - 1][levels - i + (j - 1) * 2] + triangle[i - 1][levels - i + j * 2 - 2];
            }
        }

        for (int i = 0; i < levels; i++) {
          
            for (int j = 0; j < levels - i; j++) {
                System.out.print("   ");
            }

            for (int j = levels - i; j < levels + i * 2; j++) {
                if (triangle[i][j] != 0) {
                    System.out.printf("%6d", triangle[i][j]);
                }
            }

            System.out.println();
        }
    }
}

 

