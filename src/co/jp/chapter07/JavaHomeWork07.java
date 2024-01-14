package co.jp.chapter07;
public class JavaHomeWork07 {
//第六回
//	質問７︓以下静的なメソッドを定義してください
//1. メソッド名︓trim
//2. 引数１︓charの配列
//3. 戻り値︓charの配列
//4. 処理内容︓引数１のcharの配列先頭と末尾の空白文字列を削除してください。
//以下メソッドの実施例︓
//		char[] input = new char[] {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '}; // 入力引数
//		メソッドを実施後
//		char[] output = new char[] {'A', 'b', ' ', ' ', 'C'}; // 入力引数		

		class Test1 {

    public static void main(String[] args) {
        char[] input = new char[] {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '};
        char[] output = trim(input);

        // 結果の出力
        System.out.print("入力引数: ");
        printCharArray(input);
        System.out.print("メソッドを実施後: ");
        printCharArray(output);
    }

    static char[] trim(char[] input) {
        int start = 0;
        int end = input.length - 1;

        // 先頭の空白を削除
        while (start <= end && Character.isWhitespace(input[start])) {
            start++;
        }

        // 末尾の空白を削除
        while (end >= start && Character.isWhitespace(input[end])) {
            end--;
        }

        
        char[] result = new char[end - start + 1];
        System.arraycopy(input, start, result, 0, result.length);

        return result;
    }

    // charの配列を出力するユーティリティメソッド
    static void printCharArray(char[] arr) {
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
		
		
//	質問８︓バブルソート⽤メソッドを作成してください。
//1. メソッド名︓bubbleSort
//2. 引数１︓intの配列
//3. 戻り値︓ソート済みの配列
//4. 処理内容︓bubbleSortアルゴリズムを⽤い、入力した引数の配列をソートしてください。		
	class Test2 {

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        
        // ソート前の配列を表示
        System.out.println("ソート前の配列:");
        printArray(array);

        // バブルソートを実行
        int[] sortedArray = bubbleSort(array);

        // ソート後の配列を表示
        System.out.println("ソート後の配列:");
        printArray(sortedArray);
    }

    static int[] bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    // 隣り合う要素が逆順なら入れ替える
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);

        return array;
    }

    // 配列を表示するユーティリティメソッド
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    
    
//第7回
//質問１︓ペットクラスを定義してください。
//ペットクラスは名称と年齢を保有して。以下２インスタンスを作成してください。
//変数１︓cat , 変数２︓dog。catの名称は ”cat”, 年齢=2, dogの名称は ”dog”, 年齢=5。
//1. クラスを定義する。クラス名は Pet。
//2. 該当クラスに、「名称」「年齢」属性が保有しています。
//3. Petクラスをインスタンス化する。以下２つオブジェクトを作成してください。
//4. オブジェクト１︓変数名 = cat。名称 = “cat“, 年齢 = 2。
//5. オブジェクト２︓変数名 = dog。名称 = “dog“, 年齢 = 5。		
//

	class Pet {
    // プロパティ
    private String name;
    private int age;

    // コンストラクタ
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // ゲッターメソッド
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Petクラスをインスタンス化してオブジェクトを作成
        Pet cat = new Pet("cat", 2);
        Pet dog = new Pet("dog", 5);

        // オブジェクトの情報を表示
        System.out.println("Catの情報:");
        System.out.println("名称: " + cat.getName());
        System.out.println("年齢: " + cat.getAge());

        System.out.println();

        System.out.println("Dogの情報:");
        System.out.println("名称: " + dog.getName());
        System.out.println("年齢: " + dog.getAge());
    	}
	}
    }
}	
				
	
//質問2︓以下コードのコンパイルエラー理由を教えてください。 
//    // Pet.java
//public class Pet {
//public String name;
//public void setName(String value) {
//this.name = value;
//}
//}
//// Kicker.java
//public class Kicker {
//public static void main(String...args) {
//Pet cat = new Pet();
//cat.setAge(1234);
//}
//回答：Pet クラスに setAge メソッドが定義されていない。
//    public void setAge(int age) {
//       this.age = age;
   

//Mathクラスを作成してください。以下メソッドを定義します。
//1. 配列のMAXを求める静的メソッドを定義。（引数は int 配列）
//2. 配列のMINを求める静的メソッドを定義。（引数は int 配列）
//3. 配列の平均値を求める静的メソッドを定義。（引数は int 配列）
//4. mainメソッドで上記それぞれメソッドを呼び出してください。
//以下はメソッドの定義のソースの抜枠です。
//public class Math {
//public static int max(int[] input) {
//...
//	}
//}
//  
// 回答：
	class Math {

    // 配列の最大値を求める静的メソッド
    public static int max(int[] input) {
        if (input == null || input.length == 0) {
            throw new IllegalArgumentException("配列が空です。");
        }

        int max = input[0];
        for (int num : input) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // 配列の最小値を求める静的メソッド
    public static int min(int[] input) {
        if (input == null || input.length == 0) {
            throw new IllegalArgumentException("配列が空です。");
        }

        int min = input[0];
        for (int num : input) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // 配列の平均値を求める静的メソッド
    public static double average(int[] input) {
        if (input == null || input.length == 0) {
            throw new IllegalArgumentException("配列が空です。");
        }

        int sum = 0;
        for (int num : input) {
            sum += num;
        }

        return (double) sum / input.length;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};

        // 最大値を求めるメソッドを呼び出し
        int maxResult = max(numbers);
        System.out.println("配列の最大値: " + maxResult);

        // 最小値を求めるメソッドを呼び出し
        int minResult = min(numbers);
        System.out.println("配列の最小値: " + minResult);

        // 平均値を求めるメソッドを呼び出し
        double averageResult = average(numbers);
        System.out.println("配列の平均値: " + averageResult);
    }
}
   
// 行列計算。2D行列クラスのコンストラクタには１配列引数設定してください。
//	public class Matrix {
//	private final int[][] data;
//	/** construct method */
//	public Matrix(int[][] data) {
//	this.data = data;
//	}
//	// 行列 ADD
//	public Matrix add(Matrix b) {
//	//....
//	return ???
//	}
//}
//	回答：
	public class Matrix {
    private final int[][] data;

    /** Construct method */
    public Matrix(int[][] data) {
        this.data = data;
    }

    // 行列 ADD
    public Matrix add(Matrix b) {
        if (b == null || b.data.length != data.length || b.data[0].length != data[0].length) {
            throw new IllegalArgumentException("行列のサイズが異なります。");
        }

        int rows = data.length;
        int columns = data[0].length;
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = data[i][j] + b.data[i][j];
            }
        }

        return new Matrix(result);
    }

    // 行列を表示するメソッド
    public void printMatrix() {
        for (int[] row : data) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrixData1 = { };

        int[][] matrixData2 = { };

        Matrix matrix1 = new Matrix(matrixData1);
        Matrix matrix2 = new Matrix(matrixData2);

        System.out.println("Matrix1:");
        matrix1.printMatrix();

        System.out.println("Matrix2:");
        matrix2.printMatrix();

        // 行列の加算
        Matrix resultMatrix = matrix1.add(matrix2);
        System.out.println("Matrix1 + Matrix2:");
        resultMatrix.printMatrix();
    }
}

	
    



