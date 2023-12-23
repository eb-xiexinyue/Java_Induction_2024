package co.jp.chapter07;

public class JavaHomeWork07 {

}
//質問1
//エラーは、'Pet'クラスに'setAge'メソッドが存在しないためである。具体的には、'Pet'クラスのコードが次のようになっている。
//	public class Pet {
//	public String name;
//
//	public void setName(String value) {
//	this.name = value;
//    }	
// }
//'Pet'クラスには'setAge'メソッドが定義されていないが、'Kicker'クラスの'main'メソッドで次のように呼び出している。
//cat.setAge(1234);
//このため、コンパイラは'setAge'メソッドが見つからないというエラーを出力する。
//このエラーを修正するには、'Pet'クラスに'setAge'メソッドを追加するか、'Kicker'クラスで存在するメソッドを呼び出す部分を修正する必要がある。
//たとえば、'Pet'クラスに'setAge'メソッドを追加する場合は次のようになる。
	public class Pet {
	public String name;
	public int age;  // 新しいフィールドを追加

	public void setName(String value) {
	this.name = value;
	}

    public void setAge(int age) {
       this.age = age;
   }
  }

//質問2
	public class Math {
	    
	    // 配列の最大値を求めるメソッド
	    public static int max(int[] array) {
	        int max = array[0];
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] > max) {
	                max = array[i];
	            }
	        }
	        return max;
	    }

	    // 配列の最小値を求めるメソッド
	    public static int min(int[] array) {
	        int min = array[0];
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] < min) {
	                min = array[i];
	            }
	        }
	        return min;
	    }

	    // 配列の平均値を求めるメソッド
	    public static double average(int[] array) {
	        if (array.length == 0) {
	            return 0.0;
	        }
	        
	        int sum = 0;
	        for (int num : array) {
	            sum += num;
	        }
	        
	        return (double) sum / array.length;
	    }

	    // mainメソッドで上記メソッドを呼び出す
	    public static void main(String[] args) {
	        int[] numbers = {5, 2, 9, 1, 7};

	        // 最大値
	        int maxResult = max(numbers);
	        System.out.println("Max: " + maxResult);

	        // 最小値
	        int minResult = min(numbers);
	        System.out.println("Min: " + minResult);

	        // 平均値
	        double averageResult = average(numbers);
	        System.out.println("Average: " + averageResult);
	    }
	}

//2.
	public class MatrixExample {
	    public static void main(String[] args) {
	        int[][] matrixData1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	        int[][] matrixData2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

	        Matrix matrix1 = new Matrix(matrixData1);
	        Matrix matrix2 = new Matrix(matrixData2);

	        Matrix resultMatrix = matrix1.add(matrix2);

	        // 行列の加算結果を表示
	        for (int[] row : resultMatrix.data) {
	            for (int value : row) {
	                System.out.print(value + " ");
	            }
	            System.out.println();
	        }
	    }
	}



